import java.io.InputStream;
import java.util.Scanner;

public class EligibleVote {
	public static void main(String[] args) {
		int Voteage=18;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your age");
		Voteage=scan.nextInt();
		if (Voteage>=18) {
			System.out.println("You are eligible to vote");
		}else {
			System.out.println("You are not eligible to vote");
		}
	
	}

}
