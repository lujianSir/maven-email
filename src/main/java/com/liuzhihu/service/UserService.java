package com.liuzhihu.service;


public interface UserService {

	boolean doRegister(String userName, String password, String email);

	boolean activeUser(String code);
	
}
