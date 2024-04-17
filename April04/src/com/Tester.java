package com;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of coordinate you enter");
         int size=sc.nextInt();
         
        
         Point2D[] newPoint = new Point2D[size];
         int[] arrx = new int[size];
         int[] arry = new int[size];
         for(int i=0;i<newPoint.length;i++)
         {
            // System.out.println(newPoint[i]);
        	 int x = sc.nextInt();
        	 int y = sc.nextInt();
        	 boolean flag = false;
        	 for (int j = 0; j < i; j++) {
        		 if (arrx[j] == x || arry[j] == y) {
        			 System.out.println("Point already exist in plane");
        			 // System.out.println("Enter point coordinate again");
        			 // x = sc.nextInt();
        			 // y = sc.nextInt();
        			 i--;
        			 flag = true;
        			 break;
        		 }
        	 }
        	 if (flag == true) {
        		 continue;
        	 }
        	 newPoint[i] = new Point2D(x, y);
        	 
        	 arrx[i] = x;
        	 arry[i] = y;
        	 
         
         }
         
         for (Point2D pt : newPoint) {
        	 System.out.println("X Coordinate is : " + pt.getXCoordinate() + "   Y Coordinate is : " + pt.getYCoordinate());
         }
         
         
         
         sc.close();
	}

	

}
