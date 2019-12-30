package boco.shanxi.mapper;

import boco.shanxi.domain.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-12-13 17:08
 * @description: 地区
 */
@Mapper
public interface AreaMapper {

    //新增数据
    void insertArea(Area area);

    //查询数据
    List<Area> selectArea();
}
