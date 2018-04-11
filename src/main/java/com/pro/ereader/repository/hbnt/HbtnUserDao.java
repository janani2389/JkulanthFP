package com.pro.ereader.repository.hbnt;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

import com.pro.ereader.domain.MembershipDomain;
import com.pro.ereader.domain.UserBookTxnDomain;
import com.pro.ereader.domain.UserDomain;
import com.pro.ereader.repository.UserDao;

@Repository("userDao")
public class HbtnUserDao extends HibernateDaoSupport implements UserDao {
	
	@Autowired
	 public HbtnUserDao(SessionFactory sessionFactory) {
	  setSessionFactory(sessionFactory);
	 }

	@Override
	public void addUser(UserDomain userDomain) {		
		 this.getHibernateTemplate().save(userDomain);
	}

	@Override
	public List<UserDomain> getAllUsers() {
		return this.getHibernateTemplate().find("FROM UserDomain");
	}

	@Override
	public void deleteUser(int userId) {
		UserDomain user = this.getUserByUserId(userId);
		getHibernateTemplate().delete(user);
		
	}

	@Override
	public void updateUser(UserDomain userDomain) {
		this.getHibernateTemplate().update(userDomain);
		
	}

	@Override
	public UserDomain getUserByUserId(int userId) {		
		return this.getHibernateTemplate().get(UserDomain.class, userId);
	}

	@Override
	public UserDomain getUserByUserName(String userName) {
		List<UserDomain> userList =  this.getHibernateTemplate().find("FROM UserDomain where userName ='"+userName+"'");
		if(userList != null && userList.size() > 0){
			return userList.get(0);
		}
		return null;
	}

	@Override
	public MembershipDomain getMembershipById(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(MembershipDomain.class, id);
	}
	
	@Override
	public List<UserBookTxnDomain> getBookTxnByUserId(int userId) {
		return this.getHibernateTemplate().find("from UserBookTxnDomain where user.userId ="+userId);
		
	}


}
