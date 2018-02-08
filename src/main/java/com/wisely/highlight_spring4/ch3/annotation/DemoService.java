package com.wisely.highlight_spring4.ch3.annotation;

import org.springframework.stereotype.Service;

/**
 * 演示服务的Bean
 * @author Lucifer
 * @date 2018/02/07 17:01
 */
@Service
public class DemoService {

    public void outputResult(){
        System.out.println("从组合注解配置照样获得的bean");
    }

}
