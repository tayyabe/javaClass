import java.util.Scanner;

public class truthTable {
public static void main(String[]args) {
	// using logical operater && or and
	// truth and truth = true;
	// truth and false= false;
	// false and truth = false;
	// falsd and false= false;
	
	 int age;
	Scanner scan= new Scanner(System.in);
	System.out.println("enter you age");
	age=scan.nextInt();
	if(age>=1 && age<3) {
		System.out.println("you are baby");
		
	}else if(age>=3&&age<5) {
		System.out.println("you are toddler");
	}else if(age>=5&&age<13) {
		System.out.println("you are kid");
	}else if(age>=13&&age<20) {
		System.out.println("you are teenager");
	}else if(age>=20&&age<64) {
		System.out.println("you are adult");
	}else {
		System.out.println("you are old");
	}
}
}
