package com.SurfaceAreaOOP;

public class CylinderVolume {
double sa, Volume, L, T;
	
	public double VolumeOfCylinder (double radius, double height) {
		Volume = Math.PI * radius * radius * height;
		return Volume;
	}
	
	public double SurfaceAreaOfCylinder (double radius, double height) {
		sa =  2 * Math.PI * radius * (radius + height);
		return sa;
	}
	
	public double LateralSurfaceAreaOfCylinder (double radius, double height) {
		L =  2 * Math.PI * radius * height;
		return L;
	}
	
	public double TotalSurfaceAreaOfCylinder (double radius) {
		T = Math.PI * radius * radius;
		return T;
	}

}
