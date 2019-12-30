package boco.shanxi.controller;

import boco.shanxi.domain.DecisionSupport;
import boco.shanxi.domain.Result;
import boco.shanxi.service.DecisionSupportService;
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
 * @create: 2019-11-18 08:33
 * @description: 决策支撑
 */
@Api(description = "决策支撑")
@RestController
@RequestMapping(value = "/decision")
public class DecisionController {

    @Autowired
    private DecisionSupportService decisionService;

    @ApiOperation(value = "获取决策支撑",notes = "获取决策支撑")
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Result getDecision(){
        List<DecisionSupport> decision = decisionService.findDecision();
        return ResultUtil.success(decision);
    }

    @ApiOperation(value = "新增决策支撑",notes = "新增决策支撑")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertDecision(@RequestBody DecisionSupport decision){
        decisionService.saveDecision(decision);
        return ResultUtil.success();
    }
}
