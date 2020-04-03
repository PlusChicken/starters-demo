package cn.com.citydo.starters.druidmonitorstarterdemo;

import cn.com.citydo.starters.druidmonitor.annotations.EnableDruidMonitor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Druid 访问地址 127.0.0.1:8080/druid,账号密码:root/root
 */
@SpringBootApplication
@EnableDruidMonitor(name = "root", password = "root")
public class DruidmonitorStarterDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DruidmonitorStarterDemoApplication.class, args);
    }

}
