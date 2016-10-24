/*
	时间：2016.9.22
	作者：phs
	功能：编写程序输出某两个整数之间的随机数
	原理：输入/确定两个整数i,j
		  Math.random()*(j-i);
		  输出随机数；
*/

class Ex10_122 
{
	public static int rand(int i, int j)
	{
		//方法1
		//int k = (int)Math.random()*(j - i);
		
		//return  k + i;

		//方法2
		int k = (int)(Math.random()*j);
		while(k <= i)
		{
			 k = (int)(Math.random()*j);
			 System.out.println(k);
		}
		return k;

	}
	public static void main(String[] args) 
	{
		int i =45;
		int j =1000;
		int k = rand(i ,j);
		System.out.println(k);
	}
}
