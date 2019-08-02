package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	//获取商品信息,减少商品的库存
	void decreaseNumbers(List<Item> list);
}