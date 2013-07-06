package com.khao.dbaccess;

import java.util.List;

import com.khao.model.Product;

public interface ProductDao {
	public Product find(int id);
	public List<Product> findAll();
	public void create(Product product);
	public void update(Product product);
	public void delete(int id);
}
