import java.util.Scanner;

public class switchGrade {
	public static void main(String[] args) {
	String instructor;
    String explanation;
	    Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the instructor");
		instructor=scan.nextLine();
		 
		explanation=scan.nextLine();
		
		switch (instructor) {
		case "Shiva":
			System.out.println("Javan Assignment");
			break;
		case "Sandish":
			System.out.println("SDLC Assignment");
			break;
		case "Weqas":
			System.out.println("Selenium Assignment");
			break;
			default:
				System.out.println("Invalid instructor selected");
			
		}
		
	}

}
