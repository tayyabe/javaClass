package com.class1;

public class homePractise3 {
	public static void main(String[] args) {
		String str="tayyab is nice";
		String reverse="";
		char[]array=str.toCharArray();
		for(int i=str.length()-1;i>=0;i--) {
			reverse=reverse+str.charAt(i);
		}
		System.out.println(reverse);
	}

}
