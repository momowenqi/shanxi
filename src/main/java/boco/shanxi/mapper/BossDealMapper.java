package boco.shanxi.mapper;

import boco.shanxi.domain.BossDeal;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-10-29 16:18
 * @description: BOSS话单处理情况
 */
@Mapper
public interface BossDealMapper {

    //新增BOSS话单情况
    void addBossDeal(BossDeal bossDeal);

    //查询BOSS话单处理情况
    List<BossDeal> selectBossDeal(Integer areaId);
}
