package boco.shanxi.controller;

import boco.shanxi.domain.MarketingSupport;
import boco.shanxi.domain.Result;
import boco.shanxi.service.MarketingSupportService;
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
 * @create: 2019-11-25 14:17
 * @description:
 */
@Api(description = "运营支撑")
@RestController
@RequestMapping(value = "/marketing")
public class MarketingSupportController {

    @Autowired
    private MarketingSupportService marketingSupportService;

    @ApiOperation(value = "获取运营支撑列表",notes = "获取运营支撑列表")
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Result getMarketingSupport(){
        List<MarketingSupport> marketing = marketingSupportService.findMarketing();
        return ResultUtil.success(marketing);
    }

    @ApiOperation(value = "新增运营支撑",notes = "新增运营支撑")
    @RequestMapping(value = "insert",method = RequestMethod.POST)
    public Result insertMarketingSupport(@RequestBody MarketingSupport marketingSupport){
        marketingSupportService.saveMarketing(marketingSupport);
        return ResultUtil.success();
    }
}
