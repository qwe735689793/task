package com.demo.controller;

import com.demo.mapper.BorrowingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author sch
 * @create 2019/3/29
 * 这是一个测试类！这是一个测试类！这是一个测试类
 */
@Controller
@RequestMapping("/")
public class TestBootController {
    @Autowired
    private BorrowingMapper borrowingMapper;
    @RequestMapping("gettest1")
    public String gettest1(ModelMap map) {
        return "test1";
    }

    @RequestMapping("getindex")
    public String getindex(ModelMap map) {
        return "index";
    }

    @RequestMapping("/getMyBorrowing")
    public String getMyBorrowing(ModelMap map) {
        System.out.println(borrowingMapper.Myborrowing(2));
        return "index";
    }
}