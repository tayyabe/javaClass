package com.class8;

public class classTaskArrays {
	public static void main(String[] args) {
		
		String[][]food= {
				
				{"apples","bannana","oranges"},
				
				{"carrot","green bean","potato","onion"},
				
				{"egg","butter","milk","panner"},
		};
		
		for(int a=0;a<food.length;a++) {
			for(int b=0;b<food[a].length;b++) {
				System.out.print(food[a][b]+" ,");
			}
			System.out.println();
			
		}
		
	System.out.println("----------------");	
		
		for(String[]foodChain:food) {
			for(String foody:foodChain) {
				System.out.print(foody+" ,");
			}
			System.out.println();
		}
	}

}
