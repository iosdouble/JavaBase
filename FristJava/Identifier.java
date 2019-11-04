/**
* 测试标识符的用法
*/
public class Identifier{
	public static void main(String[] args){
		int $abc = 123;
		int $ = 5;

		int _1234 = 3;
		//标识符首字母不能以数字开头
		//int 123abc = 4;
		//标识符 不能是处理数字字面下划线 $ 符以外的其他字符
		//int abc# = 3;
		//不能以关键字作为变量名
		//int class = 3;
		//因为在Java内部采用了Unicode字符集，也就是说可以表示世界上任意的字符。所以使用下面这种方式
		//命名变量是可以实现的。但是不推荐使用这种方式。
		//在Unicode中采用两个字节表示一个字符，也就是说，2的16次方，这样的话可以表示65536中状态。
		int 整型变量 = 3;
	}
}