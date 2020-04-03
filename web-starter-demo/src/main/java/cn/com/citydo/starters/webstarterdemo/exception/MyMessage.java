package cn.com.citydo.starters.webstarterdemo.exception;

import cn.com.citydo.starters.web.support.exceptions.IErrorCode;
import lombok.Getter;

/**
 * Created by Caorenpeng
 * 2020-04-03
 */
@Getter
public enum MyMessage implements IErrorCode {
    LOGIN_FAIL(101, "登录失败");
    private Integer code;
    private String msg;

    @Override
    public Integer getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }

    MyMessage(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
