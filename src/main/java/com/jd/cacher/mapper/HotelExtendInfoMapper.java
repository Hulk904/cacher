package com.jd.cacher.mapper;

import com.jd.cacher.entity.HotelExtendInfo;
import org.springframework.stereotype.Repository;

/**
 * Created by yangyuan on 16-5-26.
 */
@Repository
public interface HotelExtendInfoMapper {
    HotelExtendInfo getHotelExtendInfoById(Integer id);
}
