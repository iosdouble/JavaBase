package mypro01;
/**
 * 测试While循环
 * @author nihui
 *
 */
public class TestWhile {
	
	public static void main(String[] args) {
		//现在需要实现 从1输出到100；
		
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		
		System.out.println("##########################");
		//快捷办法
		//初始化
		int i = 1;
		//判断条件
		while(i<=100) {
			//迭代效果
			System.out.println(i++);
		}
		
		
		//实现1-100求和
		
		int a = 1;
		int sum = 0;
		//编写循环的时候一定要加上迭代的条件
		while(a<=100) {
			sum = sum+a;
			a ++;
		}
		System.out.println("sum " + sum);
	}
}
