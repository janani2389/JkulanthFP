package com.pro.ereader.repository.hbnt;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.pro.ereader.domain.VendorDomain;
import com.pro.ereader.domain.VendorPurchaseDomain;
import com.pro.ereader.repository.VendorDao;

@Repository("vendorDao")
public class HbtnVendorDao extends HibernateDaoSupport implements VendorDao {
	
	@Autowired
	 public HbtnVendorDao(SessionFactory sessionFactory) {
	  setSessionFactory(sessionFactory);
	 }

	@Override
	public void addVendor(VendorDomain vendorDomain) {		
		 this.getHibernateTemplate().save(vendorDomain);
	}

	@Override
	public List<VendorDomain> getAllVendors() {
		return this.getHibernateTemplate().find("FROM VendorDomain");
	}

	@Override
	public void deleteVendor(int vendorId) {
		VendorDomain Vendor = this.getVendorByVendorId(vendorId);
		getHibernateTemplate().delete(Vendor);
		
	}

	@Override
	public void updateVendor(VendorDomain vendorDomain) {
		this.getHibernateTemplate().update(vendorDomain);
		
	}

	@Override
	public VendorDomain getVendorByVendorId(int vendorId) {		
		return this.getHibernateTemplate().get(VendorDomain.class, vendorId);
	}

	@Override
	public VendorDomain getVendorByVendorName(String vendorName) {
		List<VendorDomain> vendorList =  this.getHibernateTemplate().find("FROM VendorDomain where vendorName ='"+vendorName+"'");
		if(vendorList != null && vendorList.size() > 0){
			return vendorList.get(0);
		}
		return null;
	}

	@Override
	public void purchaseBook(VendorPurchaseDomain purchaseDomain) {
		this.getHibernateTemplate().save(purchaseDomain);
	}

}
