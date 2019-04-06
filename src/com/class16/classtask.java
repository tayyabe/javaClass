package com.class16;

public class classtask {
	
	public static void main(String[] args) {
		classtask obj=new classtask();
		obj.evenOdd(10);
		obj.evenOdd(7);
		
	}
	void evenOdd(int numbers) {
		if(numbers%2==0) {
			System.out.println(numbers+ " is a even number");
		}else {
			System.out.println(numbers+ " is an odd number");
		}
		
		
	}

}
