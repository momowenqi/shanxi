package boco.shanxi.mapper;

import boco.shanxi.domain.SystemSupport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-11-04 14:28
 * @description: 系统支撑
 */
@Mapper
public interface SystemSupportMapper {

    //新增系统支撑数据
    void addSystem(SystemSupport system);

    //查询系统支撑数据
    List<SystemSupport> selectSystem();
}
