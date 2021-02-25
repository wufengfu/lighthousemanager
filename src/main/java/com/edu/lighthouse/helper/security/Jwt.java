package com.edu.lighthouse.helper.security;

import com.edu.lighthouse.constant.CommonConst;
import io.jsonwebtoken.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;


/**
 * @author jinzc
 * @date 2021/01/06
 */
public class Jwt {

	private static final Logger logger = LoggerFactory.getLogger(Jwt.class);
	private static final String SECRET = "XX#$%()(#*!()!KL<><MQLMNQNQJQK sdfkjsdrow32234545fdf>?N<:{LWPW";
	public static final Long MONTH = 1000 * 60 * 60 * 24 * 30L;

	/**
	 * 加密token
	 */
	public static String sign(String userId) {
		Long present = System.currentTimeMillis();
		Date expire = new Date(present + MONTH);

		Map<String, Object> info = new HashMap<>(16);
		info.put("userId", userId);
		info.put("exp", expire);

		String compact = Jwts.builder()
				.setClaims(info)
				.setExpiration(expire)
				.signWith(SignatureAlgorithm.HS512, SECRET)
				.compact();
		return compact;
	}

	public static void main(String[] args) {
		System.out.println(sign("5"));
	}

	/**
	 * 解密token
	 */
	public static Claims unSign(String token) {
	    if (!StringUtils.hasText(token)) {
	    	return null;
		}
	    Claims claims = null;
	    try {
			claims = Jwts.parser().setSigningKey(SECRET).parseClaimsJws(token).getBody();
			logger.info("token内容: {}", claims);
			Long expire = claims.getExpiration().getTime();
			Long present = System.currentTimeMillis();
			if (expire < present) {
				logger.info("{}", "token 过期了");
				return null;
			}
		} catch (Exception e) {
	    	logger.error("token解析异常:{}", e.getMessage());
		}
	    return claims;
	}
}
