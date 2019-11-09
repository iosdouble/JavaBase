package mypro01;

/**
 * 测试Break和Continue
 * 
 * @author nihui
 *
 */
public class TestBreakContinue {

	public static void main(String[] args) {
		int total = 0;
		while (true) {
			total++;
			int i = (int) Math.round(100 * Math.random());
			if (i == 88) {
				break;
			}
		}
		System.out.println("测试次数是 " + total);

		System.out.println("##########################");

		for (int i = 100; i <= 150; i++) {
			if (i % 3 == 0) {
				continue;
			}
			System.out.println(i + "不能被3整除");
		}

		System.out.println("测试带标签的Break");

		int a = 100;
		to: while (a > 0) {
			for (int i = 10; i > 7; i--) {
				if (a < 5) {
					break to;
				}
			}
			a--;
		}
		System.out.println("测试数据结束");
	}
}
