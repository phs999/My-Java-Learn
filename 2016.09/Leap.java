import java.util.Scanner;
class Leap 
{
	/*
	时间：2016.09.11
	作者：phs
	功能：判断某一年是否是闰年
	原理：
	    闰年的判断标准：
		year % 400 = 0
		或 year % 4 =0 && year % 100 ！= 0；
	*/
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.print("请输入年份：");
        int year = input.nextInt();
		//int year=2009;
		if(year % 400 == 0 || (year%4 ==0 && year % 100 != 0))
		{
			System.out.println(year+"年是闰年。");
		}
		else
			System.out.println(year+"年是平年。");
	}
}
