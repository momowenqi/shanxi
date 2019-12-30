package boco.shanxi.utils;

import boco.shanxi.domain.Result;

/**
 * @program: shanxi
 * @author: zhaoyao
 * @create: 2019-11-06 17:05
 * @description: 结果集工具类
 */
public class ResultUtil {

    public static Result success(Integer code, String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result success(Integer code, String msg,Object object){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        result.setData(object);
        return result;
    }

    public static Result success(){
        Result result = new Result();
        result.setCode(200);
        result.setMsg("success");
        return result;
    }

    public static Result success(Object object){
        Result result = new Result();
        result.setCode(200);
        result.setMsg("success");
        result.setData(object);
        return result;
    }
}
