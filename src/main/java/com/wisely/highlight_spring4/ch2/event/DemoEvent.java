package com.wisely.highlight_spring4.ch2.event;

import org.springframework.context.ApplicationEvent;

/**
 * 被监听的事件
 * @author Lucifer
 * @date 2018/02/06 17:42
 */
public class DemoEvent extends ApplicationEvent{
    private static final long serialVersionUID = 1L;
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
