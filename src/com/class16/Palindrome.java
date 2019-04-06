package com.class16;

public class Palindrome {
	String reverse="";
	public static void main(String[] args) {
		Palindrome obj=new Palindrome();
		obj.palindromecheck("madam");
		
	}
	void palindromecheck(String name) {
		
		
		for(int i=name.length();i>0;i--) {
			
			reverse=reverse+name.substring(i-1,i);		
		
	}
		if(name.contentEquals(name)) {
			System.out.println(name+ " is a palindrome");
		}
	}
}