package com.class1;

public class task2 {
	public static void main(String[] args) {
		String name="TayyabR";
		if(!name.isEmpty()) {
			if(name.length()%2!=0 && name.length()>=3) {
				System.out.println(name.charAt(name.length()/2));
			}
		}
	}

}
