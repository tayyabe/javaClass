package com.class4;

public class review3 {
	public static void main(String[] args) {
		int[][] numbers= {
				{1,2,3,4,5},
				{6,7,8,9},
				{10,11,12,13}
			
		};
		for(int i=1;i<numbers.length;i++){
			for(int j=0;j<numbers[i].length;j++)
				if(numbers[i][j]>7) 
			System.out.print(numbers[i][j]+",");
		}
		System.out.println();
	}
	
	}


