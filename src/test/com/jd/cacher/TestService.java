package com.jd.cacher;

import com.jd.cacher.entity.HotelExtendInfo;
import com.jd.cacher.service.HotelExtendService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by yangyuan on 16-5-26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring.xml"})
public class TestService {

    @Autowired
    private HotelExtendService hotelExtendService;

    @Test
    public void getHotelExpand(){
        HotelExtendInfo hotelExtendInfo = hotelExtendService.getHotelExtendInfoById(1115301);
        System.out.println("==");
    }
}
