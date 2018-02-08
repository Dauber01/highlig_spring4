package com.wisely.highlight_spring4.chl.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 关于aop配置得主类
 * @author Lucifer
 * @date 2018/02/06 9:42
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);
        demoAnnotationService.add();
        demoMethodService.add();
        context.close();
    }

}
