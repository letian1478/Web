package com.example.demo.controller;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.pojo.Order;
import com.example.demo.service.OrderService;

@Controller
public class OrderController {
	@Autowired
	private OrderService orderService;
	@RequestMapping("/list")
	public String getList(Model model,String mechk) {
		Map<String, Object> map = new HashMap();
		map.put("mechk", mechk);
		java.util.List<Order> list = orderService.getList(map);
		model.addAttribute("list", list);
		return "list";
				
	}

}
