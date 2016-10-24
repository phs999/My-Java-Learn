/*
时间：2016.09.16
作者：phs
功能：(习题9.7.1)定义一个类，包含name,age,liek属性
      实例化并给对象赋值，并输出对象属性
原理：。。。
*/


class Person 
{
	String name;
	int age;
	String like;

	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.name = "张三";
		p1.age = 23;
		p1.like = "running";
		System.out.println("name:"+p1.name+",age:"+p1.age+",like:"+p1.like);
	}
}
