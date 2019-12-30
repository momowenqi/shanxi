package boco.shanxi.service;

import boco.shanxi.domain.MarketingSupport;
import boco.shanxi.mapper.MarketingSupportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 11:23
 * @description: 运营支撑
 */
@Service
public class MarketingSupportService {

    @Autowired
    private MarketingSupportMapper marketingMapper;

    public void saveMarketing(MarketingSupport marketingSupport) {
        marketingMapper.addMarketing(marketingSupport);
    }

    public List<MarketingSupport> findMarketing() {
        return marketingMapper.selectMarketing();
    }
}
