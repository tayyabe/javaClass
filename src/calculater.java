import java.util.Scanner;

public class calculater {
	public static void main(String[] args) {
		int a;
		int b;
		 String operator;
	    
	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the ist number");
		a=scan.nextInt();
		
		System.out.println("please enter 2nd number");
		b=scan.nextInt();
		System.out.println("please enter the operator");
		
		switch(a) {
		case '+':
			operator="a+b";
			break;
			
		}
		
	}
}
