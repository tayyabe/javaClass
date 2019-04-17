package com.class24;

public class Degree {
	
	
	void getDegree() {
		System.out.println("I got a degree");
	}
}
	class Undergraduated extends Degree{
		
		void getDegree() {
			System.out.println("I am an undergraduated");
		}
	}
		class Postgraduate extends Degree{
			void getDegree() {
				System.out.println("I am a postgraduated");
			}
		}
	


