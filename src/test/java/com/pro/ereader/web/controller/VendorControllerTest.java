package com.pro.ereader.web.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pro.ereader.domain.VendorDomain;
import com.pro.ereader.manager.VendorManager;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext-test.xml" })
public class VendorControllerTest {
	
	@Autowired
	private VendorManager vendorManager;

	//@Test	
	public void addVendor() {
		VendorDomain vendorDomain = new VendorDomain();
		vendorDomain.setVendorId(1);
		vendorManager.addVendor(vendorDomain);
	}

	//@Test
	public void getAllVendors() {
		System.out.println(vendorManager.getAllVendors().size());
	}

	//@Test
	public void deleteVendor() {		

		vendorManager.deleteVendor(1);
	}

	//@Test
	public void updateVendor() {
		VendorDomain vendorDomain = new VendorDomain();
		vendorDomain.setVendorId(1);
		vendorManager.updateVendor(vendorDomain);
	}

	//@Test
	public  void getVendorByVendorId() {
		//System.out.println(vendorManager.getVendorByVendorId(1).getVendorName());
	}

	@Test
	public void getVendorByVendorName() {
		//System.out.println(vendorManager.getVendorByVendorId(1).getVendorName());
	}
		
		
}
