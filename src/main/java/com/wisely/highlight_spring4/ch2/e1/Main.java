package com.wisely.highlight_spring4.ch2.e1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * EL注入参数的main方法
 * @author Lucifer
 * @date 2018/02/06 11:08
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.outputReource();
        context.close();
    }

}
