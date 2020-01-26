package com.jeffinjude.recursion;

public class Factorial {
	
	public static int calcFactorial(int n) {
		if(n == 0) {
			return 1;
		}
		else if(n < 0) {
			System.err.println("Please enter a positive number.");
			return 0;
		}
		else {
			return (n*calcFactorial(n-1));
		}
	}
}
