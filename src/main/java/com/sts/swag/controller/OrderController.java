package com.sts.swag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sts.swag.entity.Orders;
import com.sts.swag.services.OrderServices;

@RestController
@RequestMapping("/rest/order")
public class OrderController {
@Autowired
public OrderServices service;
@GetMapping("/orders")
public List<Orders>getAllorders()
{
	return service.getAllOrders();
}
@PostMapping("/addorders")
public Orders addOrder(@RequestBody Orders order)
{
	return this.service.addOrder(order);
}
@PutMapping("/updateorders/{ordid}")
public Orders updateOrder(@PathVariable int ordid,@RequestBody Orders order )
{
	return  this.service.updateOrder(ordid, order);
}
@DeleteMapping("/deleteorders/{ordid}")
public void deleteOrder(@PathVariable int ordid)
{
	this.service.deleteOrder(ordid);
}
}
