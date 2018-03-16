package com.zhangan.springboot.service;

import com.github.pagehelper.Page;
import com.zhangan.springboot.domain.User;

public interface UserService {
		Page<User> findUserByPage(int pageNo,int pageSize);
}
