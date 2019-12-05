package com.nihui.testoop2;

/**
 * 测试面向对象
 * @author nihui
 *
 */
public class Student {

	//静态数据
	String name;
	int id;
	
	static int ss;
	
	public static void printSS() {
		System.out.println(ss);
	}
	
	
	//动态行为
	
	public void study() {
		System.out.println(name+" 在学习");
	}
	
	public void sayHell(String sname) {
		System.out.println(this.name+ " 向 "+sname+" 说你好");
	}
	
	
	
}
