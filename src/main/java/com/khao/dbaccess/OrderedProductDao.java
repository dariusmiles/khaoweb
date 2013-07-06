package com.khao.dbaccess;

import java.util.List;

import com.khao.model.OrderedProduct;

public interface OrderedProductDao {
	public List<OrderedProduct> findByCustomer(int customerId);
	public List<OrderedProduct> findByProduct(int productId);
	public List<OrderedProduct> findAll();
	public void create(OrderedProduct orderedProduct);
	public void update(OrderedProduct orderedProduct);
	public void delete(int customerId);
}
