import java.util.Scanner;
class Leap 
{
	/*
	ʱ�䣺2016.09.11
	���ߣ�phs
	���ܣ��ж�ĳһ���Ƿ�������
	ԭ��
	    ������жϱ�׼��
		year % 400 = 0
		�� year % 4 =0 && year % 100 ��= 0��
	*/
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("��������ݣ�");
        int year = input.nextInt();
		//int year=2009;
		if(year % 400 == 0 || (year%4 ==0 && year % 100 != 0))
		{
			System.out.println(year+"�������ꡣ");
		}
		else
			System.out.println(year+"����ƽ�ꡣ");
	}
}
