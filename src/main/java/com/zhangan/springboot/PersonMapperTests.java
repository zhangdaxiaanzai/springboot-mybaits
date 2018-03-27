package com.zhangan.springboot;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.github.pagehelper.Page;
import com.zhangan.springboot.domain.City;
import com.zhangan.springboot.domain.User;
import com.zhangan.springboot.fenzhuang.PageInfo;
import com.zhangan.springboot.service.CityService;
import com.zhangan.springboot.service.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonMapperTests {
	private Logger logger = LoggerFactory.getLogger(PersonMapperTests.class);
	
	@Autowired
	private CityService cityService;
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testFindByPage() {
		Page<City> citys = cityService.findByPage(1, 3);
		PageInfo<City> pageInfo =  new PageInfo<City>(citys);
		Assert.assertNotNull(pageInfo);
		logger.debug(pageInfo.toString());
	}
	@Test
	public void testdelete() {
//		int i = userService.deleteUserById(1);
//		logger.debug(String.valueOf(i));
		
	}

}
