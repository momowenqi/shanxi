package boco.shanxi.mapper;

import boco.shanxi.domain.DataSupport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-10-29 16:00
 * @description: 数据支撑
 */
@Mapper
public interface DataSupportMapper {

    //新增数据支撑
    void addDataSupport(DataSupport dataSupport);

    //查询数据支撑列表
    List<DataSupport> selectDataSupportList();
}
