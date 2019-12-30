package boco.shanxi.service;

import boco.shanxi.domain.SystemMonitoring;
import boco.shanxi.mapper.SystemMonitoringMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 16:47
 * @description: 系统监控
 */
@Service
public class SystemMonitoringService {

    @Autowired
    private SystemMonitoringMapper systemMonitoringMapper;

    public void saveSystemMonitor(SystemMonitoring systemMonitoring) {
        systemMonitoringMapper.addSystemMonitoring(systemMonitoring);
    }

    public List<SystemMonitoring> findSystemMonitor() {
        return systemMonitoringMapper.selectSystemMonitoring();
    }
}
