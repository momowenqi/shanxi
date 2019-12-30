package boco.shanxi.mapper;

import boco.shanxi.domain.MarketingSupport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-11-04 14:28
 * @description: 运营支撑
 */
@Mapper
public interface MarketingSupportMapper {

    //新增运营支撑数据
    void addMarketing(MarketingSupport marketing);

    //查询运营支撑数据
    List<MarketingSupport> selectMarketing();
}
