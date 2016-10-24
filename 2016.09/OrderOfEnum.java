/*
	时间：2016.09.23
	作者：phs
	功能：输出枚举类型中每一个对象（元素）的编号
	原理：通过调用Enum类这种的ordinal()方法
*/
enum Mycolor{红色,绿色,蓝色};
class OrderOfEnum 
{
	public static void main(String[] args) 
	{
		Mycolor[] allColor = Mycolor.values();
		for(Mycolor aColor : allColor)
		{
			System.out.println(aColor.name() + "-->" + aColor.ordinal());
		}
	}
}
