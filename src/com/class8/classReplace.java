package com.class8;

public class classReplace {
	public static void main(String[] args) {
		
	
	//1replacemetn()
	

    String str="I am good tester!";
    String newStr=str.replace("a", "e");
    System.out.println(newStr);
    
    String newStr1=str.replace("good", "great");
    System.out.println(newStr1);
        // what we are looking for to replace, new value
    String newStr2=str.replace("tester", "programmer");
    System.out.println(newStr2);
    
    String newStr3=str.replace("Tester", "programmer");
    System.out.println(newStr3);
    
    str=str.replace("!", "?");
    System.out.println(str);
    
    str=str.replace("1", "2");
    System.out.println(str);
    // 
    String replacedNoNumbers=str.replaceAll("[0-9]", "");
	System.out.println(replacedNoNumbers);
	
	String newString=replacedNoNumbers.replaceAll("[^A-Z a-z]", "");
	System.out.println(newString);
	
//	String replacedNoCharacter=replacedNoNumbers.replaceAll("[A-Za-z]", "");
//	System.out.println(replacedNoCharacter);
	
	String str2="1Hello123";
	System.out.println(str2.replaceAll("[^0-9]", ""));

	String str0="saturday";
	
	char[] array=str0.toCharArray();
	for(int i=0; i<array.length; i++) {
		System.out.println(array[i]);
	}
	
	for (char c:array) {
	       System.out.println(c);

	}
	System.out.println("Printing in reverse");
	for (int i=array.length-1;i>=0; i--) {
		System.out.print(array[i]);
	}

}
}