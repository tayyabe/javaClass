package reviewPackege123;

public class task15 {
	
	String email(String firstName, String LastName, String email1) {
	
		return firstName+LastName+email1;
		
	}
public static void main(String[] args) {
	task15 obj=new task15();
	String finalReslt=obj.email("Tayyab","Raza","@gmail.com");
	System.out.println(finalReslt);
}
}
