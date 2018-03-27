package com.zhangan.springboot.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.github.pagehelper.Page;
import com.zhangan.springboot.domain.User;

@Mapper
public interface UserDao {
	 @Select("SELECT * FROM user")
	Page<User> findUserByPage();
	 
	 
	 @Delete("delete from user where id in (#{ids})")
	 int deleteUserById (int[] id);
	 
	 @Update("update user set name=#{name} , phone=#{phone} , email=#{email}"
	 		+ " , attribute=#{attribute} where id=#{id}")//registDate=#{registDate} , pwd=#{pwd} ,
	 int updateUserByObject(User user); 
	 
	 @Insert("insert into user(loginName,name,phone,email,registDate,pwd,attribute) "
	 		+ " values(#{loginName},#{name},#{phone},#{email},#{registDate},"
	 		+ " #{pwd},#{attribute})")
	 int insertUserByObject(User user);
	 
	 
}
