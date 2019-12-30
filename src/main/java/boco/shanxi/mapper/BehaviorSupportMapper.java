package boco.shanxi.mapper;

import boco.shanxi.domain.BehaviorSupport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-10-28 17:16
 * @description: 行为支撑
 */
@Mapper
public interface BehaviorSupportMapper {

    //新增行为支撑
    void addBehaviorSupport(BehaviorSupport behaviorSupport);

    //查询行为支撑列表
    List<BehaviorSupport> selectBehaviorSupportList();
}
