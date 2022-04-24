package com.Random;

import java.util.Random;

public class Solution_01 {
	public static void main(String[] args) {

		// generate random numbers between 0 and 5
		int n = 4;
		System.out.println("Your desire Random Number is : ");
		for (int i = 0; i < 9; i++) {		
				System.err.print(generateRandomNumber(n));	
		}
	}

// Method to generate a random number between 0 and 'n', both inclusive
	public static int generateRandomNumber(int n) {

		if (n < 0) {
			throw new IllegalArgumentException("N must not be negative");
		}
		// generate a random number between 0 and 'n'
		return new Random().nextInt(n + 1);
	}
}
