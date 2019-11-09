package mypro01;

/**
 * 测试方法
 * 
 * @author nihui
 *
 */
public class TestMethod {

	public static void test01() {

		// 计算100的奇数和偶数和
		// 奇数求和
		int a = 1;
		int sum = 0;
		while (a <= 100) {
			sum = sum + a;
			a += 2;
		}
		System.out.println(sum);

		// 偶数求和
		int temp = 0;
		for (int i = 2; i <= 100; i += 2) {
			temp += i;
		}
		System.out.println(temp);

	}

	public static void test02() {
		// all
		int b = 1;
		int ouSum = 0;
		int oddSum = 0;
		while (b <= 100) {
			if (b % 2 == 0) {
				ouSum += b;
			} else {
				oddSum += b;
			}
			b++;
		}
		System.out.println("奇数和 " + oddSum);
		System.out.println("偶数和 " + ouSum);

	}

	public static void test03() {

		for (int j = 1; j <= 1000; j++) {
			if (j % 5 == 0) {
				System.out.print(j + "\t");
			}
			if (j % 5 * 3 == 0) {
				System.out.println();
			}
		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + "*" + i + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
//		test01();
//		System.out.println("#############################");
		//test02();
		//test03();
		System.out.println(add(3,5));
	}
	
	
	public static int add(int a,int b) {
		return a+b;
	}

}
