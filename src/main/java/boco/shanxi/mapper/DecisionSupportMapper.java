package boco.shanxi.mapper;

import boco.shanxi.domain.DecisionSupport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-11-04 14:28
 * @description: 决策支撑
 */
@Mapper
public interface DecisionSupportMapper {

    //新增决策支撑数据
    void addDecision(DecisionSupport decisionSupport);

    //查询决策支撑数据
    List<DecisionSupport> selectDecisionList();
}
