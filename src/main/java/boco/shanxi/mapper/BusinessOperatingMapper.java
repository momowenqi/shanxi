package boco.shanxi.mapper;

import boco.shanxi.domain.BusinessOperating;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-10-31 11:29
 * @description: 业务运营
 */
@Mapper
public interface BusinessOperatingMapper {

    //新增业务运营数据
    void addBusiOper(BusinessOperating businessOperating);

    //查询业务运营
    List<BusinessOperating> selectBusiOper(Integer areaId);
}
