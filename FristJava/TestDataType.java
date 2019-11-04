public class TestDataType{
	public static void main(String[] args){
		int a = 10;
		System.out.println(a);

		int a2 = 010;
		System.out.println(a2);

		int a3 = 0x10;
		System.out.println(a3);


		//转换为二进制字符串
		System.out.println(Integer.toBinaryString(a));
		//转换为八进制
		System.out.println(Integer.toOctalString(a));
		//转换为十六进制
		System.out.println(Integer.toHexString(a));


		int a5 = 10;
		long a6 = 200;
		byte b1 = 100;

		//如果数据的大小没有超过byte/short/char 的表数范围则会自动转型
		// 如果数据超过自动转型的范围就会出现损失精度的问题。
		System.out.println(b1);

		long a7 = 123123123112312123L;
		long l = 3;
		System.out.println(a7);
	}
}