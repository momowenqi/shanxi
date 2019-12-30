package boco.shanxi.mapper;

import boco.shanxi.domain.Resource;
import boco.shanxi.domain.ScenicTourist;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-11-04 14:28
 * @description: 对外支撑
 */
@Mapper
public interface ScenicTouristMapper {

    //新增对外支撑数据
    void addScenicTourist(ScenicTourist scenicTourist);

    //查询对外支撑数据
    List<ScenicTourist> selectScenicTourist();
}
