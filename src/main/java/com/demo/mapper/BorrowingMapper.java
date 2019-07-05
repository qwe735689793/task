package com.demo.mapper;

import java.util.List;
import java.util.Map;

public interface BorrowingMapper {
    //我的借阅
    List<Map<String, Object>> Myborrowing(Integer id);
}