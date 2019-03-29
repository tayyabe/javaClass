import java.util.Scanner;

public class homeWork3 {
	public static void main(String[] args) {
		int num1;
		int num2;
		int num3;
	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter first number");
		num1=scan.nextInt();
		
		System.out.println("Enter second number");
		num2=scan.nextInt();
		
        System.out.println("Enter third number");
        num3=scan.nextInt();
        
       if (num1>num2) {
    	   if (num1>num3) {
    		   System.out.println(num1+ " is the largest number");
    		   
    	   }else {
    		   System.out.println(num3+ " is the largest number");
    	   }
       }else
    	   if(num2>num3) {
    	    {
    		   System.out.println(num2+ " is the largest number");
    	   }
    	   }else {
    		   System.out.println(num3+ " is the largest number");
    	   }
       }
}


