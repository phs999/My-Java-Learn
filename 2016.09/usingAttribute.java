public class usingAttribute
{
	static String a = "string-a";  //静态属性，为该类定义的所有对象共有
	static String b;               //静态属性

	String c = "string-c";         //普通属性，每个对象对应的该属性值可能不同
	String d;                      //普通属性，由所定义的对象私有

	static           //静态方法块，用来初始化静态成员变量
	{
		printStatic("before static");  //调用下面的成员函数进行输出
		b = "string-b";               //初始化静态成员变量（属性）
		printStatic("after atatic");   //调用下面的成员函数进行输出
	}

	public static void printStatic(String title)  //输出静态成员变量
	{
		System.out.println("-------" + title + "-------");
		System.out.println("a=\"" + a + "\"");
		System.out.println("b=\"" + b + "\"");
	}

	public usingAttribute()         //构造方法，初始化对象
	{
		print("before constructor");
		d = "string-d";
		print("after constructor");
	}

	public void print(String title)
	{
		System.out.println("-----" + title + "-----");
		System.out.println("a=\"" + a + "\"");
		System.out.println("b=\"" + b + "\"");
		System.out.println("c=\"" + c + "\"");
		System.out.println("d=\"" + d + "\"");
	}

	public static void main(String[] args) 
	{
		System.out.println();
		System.out.println("-------创建usingAttribute对象------");
		System.out.println();
		new usingAttribute();
		
	}
}
