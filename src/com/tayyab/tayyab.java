package com.tayyab;
public class tayyab {
	
	
	
		
		public static void main(String[] args){
			tayyab obj =new tayyab();
			System.out.println(obj.mixString("12345","abcde")); //should be 1a2b3c4d5e
			System.out.println(obj.mixString("howdy","hello")); //should be hhoewldlyo
		}
		
	
    String mixString(String s1, String s2) {
    	
    	
    String name="";
    String [] array=s1.split("");
    String []array2=s2.split("");
		for(int i=0;i<s1.length();i++) {
	    name= name+array[i]+array2[i];
	
	   
	  
	
    	}
		return name;
   }
}
