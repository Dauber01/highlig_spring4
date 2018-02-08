package com.wisely.highlight_spring4.ch2.e1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * 示例Bean
 * @author Lucifer
 * @date 2018/02/06 10:47
 */
@Service
public class DemoService {

    @Value("其它类的属性")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
