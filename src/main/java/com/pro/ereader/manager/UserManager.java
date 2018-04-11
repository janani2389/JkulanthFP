package com.pro.ereader.manager;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.pro.ereader.domain.UserBookTxnDomain;
import com.pro.ereader.domain.UserDomain;
import com.pro.ereader.service.UserService;


@Component("userManager")
public class UserManager {
	
	@Autowired
	private UserService userService;
	
	public void addUser(UserDomain userDomain){		
		try{
			userService.addUser(userDomain);
		}catch(Exception ex){
			ex.printStackTrace();
		}
		
	}
	
	public List<UserDomain> getAllUsers(){
		List<UserDomain> userList = new ArrayList<UserDomain>();
		try{
			userList = userService.getAllUser();
		}catch(Exception ex){
			ex.printStackTrace();
		}
		return userList;
	}
	
	
	public void deleteUser(int userId) {
		userService.deleteUser(userId);
	}

	public void updateUser(UserDomain userDomain) {
		userService.updateUser(userDomain);
	}

	public UserDomain getUserByUserId(int userId) {
		return  userService.getUserByUserId(userId);
	}

	public UserDomain getUserByUserName(String userName) {
		return userService.getUserByUserName(userName);
	}
	

	public List<UserBookTxnDomain> getBookTxnByUserId(int userId){
		return userService.getBookTxnByUserId(userId);
	}
	

}
