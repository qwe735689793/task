package com.demo.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Book implements Serializable {
    private Integer id;

    private String name;

    private String press;

    private String author;

    private Integer stock;
}