package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	List<Item> getItems(String orderId);
	//��ȡ��Ʒ��Ϣ,������Ʒ�Ŀ��
	void decreaseNumbers(List<Item> list);
}