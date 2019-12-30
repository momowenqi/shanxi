package boco.shanxi.service;

import boco.shanxi.domain.SystemSupport;
import boco.shanxi.mapper.SystemSupportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 15:00
 * @description: 系统支撑
 */
@Service
public class SystemSupportService {

    @Autowired
    private SystemSupportMapper systemMapper;

    public void saveSystemSupport(SystemSupport system){
        systemMapper.addSystem(system);
    }

    public List<SystemSupport> findSystemSupport(){
        return systemMapper.selectSystem();
    }
}
