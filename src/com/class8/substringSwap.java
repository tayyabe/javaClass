package com.class8;

public class substringSwap {
	public static void main(String[] args) {
		String str1 = "Group";
        String str2 = "testMasters";

        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("Frist String is now " + str1);
        System.out.println("Second String is now " + str2);

    }
	}


