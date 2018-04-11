package com.pro.ereader.repository;

import java.util.List;

import com.pro.ereader.domain.MembershipDomain;
import com.pro.ereader.domain.UserBookTxnDomain;
import com.pro.ereader.domain.UserDomain;

public interface UserDao {
	void addUser(UserDomain userDomain);
	List<UserDomain> getAllUsers();
	void deleteUser(int userId);
	void updateUser(UserDomain userDomain);
	UserDomain getUserByUserId(int userId);
	UserDomain getUserByUserName(String userName);
	MembershipDomain getMembershipById(int id);
	List<UserBookTxnDomain> getBookTxnByUserId(int userId);

}
