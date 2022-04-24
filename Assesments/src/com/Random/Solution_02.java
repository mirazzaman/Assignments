package com.Random;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution_02 {
	public static void main(String[] args) {
		Integer[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
	    System.out.print("Array elements...\n");
	    for (Integer res: arr) {
	       System.out.print(res + " ");
	    }
	    List<Integer>list = Arrays.asList(arr);
	    Collections.shuffle(list);
	    System.out.println("\n\nRandom elements...");
	    for (Integer res: list) {
	       System.out.print(res + " ");
	    }
	     
	}

}
