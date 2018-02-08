package com.wisely.highlight_spring4.ch3.tasksCheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 配置类
 * @author Lucifer
 * @date 2018/02/07 10:35
 */
@Configuration
@ComponentScan("com.wisely.highlight_spring4.ch3.tasksCheduler")
@EnableScheduling
public class TaskSchdulerConfig {
}
