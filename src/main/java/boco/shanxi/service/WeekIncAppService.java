package boco.shanxi.service;

import boco.shanxi.domain.WeekIncApp;
import boco.shanxi.mapper.WeekIncAppMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 17:14
 * @description: 当周新增应用数
 */
@Service
public class WeekIncAppService {

    @Autowired
    private WeekIncAppMapper weekIncAppMapper;

    public void saveWeekIncApp(WeekIncApp weekIncApp) {
        weekIncAppMapper.addWeekIncApp(weekIncApp);
    }

    public List<WeekIncApp> findWeekIncApp() {
        return weekIncAppMapper.selectWeekIncApp();
    }
}
