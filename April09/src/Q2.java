import java.util.Arrays;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//non literal String
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++ Non Literal String++++++++++++++++++++++++++++++++++++++++");
     String s1=new String("Hello");
     String s2=new String("Hello");
     String s3=new String("hello");
     String s4=new String("HELLO");
     String s5=new String("ell");
     String s6=new String("hELLo how are you ,hELLo are you listening");
     System.out.println(s1==s2);
     System.out.println(s1==s3);
     System.out.println(s1==s4);
     System.out.println(s1==s5);
     System.out.println(s1==s6);
     
     System.out.println(s1.equals(s2));
     System.out.println(s1.equals(s3));
     System.out.println(s1.equals(s4));
     System.out.println(s1.equals(s5));
     System.out.println("last : " +s1.equals(s6));
     
     System.out.println("CONTAINS : "+s1.contains(s5));
     
     System.out.println("INDEX OF 'o' " +s1.indexOf('o'));
     System.out.println("INDEX OF 'are' : " +s6.indexOf("are"));
     System.out.println("Last index of " +s6.lastIndexOf("hELLo"));
     
     System.out.println(s3.compareTo(s1));
     System.out.println(s2.compareTo(s3));
     System.out.println(s1.compareTo(s2));
     
     String[] arr=s6.split("");
     System.out.println(Arrays.toString(arr));
	}

}
