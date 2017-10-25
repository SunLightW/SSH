package cn.jasmine.utils;


import com.alibaba.fastjson.JSON;

/**
 * 接口工具类_返回数据格式为json
 */
public class Back2JsonUtil {


    /**
     * 将对象转化成为JSON字符串
     * @param object
     * @return
     */
    public static String toJSON(Object object){
        return JSON.toJSONString(object);
    }

}
