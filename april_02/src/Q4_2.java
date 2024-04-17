import java.util.Scanner;

class Menu{
           public static void main(String []args)
	   {
		   int total=0;
		   char choice='Y';
	    Scanner sc=new Scanner(System.in);
           do
	   {
	    System.out.println("Food Menu");
            System.out.println("1 Dosa");
            System.out.println("2 Samosa");
            System.out.println("3 Idli");
            System.out.println("4 Poha");

	    int ch;
	    System.out.println("Enter Your choice");
            ch=sc.nextInt();

	    switch(ch)
	    {
              case 1:{
			     System.out.println("Enter the quantity");
                              int m=sc.nextInt();
			      total=total+m*120;
			      break;
	      }
              case 2:{
			     System.out.println("Enter the quantity");
                              int m=sc.nextInt();
			      total=total+m*20;
			      break;
	      }
              case 3:{
			     System.out.println("Enter the quantity");
                              int m=sc.nextInt();
			      total=total+m*50;
			      break;
	      }
              case 4:{
			     System.out.println("Enter the quantity");
                              int m=sc.nextInt();
			      total=total+m*30;
			      break;
	      }



           }
	   System.out.println("You Want To add More Food (Y/N)");
	   choice=sc.next().charAt(0);
	  //
	  //sc.next();
	   if (choice!='Y' || choice!='y')
		   System.out.println("Total Bill is : " +total);

	   } while(choice=='Y' || choice=='y');
   sc.close();
	   }



	   

}
