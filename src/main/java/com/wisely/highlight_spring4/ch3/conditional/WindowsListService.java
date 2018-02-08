package com.wisely.highlight_spring4.ch3.conditional;

/**
 * windows环境下创建的Bean
 * @author Lucifer
 * @date 2018/02/07 11:05
 */
public class WindowsListService implements ListService{

    @Override
    public String showListCmd() {
        return "dir";
    }
}
