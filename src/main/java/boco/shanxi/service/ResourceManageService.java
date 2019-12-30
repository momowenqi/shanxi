package boco.shanxi.service;

import boco.shanxi.domain.ResourceManage;
import boco.shanxi.mapper.ResourceManageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 14:14
 * @description: 资源管理
 */
@Service
public class ResourceManageService {

    @Autowired
    private ResourceManageMapper resourceManageMapper;

    public void saveResourceManage(ResourceManage resourceManage){
        resourceManageMapper.addResourceManage(resourceManage);
    }

    public List<ResourceManage> findResourceManage(){
        return resourceManageMapper.selectResourceManage();
    }
}
