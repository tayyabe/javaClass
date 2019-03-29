
public class classTaskarrayLoops {
	public static void main(String[] args) {
		String [] carNames= {"honda","toyota","GMC","ferrari","BMW","Porche"};
		for(int a=0;a<=carNames.length-1;a++){
			System.out.println(carNames[a]);
		}
		
		//secondTask
		String[]countries=new String[3];
		countries[0]="pakistan";
		countries[1]="USA";
		countries[2]="Afghanistan";
		
		for(int a=0;a<countries.length;a++) {
			if(countries[a].equals("pakistan")) {
				System.out.println("Islamabad");
				
			}else if(countries[a].equals("USA")) {
				System.out.println("Washington DC");
			}else {
					System.out.println("kabul");
				}
			
			}
		}
	}

		
		
	


