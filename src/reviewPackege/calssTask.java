package reviewPackege;

import java.util.Scanner;

public class calssTask {
	public static void main(String[] args) {
		
		int startPoint;
		int endPoint;
		int sumEven=0;
		int sumOdd=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter start Point");
		startPoint=scan.nextInt();
		
		System.out.println("please enter end point");
		endPoint=scan.nextInt();
		
		for(int a=10; a<=20;a++) {
			if(a%2==0) {
				sumEven+=a;
				
			}else {
			  sumOdd+=a;
			}
			
		}
		System.out.println("the sum of even "+sumEven);
		System.out.println("the sum of odd "+sumOdd);
	}
}

