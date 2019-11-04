/**
自动类型转换
**/
public class TestCast{
	public static void main(String[] args){
		/*
		byte b = 123;
		//会报类型转换错误
		//byte b2 = 300;
		//char c = -3;

		char c2 = 'a';
		int i = c2;

		long d01 = 123123;
		float f = d01;


		int i2 = -100;
		char c3 = (char)i2;
		System.out.println(c3);

		*/

		//表达式中类型提升问题
		// int a = 3;
		// long b = 4;
		// double d = 5.6;
		// int c = a+b;//做所有二元运算操作的时候都会有类型提升的问题，类型会向容量大的提升
		// float f = a+d; // 类型提升需要进行强制类型转换操作

		// int money = 1000000000;
		// int yesrs = 20;
		// int total = money*yesrs;
		// System.out.println(total);


		// long total1 = (long)money*yesrs;
		// System.out.println(total1);

		long times = 70*60*24*365*70;
		System.out.println(times);

	}
}