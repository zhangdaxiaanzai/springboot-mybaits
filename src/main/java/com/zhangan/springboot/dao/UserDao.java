package com.zhangan.springboot.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.github.pagehelper.Page;
import com.zhangan.springboot.domain.User;

@Mapper
public interface UserDao {
	 @Select("SELECT * FROM user")
	Page<User> findUserByPage();
}
