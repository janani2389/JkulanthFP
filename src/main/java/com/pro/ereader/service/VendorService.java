package com.pro.ereader.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.ereader.domain.VendorDomain;
import com.pro.ereader.domain.VendorPurchaseDomain;
import com.pro.ereader.repository.VendorDao;

@Service("vendorService")
public class VendorService {


	@Autowired
	private VendorDao vendorDao;
	
	
	public void addVendor(VendorDomain vendorDomain) {
		vendorDao.addVendor(vendorDomain);
	}

	
	public List<VendorDomain> getAllVendors() {
		return vendorDao.getAllVendors();
	}

	
	public void deleteVendor(int vendorId) {		
		vendorDao.deleteVendor(vendorId);
	}

	
	public void updateVendor(VendorDomain vendorDomain) {
		vendorDao.updateVendor(vendorDomain);
	}

	
	public VendorDomain getVendorByVendorId(int vendorId) {
		return vendorDao.getVendorByVendorId(vendorId);
	}

	
	public VendorDomain getVendorByVendorName(String vendorName) {
		return vendorDao.getVendorByVendorName(vendorName);
	}
	
	public void purchaseBook(VendorPurchaseDomain purchaseDomain) {
		vendorDao.purchaseBook(purchaseDomain);
	}

}
