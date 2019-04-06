package class17;

public class NestedLoop {
	
	public static void main(String[] args) {
		NestedLoop obj=new NestedLoop();
		obj.printNumber();
		
	}
	 public void printNumber() {
		for (int i=1;i<=2;i++) {
			for(int y=0;y<=3;y++) {
				System.out.println(i+""+y);
				
	
			}
		} 
	}

}
