package com.dummy;

import java.time.LocalDate;
import java.util.ArrayList;
import com.enums.ServicePlan;
import com.classes.Customer;


public class DummyData {
        public static ArrayList<Customer> dummyData(){
        	ArrayList<Customer> arr=new ArrayList<>();
        	
			arr.add(new Customer(10002,"Abhimanyu","Singh","abhi@gmail.com","qwerty",12345678,LocalDate.parse("1993-05-11"),ServicePlan.PLATINUM));
			arr.add(new Customer(10003,"Abhishek","Singh","abh@gmail.com","1234",12345678,LocalDate.parse("1992-05-11"),ServicePlan.DIAMOND));
			arr.add(new Customer(10004,"Abhinandan","Singh","ab@gmail.com","18921",12345678,LocalDate.parse("1996-05-11"),ServicePlan.DIAMOND));
			arr.add(new Customer(10005,"Samar","Singh","sa@gmail.com","oiuyfd",12345678,LocalDate.parse("1997-05-11"),ServicePlan.GOLD));
			arr.add(new Customer(10006,"Avneesh","Singh","av@gmail.com","asdty",12345678,LocalDate.parse("1998-05-11"),ServicePlan.PLATINUM));
			arr.add(new Customer(10007,"Arpit","Singh","ar@gmail.com","qwdf",12345678,LocalDate.parse("1999-05-11"),ServicePlan.DIAMOND));
			arr.add(new Customer(10008,"Aditya","Singh","ad@gmail.com","poihg",12345678,LocalDate.parse("1996-05-11"),ServicePlan.GOLD));
        	
        	
        	
        	
        	
			return arr;
        	
        }
}
