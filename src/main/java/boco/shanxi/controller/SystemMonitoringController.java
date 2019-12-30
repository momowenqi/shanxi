package boco.shanxi.controller;

import boco.shanxi.domain.Result;
import boco.shanxi.domain.SystemMonitoring;
import boco.shanxi.service.SystemMonitoringService;
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
 * @create: 2019-11-25 16:50
 * @description:
 */
@Api(description = "系统监控")
@RestController
@RequestMapping(value = "/systemMonitoring")
public class SystemMonitoringController {

    @Autowired
    private SystemMonitoringService systemMonitoringService;

    @ApiOperation(value = "获取系统监控数据",notes = "查询数据")
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Result getSystemMonitoring(){
        List<SystemMonitoring> systemMonitor = systemMonitoringService.findSystemMonitor();
        return ResultUtil.success(systemMonitor);
    }

    @ApiOperation(value = "新增系统监控数据",notes = "新增数据")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertSystemMonitoring(@RequestBody SystemMonitoring systemMonitoring){
        systemMonitoringService.saveSystemMonitor(systemMonitoring);
        return ResultUtil.success();
    }
}
