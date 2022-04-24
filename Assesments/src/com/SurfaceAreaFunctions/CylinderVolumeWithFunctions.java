package com.SurfaceAreaFunctions;

import java.util.Scanner;

public class CylinderVolumeWithFunctions {
	private static Scanner sc;

	public static void main(String[] args) {
		double radius, height;
		sc = new Scanner(System.in);
		
		System.out.println("\n Please Enter the radius of a Cylinder : ");
		radius = sc.nextDouble();
		System.out.println("\n Please Enter the Height of a Cylinder : ");
		height = sc.nextDouble();
		VolumeOfCylinder(radius, height);

	}
	public static void VolumeOfCylinder (double radius, double height) {
		// FYI:  L = Lateral Surface Area of a Cylinder, T = Top Surface Area
		double sa, Volume, L, T;
		sa = 2 * Math.PI * radius * (radius + height);
		Volume = Math.PI * radius * radius * height;
		L = 2 * Math.PI * radius * height;
		T = Math.PI * radius * radius;
		
		System.out.format("\n The Surface area of a Cylinder = %.2f", sa);
		System.out.format("\n The Volume of a Cylinder = %.2f", Volume);
		System.out.format("\n The Lateral Surface area of a Cylinder = %.2f", L);
		System.out.format("\n The Top OR Bottom Surface Area of a cylinder = %.2f", T);
	}

}
