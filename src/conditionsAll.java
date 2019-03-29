import java.util.Scanner;

public interface conditionsAll {
	public static void main(String[] args) {
		boolean sales;
		int price;
		int discount;
		double finalprice;
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter if there is sale");
		sales=scan.nextBoolean();
		if (sales) {
			
			System.out.println("please enter the price");
			price=scan.nextInt();
			System.out.println("let's check all discounts");
			if(price<20) {
				discount=20;
				finalprice=price-(price*0.2);
			}else if(price>=20 && price<100) {
				discount=30;
				finalprice=price-(price-0.3);
			}else if(price>=40&&price<200) {
				discount=40;
				finalprice=price-(price*0.4);
			}else if(price>=40&&price<500){
				discount=50;
				finalprice=price-(price*0.50);
			}else {
				discount=75;
				finalprice=price-(price*0.75);
			}
			System.out.println("finale price is"+finalprice);
		}else {
			System.out.println("not intrested");
		}
	}

}
