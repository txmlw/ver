package com.mrliang.mq.core;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author liang wei
 * @description 用一句话描述下该文件的作用
 * @date 2017/8/3 14:46
 */
@Configuration
public class RabbitConfiig {

    @Bean
    public Queue process(){
        return new Queue("hello");
    }
}
