package com.class8;

public class classTask2 {
	public static void main(String[] args) {
		String[][] americanCars= {
				{"ford","chevy","GMC","dodge"},
				{"benz","BMW","VW"},
				{"porche","Alfa Romeo","Ferrai"},
		};
		for(int row=0;row<americanCars.length;row++) {
			for(int clm=0;clm<americanCars[row].length;clm++) {
				System.out.print(americanCars[row][clm]+", ");
				
			}
			System.out.println();
		}
	}
}
