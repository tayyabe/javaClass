package class18;

public class Application {
	public static void main(String[] args) {
		Animals anim= new Animals();
		System.out.println(anim.age);
		System.out.println(anim.weight);
		System.out.println(anim.breed);
		System.out.println(anim.name);
		anim.name="joe";
		anim.age=20;
		anim.breed="german";
		anim.weight=30;
		
		Animals anim2= new Animals();
		System.out.println(anim2.name);
		System.out.println(anim2.age);
		System.out.println(anim2.breed);
		System.out.println(anim2.weight);
		
		
	}

	
	}


