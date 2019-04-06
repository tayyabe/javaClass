package com.class16;

public class NoMainMethod {
	//method and variables are member of the class
	String str;// data member
	int num;
	void hello() {
		System.out.println("Hello");
		System.out.println("Hello friends");
	}
	void bye() {
		System.out.println("Bye");
		
	}
	public static void main(String[] args) {
		NoMainMethod obj=new NoMainMethod();
		obj.hello();
		// you can not create a method inside of a method should be outside
		
	}

}
