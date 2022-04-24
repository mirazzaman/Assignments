package com.Random;

public class Solution_03 {
public static void main(String[] args) {
	 int min = 1;
	    int max = 10;
	    System.out.println("============================");
	    System.out.println("Generating 10 random integer in range of 1 to 10 using Math.random");
	    System.out.println("============================");
	    for(int i = 0; i < 9; i++) {
	        int randomNumber = (int) (Math.random()*(max-min)) + min;
	        System.out.print(randomNumber);
	    }
}
}
