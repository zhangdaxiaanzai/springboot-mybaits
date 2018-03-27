package com.zhangan.springboot.service;

import com.github.pagehelper.Page;
import com.zhangan.springboot.domain.User;

public interface UserService {
		Page<User> findUserByPage(int pageNo,int pageSize);
		
		//删除
		int deleteUserById (int[] id);
		//修改
		int updateUserByObject(User user); 
		//插入
		int insertUserByObject(User user);
}
