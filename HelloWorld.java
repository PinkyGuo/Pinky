//作者：Pinky
//功能：在控制台显示“Hello World”
//日期：2017.0317

//public: 表示这个类是公共的，一个Java文件只能有一个public类
//class: 表示这是一个类
//Hello: 类名（公共类的类名必须和文件名一致）
public class HelloWorld
{
	//主函数，程序入口
	public static void main(String args[])
	{
		int a=(int)1.2;
		int b=1;
		double c=1.2;
		b=(int)c;
		System.out.println(a+b);
	}
}