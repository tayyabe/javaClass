package reviewPackege;

import java.util.Scanner;

public class leapYear {
	public static void main(String[] args) {
		
		int year;
		Scanner scan= new Scanner(System.in);
		
		
		for(int a=1;a<=4;a++) {
			System.out.println("please enter a year");
			year=scan.nextInt();
		if(year%4==0) {
			System.out.println("it is a leapyear");
		}else {
			System.out.println("it is not a leapyear");
			
		}
		
	}
	}
}
