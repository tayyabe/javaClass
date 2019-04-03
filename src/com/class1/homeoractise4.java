package com.class1;

public class homeoractise4 {
	public static void main(String[] args) {
		String str="tayyab is nice";
		String reverse="";
		for(int i=str.length();i>0;i--) {
			reverse=reverse+str.substring(i-1,i);
		}
		
		String []words=reverse.split(" ");
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]+" ");
		}
	}

}
