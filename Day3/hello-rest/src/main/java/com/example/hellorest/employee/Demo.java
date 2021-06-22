package com.example.hellorest.employee;

import org.springframework.stereotype.Component;

@Component //บอกว่าเป็นComponent ของ Spring
//ข้อดีจะมีแค่ 1 instant ตลอดของ Spring
public class Demo {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
