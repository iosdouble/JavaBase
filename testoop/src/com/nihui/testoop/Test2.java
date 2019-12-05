package com.nihui.testoop;

public class Test2 {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "倪辉";
		s1.age = 123;
		
		Computer c = new Computer();
		c.brand = "联想";
		c.cpuSpeed = 4;
		
		s1.computer = c;
		System.out.println(s1.computer.brand);
		
		c.brand = "戴尔";
		System.out.println(s1.computer.brand);
		
		String str1 = "戴尔";
		System.out.println(str1==c.brand);
		
	}
}
