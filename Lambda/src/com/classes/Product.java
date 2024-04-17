package com.classes;

public class Product {
      private int id;
      private String name;
      private double cost;
      
      public Product(int i,String name,double cost){
    	  this.id=i;
    	  this.name=name;
    	  this.cost=cost;
      }
      
      public String toString() {
    	  return "Id " +id +" Name " +name +" cost "+cost;
      }
}
