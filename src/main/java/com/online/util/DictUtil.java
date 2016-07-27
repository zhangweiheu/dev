/**
 *
 */
package com.online.util;

import com.online.mybatis.enums.UserStatusEnum;
import com.online.mybatis.enums.UserTypeEnum;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author tanxianwen 2015年1月26日
 */
public abstract class DictUtil {

    public static Map<String, Class<? extends Enum<?>>> getDictEnumClasses() {
        Map<String, Class<? extends Enum<?>>> map = new LinkedHashMap<String, Class<? extends Enum<?>>>();
        put(UserTypeEnum.class, map);
        put(UserStatusEnum.class, map);
        return map;
    }

    private static void put(Class<? extends Enum<?>> clazz, Map<String, Class<? extends Enum<?>>> map) {
        map.put(clazz.getSimpleName(), clazz);
    }

}
