package com.class5;

public class nestedIf {
	public static void main(String[] args) {
		double gpa=3.4;
		double expectedGpa=2.4;
		boolean hasDiploma=true;
		if(hasDiploma) {
			System.out.println("congratulations");
			if(gpa>expectedGpa) {
				System.out.println("you can have a job");
				
			}else {
				System.out.println("you can not have a job");
			}
		}else {
			System.out.print("go get your ass to school");
		}
		
	}

}
