/*
	ʱ�䣺2016.09.23
	���ߣ�phs
	���ܣ����ö��������ÿһ������Ԫ�أ��ı��
	ԭ��ͨ������Enum�����ֵ�ordinal()����
*/
enum Mycolor{��ɫ,��ɫ,��ɫ};
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
