package boco.shanxi.mapper;

import boco.shanxi.domain.BigData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-10-28 16:28
 * @description: 经分大数据
 */
@Mapper
public interface BigDataMapper {

    //新增经分大数据
    void addBigData(BigData bigData);

    //查询经分大数据列表
    List<BigData> selectBigDataList();

}
