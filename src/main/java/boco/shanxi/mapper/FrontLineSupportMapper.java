package boco.shanxi.mapper;

import boco.shanxi.domain.FrontLineSupport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-11-04 14:28
 * @description: 一线支撑
 */
@Mapper
public interface FrontLineSupportMapper {

    //新增一线支撑数据
    void addFrontLine(FrontLineSupport frontLine);

    //查询一线支撑数据
    List<FrontLineSupport> selectFrontLine();
}
