package boco.shanxi.controller;

import boco.shanxi.domain.ResourceManage;
import boco.shanxi.domain.Result;
import boco.shanxi.service.ResourceManageService;
import boco.shanxi.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-06 08:35
 * @description:
 */
@Api(description = "资源管理")
@RestController
@RequestMapping(value = "/resource")
public class ResourceManageController {

    @Autowired
    private ResourceManageService resourceManageService;

    @ApiOperation(value = "新增资源管理数据",notes = "新增")
    @PostMapping(value = "/insert")
    public void insertResource(@RequestBody ResourceManage resourceManage){
        resourceManageService.saveResourceManage(resourceManage);
    }

    @ApiOperation(value = "查询资源管理数据",notes = "查询")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public Result getResource(){
        List<ResourceManage> list = resourceManageService.findResourceManage();
        return ResultUtil.success(list);
    }

}
