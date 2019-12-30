package boco.shanxi.service;

import boco.shanxi.domain.BehaviorSupport;
import boco.shanxi.mapper.BehaviorSupportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-01 15:19
 * @description: 行为支撑
 */
@Service
public class BehaviorSupportService {

    @Autowired
    private BehaviorSupportMapper behaviorSupportMapper;

    public void saveBehavior(BehaviorSupport behaviorSupport) {
        behaviorSupportMapper.addBehaviorSupport(behaviorSupport);
    }

    public List<BehaviorSupport> selectBehavior() {
        return behaviorSupportMapper.selectBehaviorSupportList();
    }
}
