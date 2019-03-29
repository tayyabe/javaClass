
public class practiseHome12 {
	public static void main(String[] args) {
	double intrest=2.5;
	int money=250000;
	
	if(intrest>2.5) {
		System.out.println("customer will not buy it");
	}else {
		System.out.println("customer will consider buying");
		if(money<=20000) {
			System.out.println("customer will pay cash");
		}else {
			System.out.println("customer will take loan ");
		}
	}
	}

}
