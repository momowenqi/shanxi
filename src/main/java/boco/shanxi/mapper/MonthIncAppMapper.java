package boco.shanxi.mapper;

import boco.shanxi.domain.MonthIncApp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-11-04 14:28
 * @description: 当月新增应用数
 */
@Mapper
public interface MonthIncAppMapper {

    //新增当月新增应用数数据
    void addMonthIncApp(MonthIncApp monthIncApp);

    //查询当月新增应用数数据
    List<MonthIncApp> selectMonthIncApp();
}
