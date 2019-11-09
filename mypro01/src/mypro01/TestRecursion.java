package mypro01;

/**
 * 测试递归
 * @author nihui
 *
 */
public class TestRecursion {

	static int a = 0;
	public static void test01() {
		System.out.println("TestRecursion.test01()");
		a++;
		if(a<=10) {
			test01();	
		}else {
			System.out.println("Over");
		}
	}
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
	
	public static long factorial(int n) {
		if(n==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
	}
}


















