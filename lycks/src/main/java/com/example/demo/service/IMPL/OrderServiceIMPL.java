package com.example.demo.service.IMPL;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.mapper.OrderMapper;
import com.example.demo.pojo.Order;
import com.example.demo.service.OrderService;

@Service
public class OrderServiceIMPL implements OrderService{

	@Autowired
	private OrderMapper mapper;
	@Override
	public List<Order> getList(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return mapper.getList(map);
	}

}
