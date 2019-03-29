import java.util.Scanner;

public class ObjectShape {
	public static void main(String[] args) {
		int length;
		int width;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the length");
		length=scan.nextInt();
		System.out.println("Please enter the width");
		width=scan.nextInt();
		if (length>17 ) {
			System.out.println("The shape of your object is rectangle");
		}else if(width==16) {
			System.out.println("The shape of your object is rectangle");
		}else {
			System.out.println("The shape of your object is square");
		}
	 
	}

}
