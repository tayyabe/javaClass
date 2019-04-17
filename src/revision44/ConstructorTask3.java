package revision44;

public class ConstructorTask3 {
	int number1;
	int number2;
	
public static void main(String[] args) {
	
	ConstructorTask3 obj= new ConstructorTask3();
	obj.ConstructorTask34(18, 20);
}
	
	
	void ConstructorTask34(int num1, int num2){
		if(num1>num2) {
			System.out.println(num1+ " is greater then "+num2 );
		}else {
			System.out.println(num2+ " is greater then "+num1);
		}
		
	}

}
