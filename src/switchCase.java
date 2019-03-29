import java.util.Scanner;

public class switchCase {
	public static void main(String[] args) {
		
		String country;
		String favoriteFood;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your country");
		country=scan.nextLine();
		
		switch (country) {
		case "USA":
			favoriteFood="burger";
			break;
		case "pakistan":
			favoriteFood="biryani";
			break;
			
			default:
				favoriteFood="unknown";
		}
		System.out.println("your favorite food is " +favoriteFood);
	}

}
