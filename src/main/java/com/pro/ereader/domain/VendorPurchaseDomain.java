package com.pro.ereader.domain;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="vendor_book_txn")
public class VendorPurchaseDomain implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int purchaseId;
	private int vendorId;
	private int quantity;
	private String purchaseDate;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name = "purchaseId")
	private Set<BookDomain> bookList = new HashSet<BookDomain>();
	
	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	public int getVendorId() {
		return vendorId;
	}
	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getPurchaseDate() {
		return purchaseDate;
	}
	public void setPurchaseDate(String purchaseDate) {
		this.purchaseDate = purchaseDate;
	}
	public Set<BookDomain> getBookList() {
		return bookList;
	}
	public void setBookList(Set<BookDomain> bookList) {
		this.bookList = bookList;
	}

	
	
	

}
