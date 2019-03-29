package reviewPackege;

public class NestedFor {
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			for(int y=0; y<3;y++) {
				System.out.println("-----i am inner loop---");
			}
			System.out.println("i am outer loop");
		}
	}

}
