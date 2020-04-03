package cn.com.citydo.starters.datahubstarterdemo;

import cn.com.citydo.starters.datahub.annotation.EnableDataHub;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//默认扫描启动类所在的包,可指定扫描包
@EnableDataHub
public class DatahubStarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatahubStarterDemoApplication.class, args);
    }

}
