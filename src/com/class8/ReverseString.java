package com.class8;

public class ReverseString {
public static void main(String[] args) {
	// reverse a string without using a reverse function
	String original="today is java class";
	String reverse="";
	char[]array=original.toCharArray();
	for(int i=array.length-1;i>=0;i--) {
		reverse=reverse+array[i];
	}
	System.out.println(reverse);
}
}
