public class TestOperator{
	public static void main(String[] args){
		/*
		//运算符
		int  d = 10%3;
		System.out.println(d);

		double e = 12.46%3;
		System.out.println(e);
		//自增
		int a = 3;
		int b = a++;
		int c = ++a;

		System.out.println(b);
		System.out.println(c);
		*/

		//int a = 3/0;

		/*
		boolean c = 1>2&&2>(3/0);

		boolean d = 1<2&&2>(3/0);
		System.out.println(c);
		System.out.println(d);
		*/

		/*
		int a = 8; // 1000
		int b = 4; // 0100
		System.out.println(a&b); // 0000
		System.out.println(a|b); // 1100
		//由于int类型是4个字节也就是说 8 的二进制表示为 10000000_00000000_00000000_00001000
		//原码的反码等于首位取反+1
		System.out.println(~a);  // 01001

		System.out.println(a^b); // 1100


		System.out.println(a<<b); //128
		System.out.println(a>>b); //0
		*/

		/*
		//扩展运算符
		int a = 3;
		a += 5;
		a = a+5;
		*/

		/**
		//布尔值也可参加与或运算，但是没有断路的功能
		boolean b1 = true&false;
		System.out.println(b1);
		*/
		/*
		//加号两边只有有一个操作数是字符串，那么就变为字符串相连。
		String str = "5";
		int s = 4;
		System.out.println(s+str);  //45 
		*/

		int a = 3;
		int b = 5;
		String str = "";
		if (a<b) {
			str = "a<b";
		}else{
			str = "a>b";
		}
		System.out.println(str);

		String str1 = a<b?"a<b":"a>b";
		System.out.println(str1);
	}
}