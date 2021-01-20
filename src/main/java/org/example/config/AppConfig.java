package org.example.config;

import org.springframework.context.annotation.Configuration;
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

    //配置Controller中请求映射方法路径匹配规则
    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        //设置路径前缀的规则，以第二个参数的返回值作为请求映射方法是否添加前缀
        configurer.addPathPrefix("api", c ->true);
    }
}
