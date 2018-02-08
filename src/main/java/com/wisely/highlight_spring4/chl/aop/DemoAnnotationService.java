package com.wisely.highlight_spring4.chl.aop;

import org.springframework.stereotype.Service;

/**
 * 注解式拦截add操作
 * @author Lucifer
 * @date 2018/02/05 16:43
 */
@Service
public class DemoAnnotationService {

    @Action(name = "注解式拦截得add操作")
    public void add(){

    }

}
