package com.edu.lighthouse.helper.security;

import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;
import org.mindrot.jbcrypt.BCrypt;


/**
 * @author jinzc
 */
public class Encryption {

    /**
     * 加盐hash加密
     * @param password 明文
     * @return 密文
     */
    public static String hash(String password){
        if (Strings.isNullOrEmpty(password)) {
            return password;
        }
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    /**
     * 校验hashcode
     * @param password 明文
     * @param hashCode hash值
     * @return 是否正确
     */
    public static boolean checkPass(String password, String hashCode){
        if (StringUtils.isAnyEmpty(password, hashCode)) {
            return false;
        }
        return BCrypt.checkpw(password, hashCode);
    }
}
