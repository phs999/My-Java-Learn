public class usingAttribute
{
	static String a = "string-a";  //��̬���ԣ�Ϊ���ඨ������ж�����
	static String b;               //��̬����

	String c = "string-c";         //��ͨ���ԣ�ÿ�������Ӧ�ĸ�����ֵ���ܲ�ͬ
	String d;                      //��ͨ���ԣ���������Ķ���˽��

	static           //��̬�����飬������ʼ����̬��Ա����
	{
		printStatic("before static");  //��������ĳ�Ա�����������
		b = "string-b";               //��ʼ����̬��Ա���������ԣ�
		printStatic("after atatic");   //��������ĳ�Ա�����������
	}

	public static void printStatic(String title)  //�����̬��Ա����
	{
		System.out.println("-------" + title + "-------");
		System.out.println("a=\"" + a + "\"");
		System.out.println("b=\"" + b + "\"");
	}

	public usingAttribute()         //���췽������ʼ������
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
		System.out.println("-------����usingAttribute����------");
		System.out.println();
		new usingAttribute();
		
	}
}
