/*
	ʱ�䣺2016.9.22
	���ߣ�phs
	���ܣ���д�������ĳ��������֮��������
	ԭ������/ȷ����������i,j
		  Math.random()*(j-i);
		  ����������
*/

class Ex10_122 
{
	public static int rand(int i, int j)
	{
		//����1
		//int k = (int)Math.random()*(j - i);
		
		//return  k + i;

		//����2
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
