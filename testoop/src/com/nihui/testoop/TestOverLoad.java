package com.nihui.testoop;

public class TestOverLoad {

	public static void main(String[] args) {
		MyMath m = new MyMath();
		System.out.println(m.add(1, 2));
	}
}

class MyMath{
	public int add(int a,int b) {
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		return a+b;
	}
	
	public int add(double a,int b) {
		return (int)(a+b);
	}
	
	public int add(int a,double b) {
		return (int)(a+b);
	}
}
