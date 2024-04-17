package com;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import com.classes.Product;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //list init 
		List<Integer> arr2=List.of(1,2,3,4,5,6,7);
		//arr2.add(7);
		List<Integer> arr= new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        arr.add(7); 
		System.out.println(arr);
         Collections.shuffle(arr);
         System.out.println(arr);
         System.out.println("********************************************");
         //by lambda function
        arr.forEach(a->System.out.print(a+" "));
        System.out.println();
        arr2.forEach(a->System.out.print(a+" "));
        System.out.println();
         
         //hash map init
         HashMap<Integer,String> hm=new HashMap<>();
         hm.put(1, "Abhay");
         hm.put(2, "Abhimanyu");
         hm.put(3, "Akash");
         hm.put(4, "Avinash");
         hm.put(5, "Abhishek");
         hm.put(6, "Ajeeet");
         System.out.println(hm);
         System.out.println("***********************************************");
         //by lambda function
         hm.forEach((k,v)->System.out.print(k +" " +v +" | "));
         System.out.println();
         
         int a=1;
         String am="Abhay";
         System.out.println("key matched : " +hm.containsKey(a));  //checking keys
         System.out.println("value matched : " +hm.containsValue(am)); //checking values
         System.out.println();
         
         System.out.println("+++++++++++++++++++++++++UDT DATATYPES+++++++++++++++++++++++++++++");
         //UDT DATATYPES
         Product p1=new Product(12121,"Pounds",65);
         Product p2=new Product(12143,"Lakhme",185);
         Product p3=new Product(12176,"Emami",95);
         Product p4=new Product(19813,"G&L",105);
         Product p5=new Product(19814,"Nivea",75);
         Product p6=new Product(19892,"Vicco",85);
         
         List <Product> arr3=new ArrayList<>();
         arr3.add(p1);
         arr3.add(p2);
         arr3.add(p3);
         arr3.add(p4);
         arr3.add(p5);
         arr3.add(p6);
         
         //lambda exp
         arr3.forEach(p->System.out.println(p));
         
         System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
         HashMap<Integer,Product> hm1=new HashMap<>();
         hm1.put(1,p1);
         hm1.put(2,p2);
         hm1.put(3,p3);
         hm1.put(4,p4);
         hm1.put(5,p5);
         hm1.put(6,p6);
         
         hm1.forEach((k,v)->System.out.println(" S.NO "+k +" "+v) );
         
	}

}
