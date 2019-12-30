package boco.shanxi.mapper;

import boco.shanxi.domain.TenantSupport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhanghui2018
 * @create: 2019-11-04 14:28
 * @description: 租户支撑
 */
@Mapper
public interface TenantSupportMapper {

    //新增租户支撑数据
    void addTenant(TenantSupport tenant);

    //查询租户支撑数据
    List<TenantSupport> selectTenant();
}
