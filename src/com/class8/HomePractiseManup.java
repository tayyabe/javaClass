package com.class8;

public class HomePractiseManup {
	public static void main(String[] args) {
		
		String name="Tayyab Raza";
		
		int length=name.length();
		System.out.println(length);
		
		//change case of String
		String name1=name.toLowerCase();
		System.out.println(name1);
		
		//compares two String
		String firstName="Tayyab";
		String lastName="TayyaB";
		boolean equality=firstName.equals(lastName);
		System.out.println(equality);
		
		//Ignoring lower and upper case letters and then doing equality
		
		boolean equality2=firstName.equalsIgnoreCase(lastName);
		System.out.println(equality2);
		
		//how to check char which character you want
		System.out.println(name.charAt(4));
		
		// how to check place or position of a letter
		System.out.println(name.indexOf("y"));
		
		// how to find a duplicate position of a letter e.g y and y
		System.out.println(name.indexOf("y",3));
		
		// how to find a location of a word
		System.out.println(name.indexOf("Raza"));
		
		// index of a word which is not in the string always return -1
		System.out.println(name.indexOf("abbasi"));
		
	}

}
