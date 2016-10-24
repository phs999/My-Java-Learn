/*
时间：2016.09.16
作者：phs
功能：(习题9.7.2)定义一个类，包含title,price属性
定义一个方法printInfo() 来输出上面两个属性
      实例化并给对象赋值，并输出对象属性
原理：。。。
*/
class Booktest1 
{
	public static void main(String[] args) 
	{
		Book bookA = new Book();
		bookA.title = "booka";
		bookA.price = 200;
		Book bookB = new Book();
		bookB.title = "bookb";
		bookB.price = 123;
		bookB = bookA;
		bookB.price = 235435;
		bookA.print();
		bookB.print();
	}
}
class Book
{
	String title;
	double price;
	public void print()
	{
		System.out.println("书名：" + title +" ，价格：" + price);
	}
}
