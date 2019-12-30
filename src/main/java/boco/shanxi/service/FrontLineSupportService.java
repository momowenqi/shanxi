package boco.shanxi.service;

import boco.shanxi.domain.FrontLineSupport;
import boco.shanxi.mapper.FrontLineSupportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 10:56
 * @description: 一线支撑
 */
@Service
public class FrontLineSupportService {

    @Autowired
    private FrontLineSupportMapper frontLineMapper;

    public void saveFrontLine(FrontLineSupport frontLine) {
        frontLineMapper.addFrontLine(frontLine);
    }

    public List<FrontLineSupport> findFrontLine(){
        List<FrontLineSupport> list = frontLineMapper.selectFrontLine();
        return list;
    }
}
