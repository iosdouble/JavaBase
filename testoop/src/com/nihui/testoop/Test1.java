package com.nihui.testoop;

public class Test1 {

	public static void main(String[] args) {
		//通过类加载器加载Student Class Loader加载后在方法区中就有了Student的信息了
		Student s1 = new Student();
		s1.name = "倪辉";
		s1.study();
	}
}
