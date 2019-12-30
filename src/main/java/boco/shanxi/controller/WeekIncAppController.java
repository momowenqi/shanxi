package boco.shanxi.controller;

import boco.shanxi.domain.Result;
import boco.shanxi.domain.WeekIncApp;
import boco.shanxi.service.WeekIncAppService;
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
 * @create: 2019-11-25 17:35
 * @description:
 */
@Api(description = "当周新增应用个数")
@RestController
@RequestMapping(value = "/weekIncApp")
public class WeekIncAppController {

    @Autowired
    private WeekIncAppService weekIncAppService;

    @ApiOperation(value = "查询当周应用个数数据",notes = "查询数据")
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Result getWeekIncApp(){
        List<WeekIncApp> weekIncAppList = weekIncAppService.findWeekIncApp();
        return ResultUtil.success(weekIncAppList);
    }

    @ApiOperation(value = "新增当周应用个数数据",notes = "新增数据")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertWeekIncApp(@RequestBody WeekIncApp weekIncApp){
        weekIncAppService.saveWeekIncApp(weekIncApp);
        return ResultUtil.success();
    }
}
