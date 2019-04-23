package com.inheritance;

public class Test890 {
public static void main(String[] args) {
	Employee obj= new Employee();
	obj.name="Joe";
	obj.lastName="Smith";
	obj.age=35;
	obj.salary=35000;
	obj.def();
	
	
	Student obj1= new Student();
	obj1.name="Adam";
	obj1.lastName="Smith";
	obj1.age=15;
	obj1.grade=10;
	obj1.ghi();
	
	Retire obj2= new Retire();
	obj2.name="Adam";
	obj2.lastName="Smith";
	obj2.age=15;
	obj2.seniorActivity="Tour";
	obj2.jkl();
}
}
