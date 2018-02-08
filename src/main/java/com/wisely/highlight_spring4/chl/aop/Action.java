package com.wisely.highlight_spring4.chl.aop;

import java.lang.annotation.*;

/**
 * 编写拦截规则得注解
 * @author Lucifer
 * @date 2018/02/05 16:12
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
