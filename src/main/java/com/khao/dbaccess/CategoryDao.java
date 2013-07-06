package com.khao.dbaccess;

import java.util.List;

import com.khao.model.Category;

public interface CategoryDao {
	public Category find(int id);
	public List<Category> findAll();
	public void create(Category category);
	public void update(Category category);
	public void delete(int id);
}
