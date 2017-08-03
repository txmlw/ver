package com.mrliang.mq.core;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author liang wei
 * @description 用一句话描述下该文件的作用
 * @date 2017/8/3 14:46
 */
@Component
@RabbitListener(queues = "hello")
public class Recevier {

    @RabbitHandler
    public void process(String msg){
        System.out.println("receiver:"+msg);
    }
}
