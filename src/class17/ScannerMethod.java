package class17;

import java.util.Scanner;

public class ScannerMethod {
	public static void main(String[] args) {
		ScannerMethod obj=new ScannerMethod();
		
		Scanner scan= new Scanner(System.in);
		System.out.println("please enter first number");
		int a=scan.nextInt();
		System.out.println("please enter second number");
		int b=scan.nextInt();
		
		
		int sum1=obj.sum(a, b);
		System.out.println("The sum of two int is " +sum1);
		
	}
  int sum(int a, int b) {
	return a+b;
	
}
}
