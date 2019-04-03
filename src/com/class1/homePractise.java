package com.class1;

public class homePractise {
	public static void main(String[] args) {
		String str="tayyab is nice";
		String reverse="";
			for(int i=str.length();i>0;i--) {
					reverse=reverse+str.substring(i-1,i);
			
		}
				System.out.println(reverse);
		}

	}


