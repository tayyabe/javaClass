import java.util.Scanner;

public class weatherCondition {
	public static void main(String[] args) {
		int temp;
		boolean raining;
		boolean snowing;
		boolean sunny;
		String activity;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the temp");
		temp=scan.nextInt();
		
		if (temp>=40&&temp<=80) {
			System.out.println("is it raining");
			raining=scan.nextBoolean();
			if(raining) {
				activity="watch movie";
			}else {
				activity="go hiking";
			}
			}else if(temp>=25&&temp<=40) {
				System.out.println("is it snowing");
				snowing=scan.nextBoolean();
				if(snowing) {
					activity="snow boarding";
				}else {
					activity="coding";
					
				}
			}else if(temp>80) {
				System.out.println("is it sunny");
				sunny=scan.nextBoolean();
				if(sunny) {
					activity="go to the beach";
				}else {
					activity="stay home";
				}
			}else {
				activity="unknown";
			}
		System.out.println(activity);
	}	
}
	
