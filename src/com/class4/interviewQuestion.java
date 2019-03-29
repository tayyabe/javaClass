package com.class4;

public class interviewQuestion {
	public static void main(String[] args) {
		int[]numbers= {10,20,30,60};
		int largest=numbers[0];
		for(int a=0;a<numbers.length;a++) {
			if(numbers[a]>largest) {
				largest=numbers[a];
				
			}
			
		}
		System.out.println(largest);
	}
}
