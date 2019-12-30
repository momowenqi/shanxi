package boco.shanxi.controller;

import boco.shanxi.domain.PayMinutes;
import boco.shanxi.domain.Result;
import boco.shanxi.service.PayMinutesService;
import boco.shanxi.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-25 16:01
 * @description: 每分钟缴费数量和成功率采集
 */
@Api(description = "每分钟缴费数量和成功率采集")
@RestController
@RequestMapping(value = "/payMinutes")
public class PayMinutesController {

    @Autowired
    private PayMinutesService payMinutesService;

    @ApiOperation(value = "获取每分钟缴费数量和成功率采集数据",notes = "根据地区ID获取每分钟缴费数量和成功率采集数据")
    @RequestMapping(value = "/get/{areaId}",method = RequestMethod.GET)
    public Result getPayMinutes(@PathVariable Integer areId){
        List<PayMinutes> payMinutes = payMinutesService.findPayMinutes(areId);
        return ResultUtil.success(payMinutes);
    }

    @ApiOperation(value = "新增每分钟缴费数量和成功率采集数据",notes = "新增每分钟缴费数量和成功率采集数据")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertPayMinutes(@RequestBody PayMinutes payMinutes){
        payMinutesService.savePayMinutes(payMinutes);
        return ResultUtil.success();
    }
}
