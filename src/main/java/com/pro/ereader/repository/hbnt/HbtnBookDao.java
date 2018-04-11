package com.pro.ereader.repository.hbnt;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.pro.ereader.domain.BookDomain;
import com.pro.ereader.domain.UserBookTxnDomain;
import com.pro.ereader.repository.BookDao;

@Repository("bookDao")
public class HbtnBookDao extends HibernateDaoSupport implements BookDao {
	
	@Autowired
	 public HbtnBookDao(SessionFactory sessionFactory) {
	  setSessionFactory(sessionFactory);
	 }

	@Override
	public List<BookDomain> getAllBookByTitle(String title) {
		return this.getHibernateTemplate().find("from BookDomain where UPPER(title) like UPPER('"+title+"%')");
	}

	@Override
	public List<BookDomain> getAllBook() {
		return this.getHibernateTemplate().find("from BookDomain");
	}

	@Override
	public BookDomain getBookById(int id) {
		return getHibernateTemplate().get(BookDomain.class, id);
	}

	@Override
	public void updateBookDetail(BookDomain bookDomain) {
		this.getHibernateTemplate().update(bookDomain);
	}

	@Override
	public List<BookDomain> getAllAvailableBookByTitle(String title) {
		return this.getHibernateTemplate().find("from BookDomain where  isAvailable = true AND UPPER(title) like UPPER('"+title+"%')");

	}

	@Override
	public List<BookDomain> getAllAvailableBook() {
		return this.getHibernateTemplate().find("from BookDomain where  isAvailable = true " );
	}

	@Override
	public void borrowBook(UserBookTxnDomain bookTxn) {
		this.getHibernateTemplate().save(bookTxn);
	}


	
	
}
