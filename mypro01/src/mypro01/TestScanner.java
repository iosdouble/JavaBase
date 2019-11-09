package mypro01;

import java.util.Scanner;

/**
 * 测试Scanner类的使用，如何获取键盘输入
 * 
 * @author nihui
 *
 */

public class TestScanner {

	public static void test01() {
		// 等待键盘中的输入
		Scanner scanner = new Scanner(System.in);

		String str = scanner.next();

		System.out.println(str);
	}
	
	
	public static void test02() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入一个加数：");
		int a = scanner.nextInt();
		System.out.println("请输入另一个加数：");
		int b = scanner.nextInt();
		
		System.out.println("计算结果和："+ (a+b));
		
	}

	public static void main(String[] args) {
		test02();
	}
}
