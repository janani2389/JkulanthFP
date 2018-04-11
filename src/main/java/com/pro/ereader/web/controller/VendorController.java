package com.pro.ereader.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.pro.ereader.domain.BookDomain;
import com.pro.ereader.domain.BookPurchaseFormDomain;
import com.pro.ereader.domain.UserDomain;
import com.pro.ereader.domain.VendorDomain;
import com.pro.ereader.domain.VendorPurchaseDomain;
import com.pro.ereader.manager.VendorManager;

@Controller
public class VendorController {
	
	@Autowired
	VendorManager vendorManager;
	
	@RequestMapping(value = "createVendor.htm", method = RequestMethod.GET)
	public String ereaderCreatePage(HttpServletRequest req, HttpServletResponse res, ModelMap uimap,
			@RequestParam(value = "createVendor", required = false) String addReader){
					
		System.out.println("inside vendor");	
		return "CreateVendor";
	} 
	
	@RequestMapping(value = "addVendor.htm", method = RequestMethod.POST)
	public String processCreatePage(HttpServletRequest req, HttpServletResponse res, ModelMap uimap,
			@ModelAttribute("vendorDomain") VendorDomain vendorDomain){
			System.out.println("inside add vendor");	
						
		vendorManager.addVendor(vendorDomain);
		
		return "redirect:viewVendor.htm";
	} 
	 @RequestMapping(value = "viewVendor.htm", method = RequestMethod.GET)
		public String ereaderViewPage(HttpServletRequest req, HttpServletResponse res, ModelMap uimap){
			
		  	List<VendorDomain> vendorList = vendorManager.getAllVendors();
		  	
		  	System.out.println("list size:"+vendorList.size());
		  	uimap.addAttribute("vendorList", vendorList);		
			return "ViewVendor";
		} 
	 @RequestMapping(value = "editVendor.htm", method = RequestMethod.GET)
	 	public String ereaderEditPage(HttpServletRequest req, HttpServletResponse res, ModelMap uimap,
	 			@RequestParam(value = "vendorId", required=false ) String vendorId){
	 		
	 	  	VendorDomain vendor = vendorManager.getVendorByVendorId(Integer.parseInt(vendorId));
	 	  	uimap.addAttribute("vendor", vendor);		
	 		return "EditVendor";
	 	} 

	 @RequestMapping(value = "editVendor.htm", method = RequestMethod.POST)
		public String ereaderEditPage(HttpServletRequest req, HttpServletResponse res, ModelMap uimap,
				@ModelAttribute VendorDomain vendorDomain){		
		 vendorManager.updateVendor(vendorDomain);;
			return "redirect:viewVendor.htm";
		} 
	 
	 @RequestMapping(value = "deleteVendor.htm", method = RequestMethod.GET)
		public String ereaderDeletePage(HttpServletRequest req, HttpServletResponse res, ModelMap uimap,
				@RequestParam(value = "vendorId", required=false ) String vendorId){
			
		 vendorManager.deleteVendor(Integer.parseInt(vendorId));
			return "redirect:viewVendor.htm";
		} 
	  
	 @RequestMapping(value = "createOrder.htm", method = RequestMethod.GET)
		public String purchaseCreatePage(HttpServletRequest req, HttpServletResponse res, ModelMap uimap){
						
			List<VendorDomain> vendorList = vendorManager.getAllVendors();
			uimap.addAttribute("vendorList", vendorList);		
			
			return "AddBookOrder";
		} 
		
		
		@RequestMapping(value = "createOrder.htm", method = RequestMethod.POST)
		public String purchaseProcessPage(HttpServletRequest req, HttpServletResponse res, ModelMap uimap,
				@ModelAttribute BookPurchaseFormDomain pDomain){
						
			VendorPurchaseDomain vp = new VendorPurchaseDomain();
			vp.setVendorId(pDomain.getVendorId());
			
			SimpleDateFormat date = new SimpleDateFormat("dd-mm-yyyy");		
			vp.setPurchaseDate(date.format(new Date()));
			
			vp.setQuantity(pDomain.getQuantity());
			
			int qant = pDomain.getQuantity();
			
			Set<BookDomain> bookList = new HashSet<BookDomain>();
			
			for(int i=0; i < qant; i++){			
				BookDomain book =	new BookDomain();			
				book.setAuthor(pDomain.getAuthor());
				book.setCategory(pDomain.getCategory());
				book.setSubCategory(pDomain.getSubCategory());
				book.setPublisher(pDomain.getPublisher());
				book.setTitle(pDomain.getTitle());
				book.setVersion(pDomain.getVersion());
				book.setAvailable(true);
				bookList.add(book);
			}
			
			vp.setBookList(bookList);
			
			System.out.println(bookList.size());
			
			vendorManager.purchaseBook(vp);
			
			return "redirect:home.htm";
		} 
		
		
}
