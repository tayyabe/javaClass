package com.class8;

public class findLargestNumber {
	public static void main(String[] args) {
		int []ary= {10,2015,46,299};
		
		int min=ary[0];
		int largest=ary[0];
		int secondLargest=ary[0];
		for (int a:ary) {
			if(a<min) {
				min=a;
			}else if(a>largest) {
				secondLargest=largest;
				largest=a;
			}else if(a>secondLargest) {
				secondLargest=a;
			}
		}
		System.out.println("this is minimum number " +min);
		System.out.println("this is largest number " +largest);
		System.out.println("this is second largest number " +secondLargest);
	}

}
