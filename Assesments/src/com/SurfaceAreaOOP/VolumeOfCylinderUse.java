package com.SurfaceAreaOOP;

import java.util.Scanner;

public class VolumeOfCylinderUse {
	private static Scanner sc;

	public static void main(String[] args) {
		double radius, height, sa, Volume, L, T;
		sc = new Scanner(System.in);
		
		System.out.println("\n Please Enter the radius of a Cylinder : ");
		radius = sc.nextDouble();
		System.out.println("\n Please Enter the Height of a Cylinder : ");
		height = sc.nextDouble();
		
		//Call CylinderVolume Class
		CylinderVolume vac = new CylinderVolume();
		
		sa = vac.SurfaceAreaOfCylinder(radius, height);
		Volume = vac.VolumeOfCylinder(radius, height);
		L = vac.LateralSurfaceAreaOfCylinder(radius, height);
		T = vac.TotalSurfaceAreaOfCylinder(radius);
		
		System.out.format("\n The Surface area of a Cylinder = %.2f", sa);
		System.out.format("\n The Volume of a Cylinder = %.2f", Volume);
		System.out.format("\n The Lateral Surface area of a Cylinder = %.2f", L);
		System.out.format("\n The Top OR Bottom Surface Area of a cylinder = %.2f", T);
	}

}
