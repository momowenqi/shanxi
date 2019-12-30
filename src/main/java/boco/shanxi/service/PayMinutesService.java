package boco.shanxi.service;

import boco.shanxi.domain.PayMinutes;
import boco.shanxi.mapper.PayMinutesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 10:09
 * @description: 每分钟缴费数量和成功率采集
 */
@Service
public class PayMinutesService {

    @Autowired
    private PayMinutesMapper payMinutesMapper;

    public void savePayMinutes(PayMinutes payMinutes) {
        payMinutesMapper.addPayMinutes(payMinutes);
    }

    public List<PayMinutes> findPayMinutes(Integer areaId){
        return payMinutesMapper.selectPayMinutes(areaId);
    }
}
