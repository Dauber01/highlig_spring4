package com.wisely.highlight_spring4.ch3.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;

/**
 * 配置类
 * @author Lucifer
 * @date 2018/02/07 11:08
 */
public class ConditionConfig {

    @Bean
    @Conditional(WindowsCondition.class)
    public ListService windowsListService(){
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxConidtion.class)
    public ListService linuxListService(){
        return new LinuxListService();
    }

}
