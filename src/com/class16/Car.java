package com.class16;

public class Car {
	String make,model,color;
	int door,wheels;
	
	public static void main(String[] args) {
		// className variableName=new ClassName();
		Car car1=new Car();
		car1.make="Honda";
		car1.model="Civic";
		car1.color="Black";
		car1.door=4;
		car1.wheels=4;
		System.out.println("car " +car1.make+ " has " +car1.wheels+ " wheels" );
		//car1 behavior
		car1.drive();
		car1.reverse();
		car1.Stop();
		System.out.println("------------------------");
		// create object 2
		Car car2=new Car();
		car2.make="tesla";
		car2.model="Model X";
		car2.color="Blue";
		car2.wheels=4;
		car2.door=4;
		System.out.println("my car is "+car2.color+ " "+car2.make);
		//define behave
		car2.drive();
		car2.reverse();
		car2.Stop();
		
	
	}	
	void drive() {
		System.out.println("car can drive");
	}
	void Stop() {
		System.out.println("car can stop");
	}
	void reverse() {
		System.out.println("car can reverse");
	}

}
