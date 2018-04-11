package com.pro.ereader.repository;

import java.util.List;

import com.pro.ereader.domain.VendorDomain;
import com.pro.ereader.domain.VendorPurchaseDomain;

public interface VendorDao {
	void addVendor(VendorDomain vendorDomain);
	List<VendorDomain> getAllVendors();
	void deleteVendor(int vendorId);
	void updateVendor(VendorDomain vendorDomain);
	VendorDomain getVendorByVendorId(int vendorId);
	VendorDomain getVendorByVendorName(String vendorName);
	void purchaseBook(VendorPurchaseDomain purchaseDomain);

}
