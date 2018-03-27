package com.zhangan.springboot.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.zhangan.springboot.domain.User;
import com.zhangan.springboot.fenzhuang.PageInfo;
import com.zhangan.springboot.service.UserService;

@RestController
public class UserRestController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/user",method=RequestMethod.GET)
	public  PageInfo<User> findUserByPage(@Param(value="pageNo") Integer pageNo,@Param(value="pageSize") Integer pageSize){
		Page<User> page = new Page<User>();
		if(!"".equals(pageNo)  && !"".equals(pageSize)) {
			page = userService.findUserByPage(pageNo, pageSize);
		}
		PageInfo<User> pageInfo = new PageInfo<User>(page);
		return pageInfo;
	}
	
	@RequestMapping(value="/userDelete",method=RequestMethod.POST)
	public String deleteUser(@Param(value="id[]") int[] id){
		int i = userService.deleteUserById(id);
		if(i==1){
			return "success";
		}else {
			return null;
		}
	}
	
	@RequestMapping(value="/userUpdate",method=RequestMethod.POST)
	public String updateUser(@Param(value="user") User user){
		int i = userService.updateUserByObject(user);
		if(i==1){
			return "success";
		}else {
			return null;
		}
	}
	
}
