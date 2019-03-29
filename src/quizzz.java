
public class quizzz {
	public static void main(String[] args) {
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
			for(int i=0;i<a.length;i++){
			  for(int j=0;j<a.length;j++){
			    if(a[0][1]%2!=-1){
			      System.out.println(a[i][j]);
			    }
			  }
			}
	}
}

