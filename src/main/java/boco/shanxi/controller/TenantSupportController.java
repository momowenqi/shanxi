package boco.shanxi.controller;

import boco.shanxi.domain.Result;
import boco.shanxi.domain.TenantSupport;
import boco.shanxi.service.TenantSupportService;
import boco.shanxi.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-25 17:21
 * @description: 租户支撑
 */
@Api(description = "租户支撑")
@RestController
@RequestMapping(value = "/tenantSupport")
public class TenantSupportController {

    @Autowired
    private TenantSupportService tenantSupportService;

    @ApiOperation(value = "查询租户支撑数据",notes = "查询数据")
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Result getTenantSupport(){
        List<TenantSupport> tenant = tenantSupportService.findTenant();
        return ResultUtil.success(tenant);
    }

    @ApiOperation(value = "新增租户支撑数据",notes = "新增数据")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertTenantSupport(@RequestBody TenantSupport tenantSupport){
        tenantSupportService.saveTenant(tenantSupport);
        return ResultUtil.success();
    }
}
