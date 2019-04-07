package class18;

public class Minimum {
	
	
	
 

	static int minimumvalue() {
		int my_array[]= {1,2,4,5,6,7,8,9,10};
		int minimumvalue= my_array[0];
		for(int i=1;i<my_array.length;i++) {
			if(my_array[i]<minimumvalue) {
				minimumvalue=my_array[i];
				
				
				
				
			}
			
		}
		
	
	return minimumvalue;
	
}
	static int maximum() {
		int my_array[]= {1,2,4,5,6,7,8,9,10};
		int maximum= my_array[0];
		for(int i=1;i<my_array.length;i++) {
			if(my_array[i]>maximum) {
				maximum=my_array[i];
				
				
				
				
			}
			
		}
		
	
	return maximum;
	
}
}
