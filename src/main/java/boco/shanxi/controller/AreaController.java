package boco.shanxi.controller;

import boco.shanxi.domain.Area;
import boco.shanxi.domain.Result;
import boco.shanxi.service.AreaService;
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
 * @create: 2019-12-17 09:54
 * @description: 地区
 */
@Api(description = "地区")
@RestController
@RequestMapping(value = "/area")
public class AreaController {

    @Autowired
    private AreaService areaService;

    @ApiOperation(value = "新增地区",notes = "新增")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertArea(@RequestBody Area area){
        areaService.insertArea(area);
        return ResultUtil.success();
    }

    @ApiOperation(value = "查询地区列表",notes = "查询")
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Result selectArea(){
        List<Area> list = areaService.selectAreaList();
        return ResultUtil.success(list);
    }
}
