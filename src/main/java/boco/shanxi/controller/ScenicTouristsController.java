package boco.shanxi.controller;

import boco.shanxi.domain.ScenicTourist;
import boco.shanxi.domain.Result;
import boco.shanxi.service.ScenicTouristService;
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
 * @description:
 */
@Api(description = "对外支撑")
@RestController
@RequestMapping(value = "/scenicTourists")
public class ScenicTouristsController {

    @Autowired
    private ScenicTouristService scenicTouristsService;

    @ApiOperation(value = "查询景区游客数",notes = "查询")
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Result getScenicTourists(){
        List<ScenicTourist> scenicTourists = scenicTouristsService.findScenicTourist();
        return ResultUtil.success(scenicTourists);
    }

    @ApiOperation(value = "新增景区游客",notes = "新增数据")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertScenicTourists(@RequestBody ScenicTourist scenicTourist){
        scenicTouristsService.saveScenicTourist(scenicTourist);
        return ResultUtil.success();
    }
}
