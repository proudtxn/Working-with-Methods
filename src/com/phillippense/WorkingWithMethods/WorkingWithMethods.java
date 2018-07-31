package com.phillippense.WorkingWithMethods;

public class WorkingWithMethods {

	public static void main(String[] args) {
		
		int num1 = 4;
		int num2 = 5;
		System.out.println("Initial number is: " + num1);
	
		int dbl = doubleMe(num1);
		System.out.println("When the initial number is doubled it equals:  " + dbl);
		
		int quad = quadrupleMe(dbl);
		System.out.println("When the initial number is quadrupled it equals: " + quad);
		
		int dblNTimes = doubleMeNTimes(num1, num2);
		System.out.println("When the initial number is doubled " + num2 + " consecutive times, it equals: " + dblNTimes);

	}
	
	public static int doubleMe(int number1) {
		return(number1 * 2);
	}
	
	public static int quadrupleMe(int number1) {
		return(number1 * 2);
	}
	
	public static int doubleMeNTimes(int number1, int number2) {
		int dblN = 0;
		for(int i = 0; i < number2; i++) {
			dblN = number1 *= 2;
		}
		return dblN;
	}
}
