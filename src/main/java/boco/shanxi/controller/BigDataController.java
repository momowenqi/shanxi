package boco.shanxi.controller;

import boco.shanxi.domain.BigData;
import boco.shanxi.domain.Result;
import boco.shanxi.service.BigDataService;
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
 * @create: 2019-11-08 15:22
 * @description: 经分大数据
 */
@Api(description = "经分大数据")
@RestController
@RequestMapping("/bigData")
public class BigDataController {

    @Autowired
    private BigDataService bigDataService;

    @ApiOperation(value = "新增经分大数据")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertBigData(@RequestBody BigData bigData) {
        bigDataService.saveBigData(bigData);
        return ResultUtil.success();
    }

    @ApiOperation(value = "获取经分大数据列表",notes = "获取经分大数据列表")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Result getBigData(){
        List<BigData> list = bigDataService.findBigData();
        return ResultUtil.success(list);
    }
}
