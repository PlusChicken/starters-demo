package cn.com.citydo.starters.swaggerstarterdemo;

import cn.com.citydo.starters.swagger.annotation.EnableEasySwagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEasySwagger2(basePackage = "cn.com.citydo.starters.swaggerstarterdemo.controller")
public class SwaggerStarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SwaggerStarterDemoApplication.class, args);
    }

}
