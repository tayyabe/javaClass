package com.weqa;

public class Parent {
	String firstname;
	String lastName;
	int age;
	
	public static void main(String[] args) {
		Parent obj= new Parent("Tayyab", "Raza",26);
		
	}
	
  Parent(String firstName,String lastName, int age){
		System.out.println(firstName+" " +lastName+ " "+age);
	}
}
