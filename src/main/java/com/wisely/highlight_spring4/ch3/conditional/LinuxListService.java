package com.wisely.highlight_spring4.ch3.conditional;

/**
 * Linux下创建的Bean
 * @author Lucifer
 * @date 2018/02/07 11:07
 */
public class LinuxListService implements ListService{

    @Override
    public String showListCmd() {
        return "ls";
    }
}
