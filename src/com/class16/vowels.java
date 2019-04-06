package com.class16;

public class vowels {
	
	public static void main(String[] args) {
		
		vowels weqas=new vowels();
		weqas.vowelCountWithLoop();
		weqas.vowelCountWithReplaceAll();
		
		
	}
		
		void vowelCountWithLoop() {
	        String weqas="hello world my name Is weqas";
	        
	        char[] w=weqas.toCharArray();
	        char empty;
	        for(int i=0;i<=w.length-1;i++) {
	            if(w[i]=='a'||w[i]=='A'||w[i]=='e'||w[i]=='E'||w[i]=='i'
	                    || w[i]=='I'||w[i]=='o'||w[i]=='O'||w[i]=='u'||w[i]=='U') {
	                empty=w[i];
	                System.out.print(empty+",");
	            }
	            
	        }
	        
	        
	        
	    }
	    
	    
	    void vowelCountWithReplaceAll() {
	        String weqas="hello world my name Is wEqas";
	        String replace =weqas.replaceAll("[^aA,eE,iI,oO,uU,]", "");
	       
	    
	        System.out.println(replace);
	    
	    }
	}
