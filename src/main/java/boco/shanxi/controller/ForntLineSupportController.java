package boco.shanxi.controller;

import boco.shanxi.domain.FrontLineSupport;
import boco.shanxi.domain.Result;
import boco.shanxi.service.FrontLineSupportService;
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
 * @create: 2019-11-25 09:32
 * @description: 一线支撑
 */
@Api(description = "一线支撑")
@RestController
@RequestMapping(value = "/forntLine")
public class ForntLineSupportController {

    @Autowired
    private FrontLineSupportService frontLineSupportService;

    @ApiOperation(value = "获取一线支撑",notes = "获取一线支撑")
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Result getFrontLine(){
        List<FrontLineSupport> frontLine = frontLineSupportService.findFrontLine();
        return ResultUtil.success(frontLine);
    }

    @ApiOperation(value = "新增一线支撑",notes = "新增一线支撑")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertFrontLine(@RequestBody FrontLineSupport frontLineSupport){
        frontLineSupportService.saveFrontLine(frontLineSupport);
        return ResultUtil.success();
    }
}
