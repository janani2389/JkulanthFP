package com.pro.ereader.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_boox_txn")
public class UserBookTxnDomain implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int txnId;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="userId")
	private UserDomain user;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name ="bookId")
	private BookDomain book;
	
	private Date startDate;
	private Date returnDate;
	
	
	public int getTxnId() {
		return txnId;
	}
	public void setTxnId(int txnId) {
		this.txnId = txnId;
	}
	
	public UserDomain getUser() {
		return user;
	}
	public void setUser(UserDomain user) {
		this.user = user;
	}
	public BookDomain getBook() {
		return book;
	}
	public void setBook(BookDomain book) {
		this.book = book;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getReturnDate() {
		return returnDate;
	}
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}
	
	
	

}
