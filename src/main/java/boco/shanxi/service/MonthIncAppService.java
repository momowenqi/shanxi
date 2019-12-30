package boco.shanxi.service;

import boco.shanxi.domain.MonthIncApp;
import boco.shanxi.mapper.MonthIncAppMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 11:28
 * @description: 当月新增应用数
 */
@Service
public class MonthIncAppService {

    @Autowired
    private MonthIncAppMapper monthIncAppMapper;

    public void saveMonthIncApp(MonthIncApp monthIncApp) {
        monthIncAppMapper.addMonthIncApp(monthIncApp);
    }

    public List<MonthIncApp> findMonthIncApp() {
        return monthIncAppMapper.selectMonthIncApp();
    }

}
