package com.tedu.sp01.service;


import com.tedu.sp01.pojo.Order;

public interface OrderService {
	Order getOrder(String orderId);
	//Ìí¼Ó¶©µ¥
	void addOrder(Order order);
}