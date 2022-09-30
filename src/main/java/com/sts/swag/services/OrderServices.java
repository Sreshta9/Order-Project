package com.sts.swag.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.swag.entity.Orders;
import com.sts.swag.repository.OrderRepository;
@Service
public class OrderServices {
	@Autowired
private OrderRepository service;
public List<Orders> getAllOrders()
{
	List<Orders> list=new ArrayList<Orders>();
	this.service.findAll().forEach(list::add);
	return list ;
}
public Orders addOrder(Orders order)
{
	return this.service.save(order);
}
public Orders updateOrder(Integer id,Orders order)
{
	return this.service.save(order);
}
public void deleteOrder(Integer id)
{
	this.service.deleteById(id);
}

}
