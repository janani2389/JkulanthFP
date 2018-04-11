package com.pro.ereader.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.ereader.domain.MembershipDomain;
import com.pro.ereader.domain.UserBookTxnDomain;
import com.pro.ereader.domain.UserDomain;
import com.pro.ereader.repository.UserDao;


@Service("userService")
public class UserService {	
	
	@Autowired
	private UserDao userDao;
	
	public void addUser(UserDomain userDomain) throws Exception{		
		userDao.addUser(userDomain);
	}
	
	
	public List<UserDomain> getAllUser() throws Exception{
		return userDao.getAllUsers();
	}
	
	public void deleteUser(int userId) {
		userDao.deleteUser(userId);
	}

	public void updateUser(UserDomain userDomain) {
		userDao.updateUser(userDomain);
	}

	public UserDomain getUserByUserId(int userId) {
		return  userDao.getUserByUserId(userId);
	}

	public UserDomain getUserByUserName(String userName) {
		return userDao.getUserByUserName(userName);
	}

	public MembershipDomain getMembershipById(int id){
		return userDao.getMembershipById(id);
	}
	
	public List<UserBookTxnDomain> getBookTxnByUserId(int userId){
		return userDao.getBookTxnByUserId(userId);
	}
	
}
