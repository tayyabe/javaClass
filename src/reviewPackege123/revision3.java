package reviewPackege123;

public class revision3 {
	
	
	public static void main(String[] args) {
		
		revision3 obj= new revision3();
		
		boolean newaray=obj.isPalidrom("madam");
		
		System.out.println(newaray);
	}
	boolean isPalidrom(String str) {
		
		String []array=str.split("");
		
		String reverse="";
		
		for(int i=array.length-1;i>=0;i--) {
			
			reverse=reverse+array[i];
			
			if(reverse.equals(str)) {
				
				return true;
				
			}
			
		}
		return false;
		
	}
}
