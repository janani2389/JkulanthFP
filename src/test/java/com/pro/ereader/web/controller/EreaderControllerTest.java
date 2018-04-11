package com.pro.ereader.web.controller;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.CORBA.ContextList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.pro.ereader.domain.UserDomain;
import com.pro.ereader.manager.UserManager;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/applicationContext-test.xml" })
public class EreaderControllerTest {
	
	@Autowired
	private UserManager userManager;
	
	@Test
	public void addUser(){
		UserDomain user = new UserDomain();
		user.setFirstName("Dhas");
		userManager.addUser(user);
	}
	
	//@Test
	public void getAlluserTest(){
		ArrayList<UserDomain> userList = (ArrayList<UserDomain>) userManager.getAllUsers();

		System.out.println(userList.size());
	}
	
	//@Test
	public void deleteUser() {
		userManager.deleteUser(1);
	}

	//@Test
	public void updateUser() {
		UserDomain userDomain = new UserDomain();
		userDomain.setUserId(1);
		userDomain.setAddress("test PAss");
		userManager.updateUser(userDomain);
	}
	
	//@Test
	public void getUserByUserId() {
		UserDomain user =  userManager.getUserByUserId(1);
		System.out.println(user.getAddress());
	}

	//@Test
	public void getUserByUserName() {
		UserDomain userDomain =  userManager.getUserByUserName("shah");
		System.out.println(userDomain.getAddress());
	}

}
