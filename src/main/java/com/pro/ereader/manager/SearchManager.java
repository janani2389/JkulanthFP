package com.pro.ereader.manager;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pro.ereader.domain.BookDomain;
import com.pro.ereader.domain.MembershipDomain;
import com.pro.ereader.domain.UserBookTxnDomain;
import com.pro.ereader.domain.UserDomain;
import com.pro.ereader.service.SearchService;
import com.pro.ereader.service.UserService;

@Component("searchManager")
public class SearchManager {
	
	@Autowired
	private SearchService searchService;
	
	@Autowired
	private UserService userService;

	public List<BookDomain> getAllBookByTitle(String title) {
		return searchService.getAllBookByTitle(title);
	}

	public List<BookDomain> getAllBook() {
		return searchService.getAllBook();
	}

	public BookDomain getBookById(int id) {
		return searchService.getBookById(id);
	}

	public List<BookDomain> getAllAvailableBookByTitle(String title) {
		return searchService.getAllAvailableBookByTitle(title);
	}

	public List<BookDomain> getAllAvailableBook() {
		return searchService.getAllAvailableBook();
	}
	public void updateBookDetail(BookDomain bookDomain) {
		searchService.updateBookDetail(bookDomain);
	}
	
	public void borrowBookForUser(UserDomain currentUser, int bookId){
		MembershipDomain member = userService.getMembershipById(currentUser.getMembershipId());
		BookDomain book = searchService.getBookById(bookId);
		System.out.println("Book"+book.getAuthor());
		Date startDate = new Date();		
		
		Calendar cal  = Calendar.getInstance();
		cal.setTime(startDate);
		cal.add(Calendar.DATE, member.getDue());
		Date returnDate = cal.getTime();
		
		UserBookTxnDomain bookTxn = new UserBookTxnDomain();
		book.setAvailable(false);
		bookTxn.setBook(book);
		bookTxn.setStartDate(startDate);
		bookTxn.setReturnDate(returnDate);
		bookTxn.setUser(currentUser);			
		
		searchService.borrowBook(bookTxn);
		
	}

}
