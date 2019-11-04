public class TestCharType{
	public static void main(String[] args){
		char c1 = 'a';
		char c2 = '倪';

		System.out.println(c1);
		System.out.println(c2);

		char c3 = '\'';
		System.out.println(c3);

		char c4 = 'a';
		int i =c4+2;

		char c5 = (char)i; //表数范围所引起的强制类型转换

		System.out.println(i);
		System.out.println(c5);

		//循环打印 a-z

		for (int j = 0;j<26 ;j++ ) {
			char temp = (char)(c4+j);
			System.out.print(temp);
		}


		//Java里面的字符串，定义为String类了。

		String str = "abcdefjhijklmnopqrseuvwxyz";

		System.out.println(str);
	}	
}