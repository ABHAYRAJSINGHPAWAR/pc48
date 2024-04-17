package com.customer;

public class Customer {
           private int id;
           private String name;
           private String address;
           
          public Customer(int id,String name,String address){
        	   this.name=name;
        	   this.id=id;
        	   this.address=address;
           }
           
          public String toString() {
        	  return "ID " +id +" NAME : " +name +" ADDRESS : " +address;
          }
           
}
