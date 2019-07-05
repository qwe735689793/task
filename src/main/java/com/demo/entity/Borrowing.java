package com.demo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Borrowing implements Serializable {
    private Integer bookId;

    private Date borrowingTime;

    private Date returnTime;
}