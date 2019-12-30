package boco.shanxi.mapper;

import boco.shanxi.domain.PayMinutes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-11-04 14:28
 * @description: 每分钟缴费数量和成功率采集
 */
@Mapper
public interface PayMinutesMapper {

    //新增数据
    void addPayMinutes(PayMinutes payMinutes);

    //查询数据
    List<PayMinutes> selectPayMinutes(Integer areaId);
}
