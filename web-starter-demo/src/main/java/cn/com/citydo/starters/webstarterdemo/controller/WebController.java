package cn.com.citydo.starters.webstarterdemo.controller;

import cn.com.citydo.starters.web.support.exceptions.CommonException;
import cn.com.citydo.starters.web.support.pagehelper.Page;
import cn.com.citydo.starters.web.support.pagehelper.PageRequest;
import cn.com.citydo.starters.web.support.result.R;
import cn.com.citydo.starters.web.util.Assert;
import cn.com.citydo.starters.webstarterdemo.exception.MyMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Caorenpeng
 * 2020-04-03
 */
@RestController
public class WebController {
    /**
     * 正常返回数据
     * {"success":true,"msg":"成功","data":{"name":"jack"},"code":200}
     *
     * @return
     */
    @GetMapping(value = "/ok")
    public R<Student> ok() {
        return R.ok(new Student("jack"));
    }

    /**
     * 失败返回
     * {"success":false,"msg":"账号错误","data":{},"code":100}
     *
     * @return
     */
    @GetMapping(value = "/fail")
    public R<Student> fail() {
//        return R.fail(MyMessage.LOGIN_FAIL);
        return R.fail(100, "账号错误");
    }

    /**
     * 抛异常
     * {"success":false,"msg":"登录失败","data":{},"code":101}
     *
     * @return
     */
    @GetMapping(value = "exception")
    public R<Student> exception() {
        throw new CommonException(MyMessage.LOGIN_FAIL);
    }

    @PostMapping(value = "/page")
    public R<Page> page(@RequestBody PageRequest request) {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            data.add(i + "");
        }
        //需要引入Mybatis的 pagehelper包
        //代码分离
        Page page = new Page(data, request);

        //MyBatis分页
//        PageHelper.startPage(request.getPageNum(),request.getPageSize());
//        List<String> str=dao.getUser();
//        Page page1=new Page(str,request);

        return R.ok(page);
    }

    @GetMapping(value = "/assert")
    public R assertUtil() {
        String a = null;
        Assert.notNull(a, MyMessage.LOGIN_FAIL);
        return R.ok();
    }
}
