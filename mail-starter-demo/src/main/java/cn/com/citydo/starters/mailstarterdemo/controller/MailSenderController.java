package cn.com.citydo.starters.mailstarterdemo.controller;

import cn.com.citydo.starters.mail.entity.SimpleMessage;
import cn.com.citydo.starters.mail.template.MailTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Caorenpeng
 * 2020-04-03
 */
@RestController
public class MailSenderController {
    /**
     * 标题+文本形式,满足大部分的需求
     *
     * @return
     */
    @GetMapping(value = "/sendSimpleMail")
    public boolean sendSimpleMail() {
        SimpleMessage message = new SimpleMessage();
        message.setTo("caorp@126.com");//接收者邮箱
        message.setSubject("测试简单邮件发送-标题");//标题
        message.setText("测试简单邮件发送-文本");//文本
        MailTemplate.send(message);
        return true;
    }
}
