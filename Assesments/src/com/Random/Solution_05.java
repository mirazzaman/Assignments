package com.Random;

import java.util.Random;
import java.util.Scanner;

public class Solution_05 {
	public static void main(String[] args) {

		// generate random numbers between 0 and 5
		int rangeOfPerRandom = 1;
		int lengthOfPerRandom = 0;
		Scanner sc = new Scanner(System.in);
		//Range of Random Number
		System.out.println("Enter Range of your desire Number: ");
		rangeOfPerRandom = sc.nextInt();
		// Length of Random Number
		System.out.println("Enter Length of your desire Number: ");
		lengthOfPerRandom = sc.nextInt();
		

		
		for (int i = 0; i < rangeOfPerRandom; i++) {
	
				
				System.out.print(generateRandomNumber(lengthOfPerRandom));
		
		}

	}

// Method to generate a random number between 0 and 'n', both inclusive
	public static int generateRandomNumber(int n) {

		if (n < 0) {
			throw new IllegalArgumentException("N must not be negative");
		}

		// generate a random number between 0 and `n`
		return new Random().nextInt(n + 1);
	}

}
