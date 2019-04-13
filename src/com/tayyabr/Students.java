package com.tayyabr;

public class Students {

	 String Studentname;
     int grade;
     int grade2;
     int grade3;
     
     
     
     
     public Students(String name, int a, int b, int c) {
    	 Studentname=name;
    	 grade=a;
    	 grade2=b;
    	 grade3=c;
    	 
    	 
    	 
     }
  
	
	public void AverageGrade( ) {
		int average=(grade+grade2+grade3)/3;
		System.out.println(Studentname+" "+average);
		
	}
}
