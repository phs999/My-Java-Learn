/*
ʱ�䣺2016.09.16
���ߣ�phs
���ܣ�(ϰ��9.7.2)����һ���࣬����title,price����
����һ������printInfo() �����������������
      ʵ������������ֵ���������������
ԭ��������
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
		System.out.println("������" + title +" ���۸�" + price);
	}
}
