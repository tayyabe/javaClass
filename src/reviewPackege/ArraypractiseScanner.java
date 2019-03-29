package reviewPackege;

import java.util.Scanner;

public class ArraypractiseScanner {
	public static void main(String[] args) {
		 String[] days= new String[7];
		  String[]days1= {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		 String day;
		 Scanner scan=new Scanner(System.in);
		
			System.out.println("Please enter day  1 of the week");
			 day=scan.nextLine();
			     System.out.println("Please enter day 2 of the week");
				 day=scan.nextLine();
				 System.out.println("Please enter day 3 of the week");
				 day=scan.nextLine();
                 System.out.println("Please enter day 4 of the week");
                 day=scan.nextLine();
                 System.out.println("Please enter day 5 of the week");
                 day=scan.nextLine();
                 System.out.println("Please enter day 6 of the week");
                 day=scan.nextLine();
                 System.out.println("Please enter day 7 of the week");
                 day=scan.nextLine();
        		 for(int a=0;a<days1.length;a++) {
        		    System.out.println(days1[a]); 
        		    
        		    break;
		 }
		
					 
			 
		 }
		 
	}


