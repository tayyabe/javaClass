package com.class2;

import java.util.Scanner;

public class loopsKind {
	public static void main(String[] args) {
	boolean workday=true;
	int day=1;
	
	while (workday) {
		System.out.println("I need a day off");
		if(day==6) {
			System.out.println("I dont need a day off");
			workday=false;
		}
			
		day++;
	}
	
}

}