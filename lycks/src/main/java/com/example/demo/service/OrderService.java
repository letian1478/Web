package com.example.demo.service;

import java.util.List;
import java.util.Map;

import com.example.demo.pojo.Order;

public interface OrderService {

	List<Order> getList(Map<String, Object> map);

}
