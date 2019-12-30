package boco.shanxi.mapper;

import boco.shanxi.domain.ResourceManage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-11-04 14:28
 * @description: 资源管理
 */
@Mapper
public interface ResourceManageMapper {

    //新增资源管理数据
    void addResourceManage(ResourceManage resourceManage);

    //查询资源管理数据
    List<ResourceManage> selectResourceManage();
}
