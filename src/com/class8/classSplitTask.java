package com.class8;

public class classSplitTask {
	public static void main(String[] args) {
		String sentence="Is it saturday? Is it raining?Do we have a java class today?";
		String[] array=sentence.split("[?]");
		
		
		System.out.println("The length of the sentence is " +array.length);
		
		}
	}


