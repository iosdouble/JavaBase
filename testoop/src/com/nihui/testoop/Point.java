package com.nihui.testoop;

public class Point {

	double x,y,z;
	
	public Point(double x,double y,double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}

	public double distance(Point p) {
		return Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y)+(this.z-p.z)*(this.z-p.z));
	}
	public static void main(String[] args) {
		Point p = new Point(2.3,3,2);
		System.out.println(p.x);
		
		Point p1 = new Point(2.2,3,2);
		double dist = p.distance(p1);
		System.out.println(dist);
	}
}
