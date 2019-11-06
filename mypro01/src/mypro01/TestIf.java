package mypro01;

/**
 * 测试IF语句
 * @author nihui
 *
 */
public class TestIf {

	public static void main(String[] args) {
		//返回的是一个小数，这个小数介于0-1之间
		double d = Math.random();
		int e = (int)(d*6)+1;// [0,4]  +1 [1,5]
		System.out.println(e);
		if(e>3) {
			System.out.println("大数");
		}else {
			System.out.println("小数");
		}
		
		
		//测试多选择结构
		
		if(e==6) {
			System.out.println("运气非常好");
		}else if(e>=4) {
			System.out.println("运气很好");
		}else if(e>=2) {
			System.out.println("还可以吧");
		}else {
			System.out.println("一般");
		}
	}
}
