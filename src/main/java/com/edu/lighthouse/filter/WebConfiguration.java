package com.edu.lighthouse.filter;

import com.google.common.collect.Lists;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

/**
 * @author jinzc
 */
@Configuration
public class WebConfiguration {

    private final String DEFAULT_EXCLUDE_FILE = "exclude.properties";

	@Bean
    public FilterRegistrationBean filterRegistration() throws IOException{
	    String exUrl = loadUrl(DEFAULT_EXCLUDE_FILE);
        FilterRegistrationBean registration = new FilterRegistrationBean();
        registration.setFilter(getAuthFilter());
        registration.addUrlPatterns("/*");
        registration.addInitParameter("filterUri", exUrl);
        registration.setName("AuthFilter");
        registration.setOrder(2);
        return registration;
    }

    @Bean
    public AuthFilter getAuthFilter() {
	    return new AuthFilter();
    }

    /**
     * 加载需要过滤器放行的url
     * @param path 文件路径
     * @return 'url,url,...'
     * @throws IOException 读取文件时异常
     */
    private String loadUrl(String path) throws IOException{
        if (!StringUtils.hasText(path)) {
	        return "";
        }
	    List<String> urls = Lists.newArrayList();
        Properties prop = PropertiesLoaderUtils.loadAllProperties(path);
        prop.entrySet()
                .stream()
                .forEach(entry -> {
                    String url = entry.getKey().toString();
                    if (Optional.ofNullable(url).isPresent()) {
                        String ignorePrefix = "#";
                        if (!url.trim().startsWith(ignorePrefix)) {
                            urls.add(url);
                        }
                    }
                });
        return String.join(",", urls);
    }
}
