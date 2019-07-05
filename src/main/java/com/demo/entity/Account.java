package com.demo.entity;

import lombok.Data;

import java.io.Serializable;
@Data
public class Account implements Serializable {
    private Integer id;

    private String studentId;

    private String password;

    private String name;

    private Integer status;
}