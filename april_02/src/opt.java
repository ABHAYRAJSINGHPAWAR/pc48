import java.util.Scanner;

class calci{
             public static void main(String []args)
	     {
		     char ch='Y';
		     Scanner sc=new Scanner(System.in);

                   do{
			   System.out.println("Calculator");
			   System.out.println("Press 1 : Addition");
			   System.out.println("Press 2 : Subtraction");
			   System.out.println("Press 3 : Multiplication");
			   System.out.println("press 4 : Divide ");
			   System.out.println("press other than above key to exit");

			   System.out.println("Enter Your choice ");
			   int choice=sc.nextInt();

			   switch(choice)
			   {
			   case 1:
			   {
				   double a=0,b=0;
				   System.out.println("Enter First Addend");
				   if(sc.hasNextDouble())
				   a=sc.nextDouble();
				   System.out.println("Enter second Addend");
				   if(sc.hasNextDouble())
				   b=sc.nextDouble();
				  System.out.println("Total : " +(a+b));
				  break;
			   }
			   case 2:
			   {
				   double a=0,b=0;
				   System.out.println("Enter Minuend");
				   if(sc.hasNextDouble())
				   a=sc.nextDouble();
				   System.out.println("Enter Subtrahend");
				   if(sc.hasNextDouble())
				   b=sc.nextDouble();
				  System.out.println("Total : " +(a-b));
				  break;
			   }
			   case 3:
			   {
				   double a=0,b=0;
				   System.out.println("Enter Multiplicand");
				   if(sc.hasNextDouble())
				   a=sc.nextDouble();
				   System.out.println("Enter Multiplier");
				   if(sc.hasNextDouble())
				   b=sc.nextDouble();
				  System.out.println("Total : " +(a*b));
				  break;
			   }
			   case 4:
			   {
				   double a=0,b=0;
				   System.out.println("Enter dividend");
				   if(sc.hasNextDouble())
				   a=sc.nextDouble();
				   System.out.println("Enter divisor");
				  if(sc.hasNextDouble())
				    b=sc.nextDouble();
				  System.out.println("Total : " +(a/b));
				  break;
			   }
			   default:{
				   ch='N';
			   }
			   }

                    } while (ch=='Y' ||ch=='y');
            sc.close();
	     }

}
