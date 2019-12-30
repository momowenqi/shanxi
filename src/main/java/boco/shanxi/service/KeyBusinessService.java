package boco.shanxi.service;

import boco.shanxi.domain.KeyBusiness;
import boco.shanxi.mapper.KeyBusinessMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 11:00
 * @description: 重点业务运营情况
 */
@Service
public class KeyBusinessService {

    @Autowired
    private KeyBusinessMapper keyBusinessMapper;

    public void saveKeyBusi(KeyBusiness keyBusiness){
        keyBusinessMapper.insertKeyBusiness(keyBusiness);
    }

    public List<KeyBusiness> findKeyBusi(Integer areaId) {
        return keyBusinessMapper.selectKeyBusiness(areaId);
    }
}
