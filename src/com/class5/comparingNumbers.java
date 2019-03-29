package com.class5;

import java.util.Scanner;

public class comparingNumbers {
	public static void main(String[] args) {
		String cityName;
		int temp;
		Scanner myscanner=new Scanner(System.in);
		System.out.println("enter city name");
		cityName=myscanner.nextLine();
		  
		System.out.println("enter the temprature in fahrenhite");
		temp=myscanner.nextInt();
		
		int convertedTemp=(temp-32)*5/9;
		System.out.println("the temprature in the city " +cityName+ " is "+convertedTemp+"c");
	}

}
