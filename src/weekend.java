import java.util.Scanner;

public class weekend {
public static void main(String[] args) {
	int a;
	int b;
	String w1;
	String w2;
	 Scanner scan=new Scanner(System.in);
	 System.out.println("Please enter two strings");
	 w1=scan.nextLine();
	 w2=scan.nextLine();
	 
	 System.out.println("Please enter two numbers");
	 a=scan.nextInt();
	 b=scan.nextInt();
	 
	 
	 if(a==b && w1==w2) {
		 System.out.println("AND");
	 }else if(a==b || w1==w2) {
		 System.out.println("OR");
	 }else if(a!=b && w1!=w2) {
		 System.out.println("NONE");
	 }else {
		 System.out.println("invalid");
	 }
	 
	 
	
}
}



