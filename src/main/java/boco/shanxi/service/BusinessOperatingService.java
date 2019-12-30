package boco.shanxi.service;

import boco.shanxi.domain.BusinessOperating;
import boco.shanxi.mapper.BusinessOperatingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 10:22
 * @description: 业务运营
 */
@Service
public class BusinessOperatingService {

    @Autowired
    private BusinessOperatingMapper businessOperatingMapper;

    public void saveBusiOper(BusinessOperating businessOperating){
        businessOperatingMapper.addBusiOper(businessOperating);
    }

    public List<BusinessOperating> findBusiOper(Integer areaId){
        return businessOperatingMapper.selectBusiOper(areaId);
    }
}
