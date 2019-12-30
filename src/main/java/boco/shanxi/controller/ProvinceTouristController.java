package boco.shanxi.controller;

import boco.shanxi.domain.ProvinceTourists;
import boco.shanxi.domain.Result;
import boco.shanxi.service.ProvinceTouristsService;
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
 * @create: 2019-11-25 16:23
 * @description: 省外游客数
 */
@Api(description = "省外游客数")
@RestController
@RequestMapping(value = "/provinceTourist")
public class ProvinceTouristController {

    @Autowired
    private ProvinceTouristsService provinceTouristsService;

    @ApiOperation(value = "获取省外游客数",notes = "获取省外游客数")
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Result getProvinceTourist(){
        List<ProvinceTourists> list = provinceTouristsService.findProvinceTourists();
        return ResultUtil.success(list);
    }

    @ApiOperation(value = "新增省外游客数",notes = "新增省外游客数")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertProvinceTourist(@RequestBody ProvinceTourists provinceTourists){
        provinceTouristsService.saveProvinceTourists(provinceTourists);
        return ResultUtil.success();
    }
}
