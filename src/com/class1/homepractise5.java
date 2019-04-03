
package com.class1;

import java.util.Scanner;

public class homepractise5 {
	public static void main(String[] args) {
		int number;
		boolean prime=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the number");
		number=scan.nextInt();
		
		for(int i=2;i<number;i++) {
			if(number%i!=0) {
				}else {
					prime=false;
				}
		}
		System.out.println(prime);
	}

}
