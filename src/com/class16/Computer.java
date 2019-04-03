package com.class16;

public class Computer {
	boolean mouse,keybord;
	int screen,ram;
	String Os,brand;
	public static void main(String[] args) {
		
	
	Computer comp1=new Computer();
	comp1.mouse=true;
	comp1.keybord=true;
	comp1.Os="mac";
	comp1.screen=2;
	comp1.ram=8;
	comp1.brand="apple";
	
	comp1.Watchmovies();
	comp1.javaCoding();
	comp1.games();
	
	Computer comp2=new Computer();
	comp2.mouse=true;
	comp2.keybord=true;
	comp2.screen=4;
	comp2.ram=6;
	comp2.Os="Windows";
	comp2.brand="Hp";
	
	comp2.Watchmovies();
	comp2.javaCoding();
	comp2.games();

}
	void Watchmovies(){
		System.out.println("you can watch movies");
	}
	void javaCoding() {
		System.out.println("you can do java coding");
	}
	void games(){
		System.out.println("you can play games");
	}
}