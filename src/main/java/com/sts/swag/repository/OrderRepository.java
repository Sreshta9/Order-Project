package com.sts.swag.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sts.swag.entity.Orders;
@Repository
public interface OrderRepository extends CrudRepository<Orders, Integer> {

}
