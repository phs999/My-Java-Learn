/*
ʱ�䣺2016.09.16
���ߣ�phs
���ܣ�(ϰ��9.7.1)����һ���࣬����name,age,liek����
      ʵ������������ֵ���������������
ԭ��������
*/


class Person 
{
	String name;
	int age;
	String like;

	public static void main(String[] args) 
	{
		Person p1 = new Person();
		p1.name = "����";
		p1.age = 23;
		p1.like = "running";
		System.out.println("name:"+p1.name+",age:"+p1.age+",like:"+p1.like);
	}
}
