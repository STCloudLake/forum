package com.join.forumWeb.util;

import com.alibaba.druid.support.json.JSONUtils;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;
import lombok.ToString;

import java.util.HashMap;
import java.util.Map;
import java.util.function.ObjLongConsumer;

/**
 * @author hxt
 */
public class ReturnUtil {

    private String code;
    private String msg;
    private Object data;

    public static ReturnUtil success(String msg) {
        return success(msg,null);
    }

    public static ReturnUtil success( String msg,Object data) {
        return returnUtil(CodeEnum.SUCCESS.getValue(), msg, data);
    }

    public static ReturnUtil fail(String msg) {
        return fail(msg, null);
    }

    public static ReturnUtil fail( String msg,Object data) {
        return returnUtil(CodeEnum.ERROR.getValue(), msg, data);

    }


    private static ReturnUtil returnUtil(String code, String msg, Object data) {
        ReturnUtil returnUtil = new ReturnUtil();
        returnUtil.code = code;
        returnUtil.data = data;
        returnUtil.msg = msg;
        return returnUtil;
    }

    @Override
    public String toString() {
        return JSONUtils.toJSONString(this);
    }

}