import java.util.Scanner;

public class scannerNestedif {
public static void main(String[] args) {
	//get two numbers from user and compare them
	int x;
	int y;
	Scanner scan=new Scanner (System.in);
	System.out.println("enter number for x");
	x=scan.nextInt();
    System.out.println("enter number for y");
    y=scan.nextInt();
    if (x>y) {
    	System.out.println(x+ " x is greater than y " +y);
    	
    }else if(y>x) {
    	System.out.println(y+ " y is greater then " +x);
    	
    }else {
    	System.out.println("x ans y are equal");
    	System.out.println("i am done");
    }
}
}
