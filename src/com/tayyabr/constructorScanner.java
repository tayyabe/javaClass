package com.tayyabr;

public class constructorScanner {
	int a, b;
	
	
	public int largest() {
		if(a>b) {
			return a;
		}
		else {
			return b;
		}
	}
constructorScanner(int firstNum, int secondNum){
		a = firstNum;
		b = secondNum;
	}

}
