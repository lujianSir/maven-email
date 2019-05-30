package com.liuzhihu.dao;

import com.liuzhihu.model.User;

public interface UserDao {

	int save(User user);

	int activeUser(String code);

}
