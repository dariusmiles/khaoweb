package com.khao.dbaccess;

import java.util.List;

import com.khao.model.Customer;

public interface CustomerDao
{
  public Customer find(int id);
  public List<Customer> findAll();
  public void create(Customer customer);
  public void update(Customer customer);
  public void delete(int id);
}