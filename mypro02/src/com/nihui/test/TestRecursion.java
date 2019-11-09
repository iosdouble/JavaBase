package com.nihui.test;

/**
 * 测试递归
 * @author nihui
 * @version 0.0.1
 *
 */
public class TestRecursion {

	/**
	 * 用来标注递归结束的条件
	 */
	static int a = 0;
	/**
	 * 用来测试递归方式
	 */
	public static void test01() {
		System.out.println("TestRecursion.test01()");
		a++;
		if(a<=10) {
			test01();	
		}else {
			System.out.println("Over");
		}
	}
	/**
	 * 测试普通方法的调用
	 */
	public static void test02() {
		System.out.println("TestRecursion.test02()");
	}
	public static void test03() {
		System.out.println("TestRecursion.test02()");
	}
	public static void main(String[] args) {
//		test01();
		
		System.out.println(factorial(5));
	}
	
	/**
	 * 实现指定数据的阶乘
	 * @param n 阶乘最大数
	 * @return 阶乘
	 */
	public static long factorial(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
}


















