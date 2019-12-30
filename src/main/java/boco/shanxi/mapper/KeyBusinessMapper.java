package boco.shanxi.mapper;

import boco.shanxi.domain.KeyBusiness;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-11-04 14:28
 * @description: 重点业务运营情况
 */
@Mapper
public interface KeyBusinessMapper {

    //新增重点业务运营数据
    void insertKeyBusiness(KeyBusiness keyBussiness);

    //根据地区查询重点业务运营数据
    List<KeyBusiness> selectKeyBusiness(Integer areaId);
}
