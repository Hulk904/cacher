package com.jd.cacher.service.impl;

import com.jd.cacher.entity.HotelExtendInfo;
import com.jd.cacher.mapper.HotelExtendInfoMapper;
import com.jd.cacher.service.HotelExtendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by yangyuan on 16-5-26.
 */
@Service
public class HotelExtendServiceImpl implements HotelExtendService{

    @Autowired
    HotelExtendInfoMapper hotelExtendInfoMapper;

    @Cacheable("extendInfo")
    public HotelExtendInfo getHotelExtendInfoById(Integer id){
        return hotelExtendInfoMapper.getHotelExtendInfoById(id);
    }

    public HotelExtendInfoMapper getHotelExtendInfoMapper() {
        return hotelExtendInfoMapper;
    }

    public void setHotelExtendInfoMapper(HotelExtendInfoMapper hotelExtendInfoMapper) {
        this.hotelExtendInfoMapper = hotelExtendInfoMapper;
    }
}
