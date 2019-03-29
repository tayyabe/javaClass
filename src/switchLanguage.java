import java.util.Scanner;

public class switchLanguage {
	public static void main(String[] args) {
		String country;
		String language;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter your country");
		country=scan.nextLine();
		
		switch (country) {
		case "pakistan":
			language="urdu";
			break;
			default:
				language="unknown";
		}
		System.out.println("your language is " +language);
	}

}
