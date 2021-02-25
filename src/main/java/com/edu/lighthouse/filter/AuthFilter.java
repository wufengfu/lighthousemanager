package com.edu.lighthouse.filter;

import com.edu.lighthouse.helper.security.Jwt;
import io.jsonwebtoken.Claims;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.*;


/**
 * @author jinzc
 */
public class AuthFilter implements Filter {

    private Logger log = LoggerFactory.getLogger(AuthFilter.class);
    private String[] filterUri;

    @Override
    public void init(FilterConfig filterConfig) {
        filterUri = filterConfig
                .getInitParameter("filterUri")
                .split(",");
    }

    @Override
    public void doFilter(ServletRequest sRequest, ServletResponse sResponse, FilterChain filterChain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) sRequest;
        HttpServletResponse response = (HttpServletResponse) sResponse;
        String uri = request.getServletPath();
        boolean isValid = Arrays.stream(filterUri)
                .anyMatch(item -> uri.toLowerCase()
                        .matches(item.toLowerCase().replace("*", ".*")));
        if (isValid) {
            filterChain.doFilter(sRequest, sResponse);
            return;
        }
        String token = getTokenFromHeaderOrCookie(request);
        if (!StringUtils.hasText(token)) {
            log.warn("header或cookie中没有找到'token'键值对: URL={}", request.getRequestURL());
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "由客户端请求中未获取到token");
            return;
        }
        Claims claims = Jwt.unSign(token);
        if (Objects.isNull(claims)) {
            log.warn("token无效或已过期：URL={}", request.getRequestURL());
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "token无效或已过期");
            return;
        }
        Integer userId = Integer.valueOf(claims.get("userId").toString());
        request.setAttribute("userId", userId);
        filterChain.doFilter(sRequest, sResponse);
    }

    @Override
    public void destroy() {}

    /**
     * 获取客户单token
     * @param request 客户端请求
     * @return token字符串
     */
    private String getTokenFromHeaderOrCookie(HttpServletRequest request) {
        String tokenKey = "Authorization";
        String token = request.getHeader(tokenKey);
        if (StringUtils.hasText(token)) {
            return token;
        }
        Cookie[] cookies = request.getCookies();
        if (Objects.nonNull(cookies)) {
            Optional<String> optional = Arrays.stream(cookies)
                    .filter(cookie -> "token".equals(cookie.getName()))
                    .map(Cookie::getValue)
                    .findFirst();
            if (optional.isPresent()) {
                return optional.get();
            }
        }
        return "";
    }

}
