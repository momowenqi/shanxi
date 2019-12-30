package boco.shanxi.service;

import boco.shanxi.domain.DecisionSupport;
import boco.shanxi.mapper.DecisionSupportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 10:45
 * @description: 决策支撑
 */
@Service
public class DecisionSupportService {

    @Autowired
    private DecisionSupportMapper decisionMapper;

    public void saveDecision(DecisionSupport decision) {
        decisionMapper.addDecision(decision);
    }

    public List<DecisionSupport> findDecision() {
        return decisionMapper.selectDecision();
    }
}
