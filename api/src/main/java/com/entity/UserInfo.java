package com.entity;

import java.io.Serializable;
import lombok.Data;

@Data
public class UserInfo implements Serializable {

    private Integer id;
    private String name;

}

