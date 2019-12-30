package boco.shanxi.mapper;

import boco.shanxi.domain.SystemMonitoring;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-11-04 14:28
 * @description: 系统监控
 */
@Mapper
public interface SystemMonitoringMapper {

    //新增系统监控数据
    void addSystemMonitoring(SystemMonitoring systemMonitoring);

    //查询系统监控数据
    List<SystemMonitoring> selectSystemMonitoring();
}
