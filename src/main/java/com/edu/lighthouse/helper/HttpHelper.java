package com.edu.lighthouse.helper;

import javax.servlet.http.HttpServletRequest;

/**
 * @author hyj
 * @date 2020/3/2
 */
public class HttpHelper {
    /**
     * 从token里获取userId
     * @param request
     * @return
     */
    public static int getUserId(HttpServletRequest request) {
        Object userId = request.getAttribute("userId");
        return getIntegerAttribute(userId);
    }

    /**
     * 从token里获取roleId
     * @param request
     * @return
     */
    public static int getRoleId(HttpServletRequest request) {
        Object roleId = request.getAttribute("roleId");
        return getIntegerAttribute(roleId);
    }

    public static int getIntegerAttribute(Object id){
        int result = 0;
        if (id != null) {
            if (id instanceof Integer) {
                result = (Integer) id;
            } else if (id instanceof String) {
                result = Integer.parseInt((String) id);
            }
        }
        return result;
    }
}
