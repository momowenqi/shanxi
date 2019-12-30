package boco.shanxi.controller;

import boco.shanxi.domain.MonthIncApp;
import boco.shanxi.domain.Result;
import boco.shanxi.service.MonthIncAppService;
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
 * @create: 2019-11-25 15:51
 * @description: 当月新增应用数
 */
@Api(description = "当月新增应用数")
@RestController
@RequestMapping(value = "/monthAdd")
public class MonthIncAppController {

    @Autowired
    private MonthIncAppService monthIncAppService;

    @ApiOperation(value = "获取当月新增应用数",notes = "获取当月新增应用数")
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Result getMonthAdd(){
        List<MonthIncApp> monthAdd = monthIncAppService.findMonthIncApp();
        return ResultUtil.success(monthAdd);
    }

    @ApiOperation(value = "新增当月新增应用数",notes = "新增当月新增应用数")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertMonthAdd(@RequestBody MonthIncApp monthIncApp){
        monthIncAppService.saveMonthIncApp(monthIncApp);
        return ResultUtil.success();
    }
}
