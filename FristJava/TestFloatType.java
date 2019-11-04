public class TestFloatType{
	public static void main(String[] args){
		//浮点数常量默认是double类型
		double d = 3.14;  
		System.out.println(d);

		float f = 6.45F;
		System.out.println(f);

		//采用科学计数法
		double d2 = 314e-2;
		System.out.println(d2);

		//浮点数在内存中是有误差的
		//在使用的时候一定要注意两者是有误差的，有可能是有问题的。
		float f1 = 0.1f;
		double d1 = 1.0/10;
		System.out.println(f1==d1);	
	}
}