package boco.shanxi.controller;

import boco.shanxi.domain.BossDeal;
import boco.shanxi.domain.Result;
import boco.shanxi.service.BossDealService;
import boco.shanxi.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-11 10:54
 * @description: BOSS话单处理情况
 */
@Api(description = "BOSS话单处理情况")
@RestController
@RequestMapping(value = "/bossDeal")
public class BossDealController {

    @Autowired
    private BossDealService bossDealService;

    @ApiOperation(value = "获取BOSS话单处理情况清单",notes = "获取BOSS话单处理情况")
    @RequestMapping(value = "/get/{areaId}",method = RequestMethod.GET)
    public Result getBossDeal(@PathVariable Integer areaId){
        List<BossDeal> bossDeal =  bossDealService.findBossDeal(areaId);
        return ResultUtil.success(bossDeal);
    }

    @ApiOperation(value = "新增BOSS话单处理情况",notes = "新增BOSS话单处理情况")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertBossDeal(@RequestBody BossDeal bossDeal){
        bossDealService.saveBossDeal(bossDeal);
        return ResultUtil.success();
    }
}
