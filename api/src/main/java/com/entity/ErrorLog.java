package com.entity;

import java.io.Serializable;

public class ErrorLog implements Serializable {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ErrorLog{" +
                "name='" + name + '\'' +
                '}';
    }
}
