package mypro01;
/**
 * 测试JDK7 中的Switch的新特性
 * @author nihui
 *
 */

public class TestSwitch01 {

	public static void main(String[] args) {
		String a = "倪辉";
		
		switch(a) {
		case "test":
			System.out.println("这个是一个测试用户");
			break;
		case "倪辉":
			System.out.println("这个是管理员");
			break;
		default:
			System.out.println("大家好");
			break;
		}
	}
}
