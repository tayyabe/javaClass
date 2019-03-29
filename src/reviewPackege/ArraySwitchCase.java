package reviewPackege;

public class ArraySwitchCase {
	public static void main(String[] args) {
		String[]country= {"pakistan","USA","Afghnistan"};
		for(String countries:country) {
			
			switch(countries) {
			case"pakistan":
				System.out.println("Islamabad");
				break;
				
			case"USA":
				System.out.println("Washington DC");
				break;
				
			case"Afghnistan":
				System.out.println("kabul");
				break;
				default:
					System.out.println("erroe");
			}
		}
	}

}
