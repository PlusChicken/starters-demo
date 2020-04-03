package cn.com.citydo.starters.swaggerstarterdemo.config;

import cn.com.citydo.starters.swagger.domain.CommonParamModel;
import cn.com.citydo.starters.swagger.swagger.Swagger2CommonParamsAware;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现扩展的参数,以下实现了 token参数 需要在Header传入
 * Created by Caorenpeng
 * 2020-04-03
 */
@Component
public class CustomParam implements Swagger2CommonParamsAware {
    @Override
    public List<CommonParamModel> setSwaggerCommonParams() {
        List<CommonParamModel> models = new ArrayList<>();
        CommonParamModel model = new CommonParamModel();
        model.setParamName("token");
        model.setParamsDescription("令牌");
        model.setParamType("STRING");
        model.setRequestType("header");
        model.setRequired(true);
        models.add(model);
        return models;
    }
}
