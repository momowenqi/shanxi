package boco.shanxi.service;

import boco.shanxi.domain.TenantSupport;
import boco.shanxi.mapper.TenantSupportMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-05 17:10
 * @description: 租户支撑
 */
@Service
public class TenantSupportService {

    @Autowired
    private TenantSupportMapper tenantMapper;

    public void saveTenant(TenantSupport tenant) {
        tenantMapper.addTenant(tenant);
    }

    public List<TenantSupport> findTenant() {
        return tenantMapper.selectTenant();
    }
}
