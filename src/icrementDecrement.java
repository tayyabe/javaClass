
public class icrementDecrement {
public static void main(String[] args) {
	int x=10;
	int y=x;
	
	System.out.println(x+" "+y);
	// post increment a++;
	
	
	int a=299;
	int b=a++;
	// first assign---> increment(int b=a; a=a+1)
	
	System.out.println(a);
	System.out.println(b);
	
	// post decrement x--;
	
	int z=10;
	int c=z--;// first assign ----> decrement(int c=z; z=z-1)
	
	System.out.println(z);
	System.out.println(c);
}

}
