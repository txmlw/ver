package com.mrliang.mq.core;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author liang wei
 * @description 用一句话描述下该文件的作用
 * @date 2017/8/3 14:46
 */
@Component()
public class Sender {
    @Autowired
    private AmqpTemplate rabbitTemplate;
    public void send(){
        String msg = "hello :"+ new Date();
        System.out.println("sender:"+msg);
        this.rabbitTemplate.convertAndSend("hello",msg);
    }
}
