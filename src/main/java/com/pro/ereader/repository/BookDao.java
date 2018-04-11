package com.pro.ereader.repository;

import java.util.List;

import com.pro.ereader.domain.BookDomain;
import com.pro.ereader.domain.UserBookTxnDomain;

public interface BookDao {
	List<BookDomain> getAllBookByTitle(String title);
	List<BookDomain> getAllBook();
	List<BookDomain> getAllAvailableBookByTitle(String title);
	List<BookDomain> getAllAvailableBook();
	BookDomain getBookById(int id);
	void updateBookDetail(BookDomain bookDomain);
	void borrowBook(UserBookTxnDomain bookTxn);
}
