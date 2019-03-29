package com.class2;

public class continueDivisible {
public static void main(String[] args) {
	 
	for(int a=1; a<=20; a++) {
		if(a%3==0) {
			continue;
		}
		System.out.println(a);
	}
}
}
