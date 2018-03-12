package com.zhangan.springboot.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.zhangan.springboot.dao.CityDao;
import com.zhangan.springboot.domain.City;
import com.zhangan.springboot.fenzhuang.PageInfo;
import com.zhangan.springboot.service.CityService;
@Service
public class CityServiceSpringImpl implements CityService{
	@Autowired
	private CityDao cityDao;
	
	@Override
	public City findCityByName(String cityName) {
		// TODO Auto-generated method stub
		return cityDao.findByName(cityName);
	}

	@Override
	public Page<City> findByPage(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNo, pageSize);
		return cityDao.findbyPage();
	}
	

}
