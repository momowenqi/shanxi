package boco.shanxi.controller;

import boco.shanxi.domain.Result;
import boco.shanxi.domain.SystemSupport;
import boco.shanxi.service.SystemSupportService;
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
 * @create: 2019-11-25 17:09
 * @description: 系统支撑
 */
@Api(description = "系统支撑")
@RestController
@RequestMapping(value = "/systemSupport")
public class SystemSupportController {

    @Autowired
    private SystemSupportService systemSupportService;

    @ApiOperation(value = "查询系统支撑数据",notes = "查询数据")
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Result getSystemSupport(){
        List<SystemSupport> list = systemSupportService.findSystemSupport();
        return ResultUtil.success(list);
    }

    @ApiOperation(value = "新增系统支撑数据",notes = "新增数据")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertSystemSupport(@RequestBody SystemSupport systemSupport){
        systemSupportService.saveSystemSupport(systemSupport);
        return ResultUtil.success();
    }
}
