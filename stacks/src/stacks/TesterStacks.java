package stacks;
import java.util.*;
public class TesterStacks  {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean flage = false;
		StackInterface s=null;
		while(!flage) {
			System.out.println("Option are :");
			System.out.println("1.Fixed Stack\n"+ "2.Growable Stack\n"
					+ "3.Push data\n" + "4.Pop data\n"+"5.show" + "0.Exit");
			System.out.println("Enter the Option");
			switch (sc.nextInt()) {
			case 1: // Fixed Stack
				if(s!=null) {
					System.out.println("Stack is aready chouse...");
				}
				else {
					s = new FixedStack();
				}
				break;

			case 2: // Growable Stack
				if(s!=null) {
				System.out.println("Stack is aready chouse...");
				}
				else {
					s = new GrowableStack();
				}
				break;
			
			case 3: // Push Data
				System.out.println("ID , Name, Adress");
				s.push();
				break;
				
			case 4: // Pop Data
				s.pop();
				break;
			case 5: //show
				s.show();
				
			case 0: // Exit
				flage = true;
				break;
			}
		}
		
		sc.close();
	}

}
