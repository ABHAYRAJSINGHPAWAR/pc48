package com;
import java.util.Scanner;

 class Point2D {
	 private int x;
     private int y;
	 Scanner sc = new Scanner(System.in); 
	 Point2D(int x,int y){
		 this.x=x;
		 this.y=y;
	 }
	 
		 public boolean Compare(Point2D p2) {
			 boolean res=false;
			 if(this.x==p2.x && this.y==p2.y)
				 res=true;
			return res; 
		 
		 }
        
		 public void setCoordinate(int x, int y) {
			 // System.out.println("Enter X Coordinate : ");
			 this.x = x;
			 this.y = y;
		 }
		 
		 public int getXCoordinate() {
			 return x;
		 }
		 public int getYCoordinate() {
			 return y;
		 }
		 
 }


