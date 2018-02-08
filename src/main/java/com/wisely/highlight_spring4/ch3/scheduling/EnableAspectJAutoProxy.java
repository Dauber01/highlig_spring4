package com.wisely.highlight_spring4.ch3.scheduling;

import org.springframework.aop.aspectj.autoproxy.AspectJAwareAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * 动态注册Bean
 * @author Lucifer
 * @date 2018/02/08 16:45
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(AspectJAwareAdvisorAutoProxyCreator.class)
public @interface EnableAspectJAutoProxy {

    boolean proxyTargetClass() default false;
}
