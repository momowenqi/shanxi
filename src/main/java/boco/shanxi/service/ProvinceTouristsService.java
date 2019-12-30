package boco.shanxi.service;

import boco.shanxi.domain.ProvinceTourists;
import boco.shanxi.mapper.ProvinceTouristsMapper;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 14:07
 * @description: 省外游客数
 */
@Service
public class ProvinceTouristsService {

    @Autowired
    private ProvinceTouristsMapper provinceTouristsMapper;

    public void saveProvinceTourists(ProvinceTourists provinceTourists) {
        provinceTouristsMapper.addProvinceTourists(provinceTourists);
    }

    public List<ProvinceTourists> findProvinceTourists(){
        return provinceTouristsMapper.selectProvinceTourists();
    }
}
