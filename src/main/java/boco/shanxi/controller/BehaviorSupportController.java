package boco.shanxi.controller;

import boco.shanxi.domain.BehaviorSupport;
import boco.shanxi.domain.Result;
import boco.shanxi.service.BehaviorSupportService;
import boco.shanxi.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-06 08:35
 * @description: 行为支撑
 */
@Api(description = "行为支撑")
@RestController
@RequestMapping(value = "/behaviorSupport")
public class BehaviorSupportController {

    @Autowired
    private BehaviorSupportService behaviorSupportService;

    @ApiOperation(value = "新增行为支撑数据",notes = "新增行为支撑数据")
    @PostMapping(value = "/insert")
    public Result insertBehavior(@RequestBody BehaviorSupport behaviorSupport){
        behaviorSupport.setCreateTime(new Date());
        behaviorSupportService.saveBehavior(behaviorSupport);
        return ResultUtil.success();
    }

    @ApiOperation(value = "获取行为支撑数据",notes = "获取行为支撑数据")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Result getBehavior(){
        List<BehaviorSupport> list = behaviorSupportService.selectBehavior();
        return ResultUtil.success(list);
    }

}
