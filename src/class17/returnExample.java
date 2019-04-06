package class17;

public class returnExample {
	public static void main(String[] args) {
		returnExample obj=new returnExample();
		int number1=obj.number(20,10);
		System.out.println(number1);
		
	}
	int number(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
		
		
	}

}
