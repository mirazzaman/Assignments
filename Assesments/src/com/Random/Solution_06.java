package com.Random;

import java.util.Random;
import java.util.Scanner;

public class Solution_06 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		char[] input = sc.nextLine().trim().toCharArray();
		int[] nums = new int[4];
		Random rand = new Random();
		
		for(int i = 0; i < 4; ++i) {
		    nums[i] = rand.nextInt(9);
		}
		
		for(int i = 0; i < 4; ++i) {
		    if(nums[i] == Integer.parseInt(Character.toString(input[i]))) {
		        System.out.println("Match");
		    } else {
		        System.out.println("No Match");
		    }
		    System.out.println(nums[i] + " " + input[i]);
		}
	}
}
