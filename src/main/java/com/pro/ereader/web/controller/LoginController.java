package com.pro.ereader.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pro.ereader.domain.UserDomain;
import com.pro.ereader.manager.UserManager;

@Controller
public class LoginController {
	
	@Autowired
	private UserManager userManager;
	
	@RequestMapping(value = "doLogin.htm", method = RequestMethod.POST)
	public String processLogin(HttpServletRequest req, HttpServletResponse res, ModelMap uimap,
			HttpSession session,
			@RequestParam(value = "userName") String userName,
			@RequestParam(value = "password") String password){
					
		UserDomain user = userManager.getUserByUserName(userName);
		
		session.setAttribute("currentUser", user);
		
		if(user == null || !user.getPassword().equals(password)){
			//return to login page
		}
			
		return "redirect:home.htm?userName="+userName;
	} 
	 @RequestMapping("user")  
	 public String geUserPage() {  
	  return "user";  
	 }  
	  
	 @RequestMapping("admin")  
	 public String geAdminPage() {  
		 System.out.println("inside admin");
	  return "admin"; 
	 
	 }  
	
	@RequestMapping(value = "home.htm", method = RequestMethod.GET)
	public String processLogin(HttpServletRequest req, HttpServletResponse res, ModelMap uimap){				
	
		return "Landing";
	} 
	
	@RequestMapping(value = "logout.htm", method = RequestMethod.GET)
	public String processLogin(HttpServletRequest req, HttpServletResponse res, ModelMap uimap,
			HttpSession session){
					
		session.invalidate();
			
		return "Landing";
	} 

}
