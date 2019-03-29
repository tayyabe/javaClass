package com.class8;

public class arraysDimensions {
	public static void main(String[] args) {
		   // Creating a 2D array;

	    int[][] d = new int[4][4];
	    
	    d[0][0]=12;
	    d[0][1]=13;
	    d[0][2]=14;
	    d[0][3]=15;
	    
	    d[1][0]=1;
	    d[1][1]=2;
	    d[1][2]=3;
	    d[1][3]=4;
	    
	    d[2][0]=5;
	    d[2][1]=10;
	    d[2][2]=15;
	    d[2][3]=20;
	    
	    d[3][0]=100;
	    d[3][1]=200;
	    d[3][2]=300;
	    d[3][3]=400;
	    
	    System.out.println(d[2][3]);//20
	    System.out.println(d[3][3]);//400
	    
	    //2nd way without new
	    int largest=0;
	    int[][] e= {
	            {12,13,14,15},
	            {1,2,3,4},
	            {5,10,15,20},
	            {100,200,300,400}};
	    for(int i=3;i<e.length;i++) {
	    	for(int j=0;j<e[i].length;j++) {
	    	if(largest<e[i][j])
	    	largest=e[i][j];
	   
	}
	}
	    System.out.println(largest);

}

}

