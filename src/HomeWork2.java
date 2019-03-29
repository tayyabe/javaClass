import java.util.Scanner;

public class HomeWork2 {
	public static void main(String[] args) {
		double num1;
		double num2;
		double num3;
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter first number");
		num1=scan.nextDouble();
		
		System.out.println("please enter second number");
		num2=scan.nextDouble();
		
		System.out.println("please enter third number");
		num3=scan.nextDouble();
		if(num1>num2 && num1>num3) {
			
			System.out.println(+num1+ " is the  largest number ");
			
		}else if(num2>num1 && num2>num3){
			System.out.println(+num2+ " is the largest number ");
		}else if(num3>num1 &&num3>num2){
			System.out.println(num3+ " is largest ");
	
	}else {
		System.out.println("numbers are equal");
	}
	}
	}
