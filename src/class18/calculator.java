package class18;

import class17.NestedLoop;

public class calculator {
	public static void main(String[] args) {
	
	NestedLoop obj=new NestedLoop();
	obj.printNumber();
	
	}
	void printNumber() {
		for (int i=1;i<=2;i++) {
			for(int y=0;y<=3;y++) {
				System.out.println(i+""+y);
				
	
			}
		} 
	}
}
