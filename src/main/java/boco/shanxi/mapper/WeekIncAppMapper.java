package boco.shanxi.mapper;

import boco.shanxi.domain.WeekIncApp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-11-04 14:28
 * @description: 当周新增应用个数
 */
@Mapper
public interface WeekIncAppMapper {

    //新增当周新增应用个数数据
    void addWeekIncApp(WeekIncApp weekAddApply);

    //查询当周新增应用个数数据
    List<WeekIncApp> selectWeekIncApp();
}
