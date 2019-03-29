package com.class8;

import java.util.Scanner;

public class HomeWorkPRactise {
	public static void main(String[] args) {
		
		String browser;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the browser name to proceed further with execution");
		browser=scan.nextLine();
		
		
		if(!(browser.equalsIgnoreCase("ChRoME"))) {
			
			
			if(!(browser.equals("FireFOX"))) {
				
				if(!(browser.equals("Ie"))) {
					
					if(browser.equals(browser)) {
			
						System.out.println("Invalid Browser");
					}
				
	
				}else {
					System.out.println("Proceed with ie Browser");
				}
			}else {
				System.out.println("Proceed with fireFox Browser");
			}
		}else {
			System.out.println("Proceed with the chrome Browser");
		
		}
		}

}
