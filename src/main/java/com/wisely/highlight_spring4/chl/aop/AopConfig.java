package com.wisely.highlight_spring4.chl.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * aop得相关配置
 * @author Lucifer
 * @date 2018/02/06 9:38
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.chl.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
