package mypro01;

/**
 * 测试Switch语句
 * 
 * @author nihui
 *
 */
public class TestSwitch {

	public static void main(String[] args) {
		// 返回的是一个小数，这个小数介于0-1之间
		double d = Math.random();
		// 产生一个1-6的随机数
		int e = (int) (d * 6) + 1;
		System.out.println(e);

		// 如果是等值判断的话可以使用Switch语句来代替
		// Switch中可以放置任何的的数据包括字符串
		switch (e) {
		case 6:
			System.out.println("运气太好了");
			break;
		case 5:
			System.out.println("运气还不错");
			break;
		case 4:
			System.out.println("还好吧");
			break;
		default:
			System.out.println("运气不太好！");
			break;
		}
		
		System.out.println("##############################");
		
		char c = 'a';
		int ch = (int)(26*Math.random());
		
		char zm = (char)(c+ch);
		System.out.println(zm);
		switch(zm) {
		case 'a':
		case 'o':
		case 'e':
		case 'i':
		case 'u':
			System.out.println("元音");
			break;
		case 'w':
		case 'y':
			System.out.println("半元音");
			break;
		default:
			System.out.println("辅音");
			break;
		}
	}

}
