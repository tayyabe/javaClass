import java.util.Scanner;

public class practiseClass {
	public static void main(String[] args) {
		int height1;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the height in inches");
		height1=scan.nextInt();
		
		
		
		
		
		if (height1>=3&&height1<5) {
			System.out.println("you are short");
		}else if(height1>=5&&height1<=6) {
			System.out.println("you are medium");
		}else if(height1>=6&&height1<=7) {
			System.out.println("you are tall");
		}else {
			System.out.println("you are extra tall");
		}
		
		
	}

}
