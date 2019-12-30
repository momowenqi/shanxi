package boco.shanxi.controller;

import boco.shanxi.domain.KeyBusiness;
import boco.shanxi.domain.Result;
import boco.shanxi.service.KeyBusinessService;
import boco.shanxi.utils.ResultUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-25 11:23
 * @description:
 */
@Api(description = "重点业务运营")
@RestController
@RequestMapping(value = "/keyBusiness")
public class KeyBusinessController {

    @Autowired
    private KeyBusinessService keyBusinessService;

    @ApiOperation(value = "获取重点业务运营情况",notes = "获取重点业务运营情况")
    @RequestMapping(value = "/get/{areaId}",method = RequestMethod.GET)
    public Result getKeyBusiness(@PathVariable Integer areaId){
        List<KeyBusiness> keyBusi = keyBusinessService.findKeyBusi(areaId);
        return ResultUtil.success(keyBusi);
    }

    @ApiOperation(value = "新增重点业务运营情况",notes = "新增重点业务运营情况")
    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    public Result insertKeyBusiness(@RequestBody KeyBusiness keyBusiness){
        keyBusinessService.saveKeyBusi(keyBusiness);
        return ResultUtil.success();
    }
}
