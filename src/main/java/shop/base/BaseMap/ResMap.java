package shop.base.BaseMap;

import shop.base.EnumCode.ResEnum;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by songningning1 on 2017/9/9.
 */
public class ResMap {

    /**
     * 返回失败
     *
     * @param key   错误码
     * @param value 错误说明
     * @return
     */
    public static Map<String, Object> getFailedMap(int key, String value) {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", key);
        map.put("msg", value);
        map.put("success", true);
        map.put("data", null);
        return map;
    }


    /**
     * 返回失败数据
     *
     * @param data 返回的data数据
     * @return
     */
    public static <T> Map getFailedMap(T data) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", ResEnum.FAILEd.getValue());
        map.put("msg", ResEnum.FAILEd.getValue());
        map.put("success", true);
        map.put("data", data);
        return map;
    }


    /**
     * 返回异常Map
     *
     * @return
     */
    public static Map<String, Object> getExceptionMap() {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", "404");
        map.put("msg", "方法异常");
        map.put("success", false);
        map.put("data", null);
        return map;
    }


    /**
     * 返回参数空Map
     *
     * @return
     */
    public static Map<String, Object> getNullParamMap() {

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", "405");
        map.put("msg", "参数为空");
        map.put("success", false);
        map.put("data", null);
        return map;
    }

    /**
     * 返回成功数据
     *
     * @param data 返回的data数据
     * @return
     */
    public static <T> Map getSuccessMap(T data) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", ResEnum.SUCCESS.getKey());
        map.put("msg", ResEnum.SUCCESS.getValue());
        map.put("success", true);
        map.put("data", data);
        return map;
    }

    /**
     * 返回成功，数据为空Map
     *
     * @param data 返回的data数据
     * @return
     */
    public static <T> Map getNullDataMap(T data) {
        Map<String, Object> map = new HashMap<String, Object>();
        return map;
    }


    /**
     * 构建返回体Map，set数据
     *
     * @param data
     * @return
     */
    public static Map<String, Object> getMap(Object data) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("success", true);
        map.put("data", data);
        return map;
    }


    /**
     * 返回成功，验证code失败，错误（code != 0）
     *
     * @return
     */
    public static Map<String, Object> errCodeMap(String msg) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("code", "1");
        map.put("msg", msg);
        return getMap(map);
    }

    /**
     * 返回成功，验证code成功，错误（code == 0）
     *
     * @param
     * @return
     */
    public static Map rightCodeMap(String msg) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", ResEnum.SUCCESS.getKey());
        map.put("msg", msg);
        return getMap(map);
    }

    /**
     * 返回成功，data为空（空数据Map）
     *
     * @param
     * @return
     */
    public static Map nullDataMap(String msg) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", ResEnum.SUCCESS.getKey());
        map.put("msg", msg);
        map.put("data", null);
        return getMap(map);
    }

    /**
     * 返回成功，data成功（正确数据Map）
     *
     * @param
     * @return
     */
    public static Map successDataMap(Object data, String msg) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("code", ResEnum.SUCCESS.getKey());
        map.put("msg", msg);
        map.put("data", data);
        return getMap(map);
    }

}
