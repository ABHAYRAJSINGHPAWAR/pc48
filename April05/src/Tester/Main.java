package Tester;

import java.util.Scanner;

import com.cdac.events.Faculty;
import com.cdac.events.Person;
import com.cdac.events.Student;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the capacity of hall");
		int size=sc.nextInt();
		Person[] arr=new Person[size];
		
		int count=0;
		boolean flag=true;
		do {
			
		System.out.println("Press 1 Register for Student ");
		System.out.println("Press 2 Register for Faculty ");
		System.out.println("Press 3 Display All Event member");
		System.out.println("Press 4 Display Specific member Details");
		System.out.println("Press 0 to Exit");
		
		int ch=0;
		System.out.println("Enter Your Choice");
		if (sc.hasNextInt()) {
			 int check=sc.nextInt();
			 if(check <5 && check>-1)
				 ch=check;
		}
			
		switch(ch) {
		case 1:
		        {
		        	if(count<size)
		        	{
		        		System.out.println("Enter Student First Name");
		        		String fn=sc.next();
		        		System.out.println("Enter Student last name");
		        		String ln=sc.next();
		        		System.out.println("Enter Student Course");
		        		String co=sc.next();
		        		System.out.println("Enter Student marks");
		        		int ma=sc.nextInt();
		        		System.out.println("Enter Student fees");
                        int fe=sc.nextInt();		        	  
		        		arr[count]= new Student(fn,ln,co,ma,fe);
		        		System.out.println();
		        	}
		        	else
		        	{
		        		System.out.println("*****************************************************************************************");
		        		System.out.println("Event is Full! Try Next Time");
                        System.out.println("******************************************************************************************");
		        	}
		        	count++;			        
		        	break;
		        }
		        
		case 2:
		        {
		        	if(count<size)
		        	{
		        		System.out.println("Enter Faculty First Name");
		        		String fn=sc.next();
		        		System.out.println("Enter Faculty last name");
		        		String ln=sc.next();
		        		System.out.println("Enter Faculty department");
		        		String de=sc.next();
		        		System.out.println("Enter Faculty sme");
		        		String sm=sc.next();
		        		arr[count]= new Faculty(fn,ln,de,sm);
		        	}
		        	else
		        	{
		        		System.out.println("");
		        		System.out.println("Event is Full! Try Next Time");
		        	System.out.println("***************************************************************************************************");
		        	}count++;
		        	break;
		        }
		case 3:
		        {
		        	for(Person p:arr)
		        	{
		        		System.out.println(p);
		        	}
		        	
		        	break;
		        }

		case 4:
		        {
		        	System.out.println("Enter Seat Number");
		        	
		        	if(sc.hasNextInt()  ) {
		        		int m=sc.nextInt()-1;
		        		if(m<arr.length)
		        	          System.out.println(arr[m]);
		        	}
		        	else
		        	System.out.println("Wrong Seat number");
		        
		        	break;
		        }

		case 0:
		        {
		        	flag=false;
		        break;	
		        }  
		        default:
		        {
		        	System.out.println("Wrong Choice!");
		        }
		}
		
		} while(flag);
		
		//Person s = new Student("Shivam","Verma","DAC",67,115000);
		//32Person f=new Faculty("Yashi","Gaur","H.R.","Psychologist");
		
		//System.out.println(s.getDetails());
//		System.out.println(s.getDetails());
		//System.out.println(f.getDetails());
		
		
		sc.close();

	}

}
