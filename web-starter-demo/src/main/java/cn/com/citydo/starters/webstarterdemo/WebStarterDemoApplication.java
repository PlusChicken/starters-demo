package cn.com.citydo.starters.webstarterdemo;

import cn.com.citydo.starters.web.annotation.AllowCors;
import cn.com.citydo.starters.web.annotation.EnableControllerAdvice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//允许跨域请求
@AllowCors
//统一异常拦截
@EnableControllerAdvice
public class WebStarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebStarterDemoApplication.class, args);
    }

}
