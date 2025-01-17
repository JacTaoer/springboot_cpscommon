package org.example.config;

import org.example.interceptor.LoginInerceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;


//@Configuration
//
//public class WebConfig implements WebMvcConfigurer {
//    @Autowired
//    private LoginInerceptor loginInerceptor;
//
//    @Override
//    public  void addInterceptors(InterceptorRegistry registry){
//       // 登录和注册接口不拦截
//        //registry.addInterceptor(loginInerceptor).excludePathPatterns("/user","/admin/login","/admin/register","/admin/userinfo");
//
//    }
//
//
//}
@Configuration // 一定不要忽略此注解
    public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 所有接口
                .allowCredentials(true) // 是否发送 Cookie
                .allowedOriginPatterns("*") // 支持域
                .allowedMethods(new String[]{"GET", "POST", "PUT", "DELETE"}) // 支持方法
                .allowedHeaders("*")
                .exposedHeaders("*");
    }
}
