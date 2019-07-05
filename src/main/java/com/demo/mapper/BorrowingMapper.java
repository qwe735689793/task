package com.demo.mapper;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface BorrowingMapper {
    //我的借阅
    List<Map<String, Object>> Myborrowing(Integer id);
}