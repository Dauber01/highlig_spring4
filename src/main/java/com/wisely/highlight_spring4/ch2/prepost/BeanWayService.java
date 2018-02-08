package com.wisely.highlight_spring4.ch2.prepost;

/**
 * Bean
 * @author Lucifer
 * @date 2018/02/06 14:05
 */
public class BeanWayService {

    public void init(){
        System.out.println("@Bean-init-method");
    }

    public BeanWayService(){
        super();
        System.out.println("初始化构造函数-BeanWayService");
    }

    public void destroy(){
        System.out.println("@Bean destroy method");
    }

}
