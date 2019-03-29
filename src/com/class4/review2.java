package com.class4;

public class review2 {
	public static void main(String[] args) {
		double sum=0;
		int [][] numbers= {
				{2,6,9,3,7},
				{1,7,9,4,8},
				{0,4,6,2,5},
				{0,1,2,3}
		};
		
		for(int i=0;i<numbers.length;i++) {
			sum+=numbers[i][2];
			
			
		}
		System.out.println(sum/5);
		
	}

}
