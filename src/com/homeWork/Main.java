package com.homeWork;
class Main {
	  public static void main(String[] args) {
	    Child obj= new Child();
	   Child obj2= new Child("hello");
	   }
	}
	class Parent{
	  Parent(){
	    System.out.println("Parent Constructor in parent class with one argument");
	  }
	}
	class Child extends Parent{
		
	  Child(){ 
	    System.out.println("Child Constructor in child class with zero argument");
	  }
	  Child(String str){
	  
	    System.out.println("Child Constructor in child class with one argument");
	  }
	}
