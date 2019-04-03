package com.class16;

public class Phone {
	
	String brand,color,model;
	int screen;
public static void main(String[] args) {
	
	Phone phn1=new Phone();
	phn1.brand="IPhone";
	phn1.model="xPlus";
	phn1.color="rose gold";
	
	int screen=6;

	
	Phone phn2=new Phone();
	phn2.brand="Android";
	phn2.model="S5";
	phn2.color="black";
	phn2.screen=5;
	
	
	
	Phone phn3=new Phone();
	phn3.brand="Nokia";
	phn3.model="3plus";
	phn3.color="blue";
	
	phn3.makecalls();
	phn3.textmessages();
	phn3.games();
	System.out.println("---------------------");
	
	phn2.makecalls();
	phn2.textmessages();
	phn2.games();
	System.out.println("-------------------");
	
	
	
	
	phn1.makecalls();
	phn1.textmessages();
	phn1.games();
}
void makecalls() {
	System.out.println("you can make calls from " +brand);
}
void textmessages() {
	System.out.println("you can send text messages from " +brand);
}
void games() {
	System.out.println("you can play games on "+brand);
}

}
