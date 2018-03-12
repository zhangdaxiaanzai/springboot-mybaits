package com.zhangan.springboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.Page;
import com.zhangan.springboot.domain.City;
import com.zhangan.springboot.fenzhuang.PageInfo;
import com.zhangan.springboot.service.CityService;

@RestController
public class CityRestController {
	@Autowired
	private CityService cityService;
	/**
	 * 根据名称获得城市信息
	 * @param cityName
	 * @return
	 */
	@RequestMapping(value = "/api/city", method = RequestMethod.GET)
	public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }
	
	@RequestMapping(value = "/api/page", method = RequestMethod.GET)
	public  PageInfo<City> findByPage(@RequestParam(value = "pageNo", required = true) Integer pageNo,
			@RequestParam(value = "pageSize",required = true) Integer pageSize) {
		Page<City> citys = new Page<City>();
		if(pageNo != null && pageSize !=null ){
			  citys =cityService.findByPage(pageNo, pageSize);
		}
		PageInfo<City> pageInfo = new PageInfo<City>(citys);
		return pageInfo;
	}
	@RequestMapping(value = "/page")
	public String index(HashMap<String,Object> map){
		map.put("index", "index");
		return "/index";
	}
		
}
