package com.khao.model;

public class Customer
{
  private int id;
  private String firstname;
  private String lastname;
  private String middlename;
  
  public Customer(){
    
  }
  
  public void setId(int id){
    this.id = id;
  }
  
  public int getId()
  {
    return this.id;
  }
  
  public void setFirstname(String firstname)
  {
    this.firstname = firstname;
  }
  
  public void setLastname(String lastname){
    this.lastname = lastname;
  }
  
  public void setMiddlename(String middlename){
    this.middlename = middlename;
  }
  
  public String getFirstname()
  {
    return this.firstname;
  }
  
  public String getLastname()
  {
    return this.lastname;
  }
  
  public String getMiddlename()
  {
    return this.middlename;
  }
}