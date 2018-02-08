package com.wisely.highlight_spring4.ch2.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 使用JSR250形式的Bean
 * @author Lucifer
 * @date 2018/02/06 14:09
 */
public class JSR250WayService {

    @PostConstruct  //在构造函数执行完之后执行
    public void init(){
        System.out.println("@jsr250-init-method");
    }

    public JSR250WayService(){
        super();
        System.out.println("初始化构造函数-JSR250WayService");
    }

    @PreDestroy // 在Bean销毁之前执行
    public void destroy(){
        System.out.println("jsr250-destory-method");
    }
}
