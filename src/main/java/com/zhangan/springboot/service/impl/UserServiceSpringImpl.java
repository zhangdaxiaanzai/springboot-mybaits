package com.zhangan.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zhangan.springboot.dao.UserDao;
import com.zhangan.springboot.domain.User;
import com.zhangan.springboot.service.UserService;

@Service
@Transactional
public class UserServiceSpringImpl implements UserService{
	
	@Autowired
	private UserDao userDao;
	
	@Override
	public Page<User> findUserByPage(int pageNo,int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNo, pageSize);
		return userDao.findUserByPage();
	}

	@Override
	public int deleteUserById(int[] id) {
		// TODO Auto-generated method stub
		return userDao.deleteUserById(id);
	}

	@Override
	public int updateUserByObject(User user) {
		// TODO Auto-generated method stub
		
		return userDao.updateUserByObject(user);
	}

	@Override
	public int insertUserByObject(User user) {
		// TODO Auto-generated method stub
		return userDao.insertUserByObject(user);
	}
	
}
