package boco.shanxi.service;

import boco.shanxi.domain.BossDeal;
import boco.shanxi.mapper.BossDealMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 09:59
 * @description: BOSS话单处理情况
 */
@Service
public class BossDealService {

    @Autowired
    private BossDealMapper bossDealMapper;

    public void saveBossDeal(BossDeal bossDeal){
        bossDealMapper.addBossDeal(bossDeal);
    }

    public List<BossDeal> findBossDeal(Integer areaId) {
        return bossDealMapper.selectBossDeal(areaId);
    }
}
