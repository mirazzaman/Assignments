package com.Random2;

import java.util.Scanner;

public class DrawTest {
	public static void main(String[] args)
	  {
		final int DRAW_NUM = 5;
		int[] yourNum = new int[DRAW_NUM];
		
		getValues(yourNum);
		Drawing draw = new Drawing(yourNum);
		
		
		 System.out.println("Draw numbers: " );
		 draw.getNumbers();
		 System.out.println("Numbers in common: ");
		   draw.compareNumbers();

	  }

		  private static void getValues(int[] array)
	   {
		  Scanner keyboard = new Scanner(System.in);
		  
		  System.out.println("Enter five numbers");
		  for (int index = 0; index < array.length; index++)
		  {
			 System.out.print("Number " + (index + 1) + ": ");
			 array[index] = keyboard.nextInt();
		  }
	   



	  }

}
