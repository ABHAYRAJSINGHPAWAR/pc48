package com.tester;
//import com.app.fruits.*;

import java.util.Scanner;


import com.app.fruits.Apple;
import com.app.fruits.Fruit;
import com.app.fruits.Mango;
import com.app.fruits.Orange;


public class FruitBasket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Size of basket (S/M/L)");
		String si="";
		int size=0;
		if(sc.hasNext())
		{
			si=sc.next();
		}
		
		if(si.equals("S"))
		{
			size=3;
	        System.out.println("You can add only 3 times");	
     	}
		else if (si.equals("M"))
		{
			size=5;
			System.out.println("you can add only 5 times");
		}
		else {
			size=7;
			System.out.println("you can add only 7 times ");
			
		}
			Fruit[] basket=new Fruit[size];
			Mango mg =new Mango("", 0, "", true);
		    Orange or=new Orange("",0, "", true);
		    Apple ap=new Apple("",0,"",true);
			
		boolean flag=true;
		int ch=0;
	
		 do {
			 if(count<size)
			 {
			 System.out.println("Press 1 To Add mango");
			 System.out.println("Press 2 To Add Orange");
			 System.out.println("Press 3 To Add Apple");
			 System.out.println("Press 4 To Exit");
			 System.out.println();
			 
			 
			 System.out.println("Enter your choice");
			 
			 
			 if(sc.hasNextInt() ) {
      			 ch=sc.nextInt();
      			 switch(ch) {
    			          case 1:
    			                {
    			                	
    			                	System.out.println("Enter how much mango you want in Weight  ");
    			                	basket[count]=new Mango(mg.getColour(),sc.nextDouble(),mg.getName(),mg.getFresh());  
    				                 count++;
    				                 break;
    		                   	 }
    			 
    		           	 case 2:
    			                 {
    			                	 System.out.println("Enter how much Orange you want in Weight  ");
    				                 basket[count]=new Orange(or.getColour(),sc.nextDouble(),or.getName(),or.getFresh());  
    			                	count++;
    			                	
    			                 	 break;
    			                  }
    		           	 case 3:
    		                	 {
    		                		 System.out.println("Enter how much Orange you want in Weight  ");
    		                		 basket[count]=new Apple(ap.getColour(),sc.nextDouble(),ap.getName(),ap.getFresh());  
    			                	
    		                		 count++;
    				                 
    				              
    			                 	 break;
    		                  	 }
    			           case 4:
    			                 {
    			                    flag =false;
    			                     break;
    			                  }
    		          	 default:
    			                  {
    				                 System.out.println("Invalid Choice");
    			                  }	 
      			            }
			 }
			 else
			 {
				 System.out.println("Not a number");
			 }
			 }
			 else {
				 System.out.println("Your Limit exceed ! Kindly Exit");
				 flag=false;
			 }
			 } while(flag);
    		
		 //only fruits name
		 System.out.println();
		 System.out.println("Fruit names");
			 for(Fruit b:basket)
				 System.out.println(b.getName());
			
			//name,colour,weight,taste of fruit
			 System.out.println();
			System.out.println("detailing of fruits");
			for (Fruit b:basket)
				System.out.println(b.toString());
		
			//mark fruit stale
			System.out.println();
			System.out.println("Which Fruit want to make stale ");
			System.out.println("Enter the index");
			int index=sc.nextInt()-1;
			if(index>size)
			{
				System.out.println("Invalid Index");
			}
			else
			{
				//by setting fruit as stale marked it as false
				basket[index].setFresh(false);
				basket[index].toString();
				
				
			}
			
			//marking all sour fruit as stale
			System.out.println();
			System.out.println("Making all sour fruit Sour"); 
			for (Fruit b:basket)
			{
				if(b.taste().equals("Sour"))
				{
					b.setFresh(false);
				}
				System.out.println(b.toString());
			}
			
			// invoking fruit functionality
			System.out.println();
			System.out.println("Enter the index whose specific functionality is--");
			if(sc.hasNextInt())
			{
				int in=sc.nextInt()-1;
			
			if(basket[in].getName()=="Mango")
				mg.pulp();
			else if(basket[in].getName()=="Orange")
				or.juice();
			else
				ap.jam();
			}
		
		
		
		
		
		
		//Apple a=new Apple(sc.next(), sc.nextDouble(),sc.next(), sc.nextBoolean());
		//Mango m=new Mango(sc.next(), sc.nextDouble(),sc.next(), sc.nextBoolean());
		//Orange o=new Orange(sc.next(), sc.nextDouble(),sc.next(), sc.nextBoolean());
		sc.close();
	}

}
