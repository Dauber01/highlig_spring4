package com.wisely.highlight_spring4.ch3.tasksCheduler;

import com.wisely.highlight_spring4.ch3.taskexecutor.TaskExecutorConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 计划任务main
 * @author Lucifer
 * @date 2018/02/07 10:36
 */
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(TaskSchdulerConfig.class);
    }

}
