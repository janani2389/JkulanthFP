package com.pro.ereader.manager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pro.ereader.domain.VendorDomain;
import com.pro.ereader.domain.VendorPurchaseDomain;
import com.pro.ereader.service.VendorService;

@Component("vendorManager")
public class VendorManager {

	@Autowired
	private VendorService vendorService;
	
	public void addVendor(VendorDomain vendorDomain) {
		
		try{
		vendorService.addVendor(vendorDomain);
	} catch(Exception ex){
		ex.printStackTrace();
	}

	}
	public List<VendorDomain> getAllVendors() {
		return vendorService.getAllVendors();
	}

	
	public void deleteVendor(int vendorId) {		
		vendorService.deleteVendor(vendorId);
	}

	
	public void updateVendor(VendorDomain vendorDomain) {
		vendorService.updateVendor(vendorDomain);
	}

	
	public VendorDomain getVendorByVendorId(int vendorId) {
		return vendorService.getVendorByVendorId(vendorId);
	}

	
	public VendorDomain getVendorByVendorName(String vendorName) {
		return vendorService.getVendorByVendorName(vendorName);
	}
	
	public void purchaseBook(VendorPurchaseDomain purchaseDomain) {
		vendorService.purchaseBook(purchaseDomain);
	}

}
