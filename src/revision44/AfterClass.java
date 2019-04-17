package revision44;

public class AfterClass {
	
	
	
	public static void main(String[] args) {
		
	
		
		AfterClass obj2= new AfterClass();
		
		String finalemail=obj2.isEmail("tayyab", "raza", "@gmail.com");
		System.out.println(finalemail);
	}
	
	String isEmail(String name, String lastName, String email) {
	
		return name+lastName+email;
		
	}
}
