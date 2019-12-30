package boco.shanxi.controller;

import boco.shanxi.domain.DataSupport;
import boco.shanxi.domain.Result;
import boco.shanxi.service.DataSupportService;
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
 * @create: 2019-11-12 13:54
 * @description: 数据支撑
 */
@Api(description = "数据支撑")
@RestController
@RequestMapping(value = "/dataSupport")
public class DataSupportController {

    @Autowired
    private DataSupportService dataSupportService;


    //查询数据
    @ApiOperation(value = "获取数据支撑",notes = "获取数据支撑")
    @RequestMapping(value = "/get",method =  RequestMethod.GET)
    public Result getDataSupportList(){
        List<DataSupport> dataSupport = dataSupportService.findDataSupport();
        return ResultUtil.success(dataSupport);
    }

    //新增数据
    @ApiOperation(value = "新增数据支撑",notes = "新增数据支撑")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertDataSupport(@RequestBody DataSupport dataSupport){
        dataSupportService.saveDataSupport(dataSupport);
        return ResultUtil.success();
    }
}
