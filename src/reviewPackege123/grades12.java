package reviewPackege123;

import java.util.Scanner;

public class grades12 {
	char grade;

	
	public static void main(String[] args) {
		grades12 obj= new grades12();
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Please enter the score");
		int score=scan.nextInt();
		
		
		System.out.println(obj.grades(score));
		
		
		
		
	}
	
		public char grades(int score) {
			
			
			if(score>=90) {
				grade='A';
			}
				
			else if(score>=80) {
				grade='B';
				}
					
			else if(score>=70) {
					grade='C';
					}
			else {
				grade='f';
			}
			
			return grade;
			
			
		}
		
	}
	
