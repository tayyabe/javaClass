package class18;



public class calculator1 {

	
		int sum(int a,int b,int c) {
			return(a+b+c);
			
		}
	int ave(int a,int b,int c) {
		return (a+b+c)/3;
	}
	int min(int a,int b ,int c) {
		int min=a;
		if(b<a) {
			min=b;
		}
		return min;
	}
	int max(int a, int b,int c) {
		int max=c;
		if(c>b) {
			max=c;
		}
		return max;
	}
 
}
