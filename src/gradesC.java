import java.util.Scanner;

public class gradesC {
	public static void main(String[] args) {
		int quiz;
		int midTerm;
		int finalscorre;
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter your quiz score");
		quiz=scan.nextInt();
		
		System.out.println("please enter your midterm score");
		midTerm=scan.nextInt();
		
		System.out.println("please enter your final score");
		finalscorre=scan.nextInt();
		
		int average=(quiz+midTerm+finalscorre)/3;
		System.out.println("your average score"+average);
		
		if (average>=90) {
			System.out.println("grade A");
		}else if(average>=70&&average<90) {
			System.out.println("grade B");
		}else if(average>=50&&average<=70) {
			System.out.println("grade C");
		}else {
			System.out.println("fail F");
		}
			
		
		
	}

}
