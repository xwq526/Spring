package org.example.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.config.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: xuwenqing
 * Date: 2021-01-20
 * Time: 21:58:59
 */
//定义SpringMVC的启动配置类
@Configuration
public class AppConfig implements WebMvcConfigurer {

    @Autowired
    private ObjectMapper objectMapper;

    //配置Controller中请求映射方法路径匹配规则
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //设置路径前缀的规则，以第二个参数的返回值作为请求映射方法是否添加前缀
        configurer.addPathPrefix("api", c ->true);
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //前端处理逻辑和后端处理逻辑是否一样？
        //前端：敏感资源在拦截器中处理为：没登录跳转首页
        //后端：敏感资源在拦截器中处理为：返回json，401状态码
        registry.addInterceptor(new LoginInterceptor(objectMapper))
                .addPathPatterns("/api/**")
                .excludePathPatterns("/api/user/**")//后端开发资源
                .addPathPatterns("/views/main.html")
                .addPathPatterns("/views/article.html");
    }
}
