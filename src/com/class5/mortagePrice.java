package com.class5;

import java.util.Scanner;

public class mortagePrice {
public static void main(String[] args) {
	double MortageRate=4.5;
	double MortagePrice=30000;
	if(MortageRate>4.5) {
		System.out.println("i am not buying");
		}else {
			System.out.println("i will consider buying");
			if(MortagePrice>20000) {
				System.out.println("i will take loan");
			}else {
				System.out.println("i will pay cash");
			}
		}
	}
}	
