package boco.shanxi.mapper;

import boco.shanxi.domain.ProvinceTourists;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-11-04 14:28
 * @description: 省外游客数
 */
@Mapper
public interface ProvinceTouristsMapper {

    //新增省外游客数数据
    void addProvinceTourists(ProvinceTourists provinceTourists);

    //查询省外游客数数据
    List<ProvinceTourists> selectProvinceTourists();
}
