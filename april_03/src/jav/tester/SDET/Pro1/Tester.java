package jav.tester.SDET.Pro1;
import jav.dev.pro1.Point2D;
import java.util.Scanner;
class Tester{
             public static void main(String []Args)
	     {
		     
	Scanner sc=new Scanner(System.in);
                  System.out.println("Enter First Cordinate Abssica ");
		    int x=sc.nextInt();

                  System.out.println("Enter First Cordinate Ordinate ");
		    int y=sc.nextInt();
                  
		     Point2D p1= new Point2D(x,y);
                  System.out.println("Enter Second Cordinate Abssica ");
		     x=sc.nextInt();

                  System.out.println("Enter Second Cordinate Ordinate ");
		     y=sc.nextInt();

		     Point2D p2=new Point2D(x,y);

                    System.out.println("FIRST CORDINATE IS : " +p1.show());
                    System.out.println("SECOND CORDINATE IS : " +p2.show());
          
					boolean res=p1.equal(p2);
			//		System.out.println(res);   //for checking response
					if(res)
					{
						System.out.println("Equal coordinate");
					}
					else{
					System.out.println("Diffrent Coordinate");
					
				}
                   if(!res)
				   {
				   double response=p1.calculateDistance(p2);
					System.out.println("Distance between coordinates : " +response);
				   }
	            sc.close();
	     }

			
           


	
}
