package com.pro.ereader.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.ereader.domain.BookDomain;
import com.pro.ereader.domain.UserBookTxnDomain;
import com.pro.ereader.repository.BookDao;

@Service("searchService")
public class SearchService {
	
	@Autowired
	private BookDao bookDao;

	public List<BookDomain> getAllBookByTitle(String title) {
		return bookDao.getAllBookByTitle(title);
	}

	public List<BookDomain> getAllBook() {
		return bookDao.getAllBook();
	}
	
	public List<BookDomain> getAllAvailableBookByTitle(String title) {
		return bookDao.getAllAvailableBookByTitle(title);
	}

	public List<BookDomain> getAllAvailableBook() {
		return bookDao.getAllAvailableBook();
	}

	public BookDomain getBookById(int id) {
		return bookDao.getBookById(id);
	}

	
	public void updateBookDetail(BookDomain bookDomain) {
		bookDao.updateBookDetail(bookDomain);
	}
	
	public void borrowBook(UserBookTxnDomain bookTxn) {
		this.bookDao.borrowBook(bookTxn);
	}	
	
}
