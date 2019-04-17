package com.class22;

public class repellPractice {
	private int isbatch=3;
	private String name="SyntaxSolutions";
	
	public static void main(String[] args) {
		repellPractice obj= new repellPractice();
		int finaln=obj.isbatch(3);
		System.out.println(finaln);
		String finalename=obj.name("SyntaxSolutions");
		System.out.println(finalename);
	}
	private int isbatch(int batch) {
	return isbatch;
		
	}
	private String name(String Name1) {
		return Name1;
		
	}
}
