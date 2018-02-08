package com.wisely.highlight_spring4.ch3.fortest;

/**
 * 测试bean
 * @author Lucifer
 * @date 2018/02/08 17:07
 */
public class TestBean {

    private String content;

    public TestBean(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
