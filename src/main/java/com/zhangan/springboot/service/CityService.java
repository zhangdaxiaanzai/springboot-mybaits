package com.zhangan.springboot.service;

import com.github.pagehelper.Page;
import com.zhangan.springboot.domain.City;
import com.zhangan.springboot.fenzhuang.PageInfo;

public interface CityService {
	 /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
    
    /**
     * 分页查询
     * @return
     */
    Page<City> findByPage(int pageNo,int pageSize);
}
