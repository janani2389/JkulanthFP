package com.pro.ereader.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pro.ereader.domain.BookDomain;
import com.pro.ereader.domain.UserDomain;
import com.pro.ereader.manager.SearchManager;

@Controller
public class SearchController {
	
	@Autowired
	private SearchManager searchManager;
	
	@RequestMapping(value = "searchBook.htm", method = RequestMethod.GET)
	public String loadSearchPage(HttpServletRequest req, HttpServletResponse res, ModelMap uimap){					
		System.out.println("inside search");	
		return "SearchBook";
	} 
	
	@RequestMapping(value = "searchBook.htm", method = RequestMethod.POST)
	public String processSearchPage(HttpServletRequest req, HttpServletResponse res, ModelMap uimap,
			@RequestParam(value = "title", required=false ) String title){	
		
		List<BookDomain> bookList = searchManager.getAllAvailableBookByTitle(title);
		uimap.addAttribute("bookList", bookList);
		
		return "SearchBookResult";
	} 
	
	@RequestMapping(value = "borrowBook.htm", method = RequestMethod.POST)
	public String processBorrowBook(HttpServletRequest req, HttpServletResponse res, ModelMap uimap,
			HttpSession session,
			@RequestParam(value = "bookId", required=false ) Integer bookId){	
		
		UserDomain currentUser = (UserDomain) session.getAttribute("currentUser");
		System.out.println("borrowBook"+bookId);
		
		searchManager.borrowBookForUser(currentUser, bookId);		
		
		return "redirect:myBooks.htm?userId="+currentUser.getUserId();
	} 


}
