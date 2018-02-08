package com.wisely.highlight_spring4.ch2.scop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 单例多例配置类的main
 * @author Lucifer
 * @date 2018/02/06 10:25
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemoPrototypeService d1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService d2 = context.getBean(DemoPrototypeService.class);
        DemoSingletonService s1 = context.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = context.getBean(DemoSingletonService.class);
        System.out.println("d1和d2是否相等" + d1.equals(d2));
        System.out.println("s1和s2是否相等" + s1.equals(s2));
        context.close();
    }

}
