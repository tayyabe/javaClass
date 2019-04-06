package com.class16;

public class ReverseString {
	
	
	public static void main(String[] args) {
		ReverseString sentence= new ReverseString();
		sentence.name();
		
		
	}
	void name(){
		String name="Syntax Students";
		String reverse="";
		for(int i=name.length()-1;i>0;i--) {
			reverse=reverse+name.charAt(i);
			
		}
		String []words=reverse.split(" ");
		
		for(int i=words.length-1;i>=0;i--) {
			System.out.print(words[i]+" ");
			
		}
	}

}
