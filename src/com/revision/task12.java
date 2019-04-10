package com.revision;

public class task12 {
	
	
	public static void main(String[] args) {
		task12 obj= new task12();
		String reverse=obj.sentence("tayyab");
		System.out.println(reverse);
		
		task12 obj12=new task12();
		boolean word1=obj.name("madam");
		System.out.println(word1);
		}
	
	public String sentence(String orignal) {
	
		String reverse="";
		
		for(int i=orignal.length()-1;i>=0;i--) {
			reverse=reverse+orignal.charAt(i);
			
		}
		return reverse;
		 
	}
	
	boolean name(String word) {
		
		String reverse="";
		for(int i=word.length()-1;i>=0;i--) {
			reverse=reverse+word.charAt(i);
			if(reverse.equals(word)) {
				return true;
			}
		}
		return false;
		
	}
	}
