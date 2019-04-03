package com.class8;

public class usinSubstring {
	public static void main(String[] args) {
		String original="Today is java class";
		String reverse="";
		
		
		for(int i=original.length();i>0;i--) {
	
			reverse=reverse+original.substring(i-1,i);
			
		}
		System.out.println(reverse);
	}
}

