package revision44;


	public class Variables {

		static String cEO = "Sumair";

		String name;
		int salary;
		int eID;

		public static void main(String[] args) {
			Variables empl1 = new Variables();
			Variables empl2 = new Variables();
			Variables empl3 = new Variables();
			empl1.info1(cEO, 67, 100432);
			empl2.info(cEO, "Anna", 86, 1004324);
			empl3.info(cEO, "Linda", 74, 1002112);

			
			
//			empl1.name = "Bob";
//			empl2.name = "Anna";
//			empl3.name = "Linda";
//			
//			empl1.salary = 67;
//			empl2.salary = 81;
//			empl3.salary = 73;
//			
//			empl1.eID = 100032;
//			empl2.eID = 100234;
//			empl3.eID = 100111;
//			
//			empl1.info();
//			empl2.info();
//			cEO="Asel";
//			empl3.info();

			
			
			
			
			
		}
		public void info1(String seo, int salary, int eID) {
			System.out.println("CEO " + cEO + " with employe ID #" + eID + " has hourly salary of $" + salary);
		}
		
			public void info(String seo, String name, int salary, int eID) {
			System.out.println("Employe " + name + " with employe ID #" + eID + " has hourly salary of $" + salary);
		}
	}
	


