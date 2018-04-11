package com.pro.ereader.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pro.ereader.domain.UserBookTxnDomain;
import com.pro.ereader.domain.UserDomain;
import com.pro.ereader.manager.UserManager;

@Controller
public class EreaderController {
	
	@Autowired
	private UserManager UserManager;

	
	@RequestMapping(value = "addUsers.htm", method = RequestMethod.GET)
	public String ereaderCreatePage(HttpServletRequest req, HttpServletResponse res, ModelMap uimap,
			@RequestParam(value = "addEreader", required = false) String addReader){
					
		System.out.println("inside erader");	
		return "CreateEreader";
	} 
	
	@RequestMapping(value = "addUsers.htm", method = RequestMethod.POST)
	public String processCreatePage(HttpServletRequest req, HttpServletResponse res, ModelMap uimap,
			@ModelAttribute("userDomain") UserDomain userDomain){
				
		System.out.println(userDomain.getUserName());
		System.out.println("inside process");
		
		UserManager.addUser(userDomain);
		
		return "redirect:viewUser.htm";
	} 
	
	
	
  @RequestMapping(value = "viewUser.htm", method = RequestMethod.GET)
	public String ereaderViewPage(HttpServletRequest req, HttpServletResponse res, ModelMap uimap){
		
	  	List<UserDomain> userList = UserManager.getAllUsers();
	  	uimap.addAttribute("userList", userList);		
		return "ViewReader";
	} 
  
  @RequestMapping(value = "editUser.htm", method = RequestMethod.GET)
 	public String ereaderEditPage(HttpServletRequest req, HttpServletResponse res, ModelMap uimap,
 			@RequestParam(value = "userId", required=false ) String userId){
 		
 	  	UserDomain user = UserManager.getUserByUserId(Integer.parseInt(userId));
 	  	uimap.addAttribute("user", user);		
 		return "EditEreader";
 	} 
  
  @RequestMapping(value = "editUser.htm", method = RequestMethod.POST)
	public String ereaderEditPage(HttpServletRequest req, HttpServletResponse res, ModelMap uimap,
			@ModelAttribute UserDomain userDomain){		
	  	UserManager.updateUser(userDomain);
		return "redirect:viewUser.htm";
	} 
  
  @RequestMapping(value = "deleteUser.htm", method = RequestMethod.GET)
	public String ereaderDeletePage(HttpServletRequest req, HttpServletResponse res, ModelMap uimap,
			@RequestParam(value = "userId", required=false ) String userId){
		
	  	UserManager.deleteUser(Integer.parseInt(userId));
		return "redirect:viewUser.htm";
	} 
  
  
  	@RequestMapping(value = "myBooks.htm", method = RequestMethod.GET)
 	public String displayMyBooks(HttpServletRequest req, HttpServletResponse res, ModelMap uimap, HttpSession session){
  		
  		UserDomain currentUser = (UserDomain) session.getAttribute("currentUser");
  		System.out.println("current :" +currentUser);
  		
  		System.out.println(currentUser.getUserId());
 		
  		List<UserBookTxnDomain> myBooks =  UserManager.getBookTxnByUserId(currentUser.getUserId());
  		uimap.addAttribute("myBooks", myBooks);
  		
 		return "ViewMyBooks";
 	} 
   
   
  
}
