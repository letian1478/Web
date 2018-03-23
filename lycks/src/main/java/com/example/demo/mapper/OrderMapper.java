package com.example.demo.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.pojo.Order;

@Mapper
public interface OrderMapper {

	@Select("select * from t_order where id like '%${mechk}%' or ztype like '%${mechk}%' or zstatus like '%${mechk}%' ")
	List<Order> getList(Map<String, Object> map);

}
