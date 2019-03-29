package com.class4;

public class quizClass {
	public static void main(String[] args) {
		int[][] d=new int[3][4];
		 int largest=0;
		    int[][] e={
		    		{5,2,3,7},
					{1,5,1,1},
					{8,3,1,2}
		    };
		    for(int i=0;i<e.length;i++) {
		    	for(int j=0;j<e[i].length;j++) {
		    	if(largest<e[i][j])
		    	largest=e[i][j];
		   
		}
		}
		   System.out.println(largest); 
		    }
		}


