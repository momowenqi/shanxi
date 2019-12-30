package boco.shanxi.controller;

import boco.shanxi.domain.BusinessOperating;
import boco.shanxi.domain.Result;
import boco.shanxi.service.BusinessOperatingService;
import boco.shanxi.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-11 16:36
 * @description: 业务运营
 */
@Api(description = "业务运营")
@RestController
@RequestMapping(value = "/busiOper")
public class BusinessOpertingController {

    @Autowired
    private BusinessOperatingService businessOperatingService;

    @ApiOperation(value = "获取业务运营数据",notes = "根据地区ID获取业务运营数据")
    @RequestMapping(value = "/get/{areaId}",method = RequestMethod.GET)
    public Result getBusiOper(@PathVariable Integer areaId){
        List<BusinessOperating> busiOper = businessOperatingService.findBusiOper(areaId);
        return ResultUtil.success(busiOper);
    }

    @ApiOperation(value = "新增业务运营数据",notes = "新增业务运营数据")
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public Result insertBusiOper(@RequestBody BusinessOperating businessOperating){
        businessOperatingService.saveBusiOper(businessOperating);
        return ResultUtil.success();
    }
}
