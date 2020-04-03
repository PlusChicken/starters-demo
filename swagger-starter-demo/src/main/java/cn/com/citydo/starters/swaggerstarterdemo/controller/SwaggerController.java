package cn.com.citydo.starters.swaggerstarterdemo.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Caorenpeng
 * 2020-04-03
 */
@RestController
@Api(tags = "模板")
public class SwaggerController {
    @GetMapping(value = "/hello")
    @ApiOperation("HELLO EASY SWAGGER")
    public String hello() {
        return "HELLO EASY SWAGGER";
    }
}
