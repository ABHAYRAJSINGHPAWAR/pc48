import java.util.Scanner;

class Average {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter First Double Number : ");
		
		double num1, num2;
		if (s.hasNextDouble()) {
			num1 = s.nextDouble();
		}
		else {

			System.out.println("Entered Number is not of type Double");
			s.next();
			return;
		}
		System.out.println("Enter Second Double Number : ");
		if (s.hasNextDouble()) {
			
			num2 = s.nextDouble();
		}
		else {
			
			System.out.println("Entered Number is not of type Double");
			s.next();
			return;
		}
		
		System.out.println("Average is : " + ((num1 + num2) / 2));

		s.close();
	}
}
