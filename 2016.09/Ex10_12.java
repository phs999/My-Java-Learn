/*
 ʱ�䣺2016.09.22
 ���ߣ�phs
 ���ܣ�����ʮ����ϰ1���������в�Ϊ0��������������
 ԭ���ȼ���ԭ�����в�Ϊ0��Ԫ�ظ���
       Ϊ����������ռ�
	   ����Ϊ0��������������
	   �������������
	   */

class Ex10_12
{
	
	public static void main(String[] args) 
	{
		int[] oldArr = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};//ԭ����
		int len = count(oldArr);        //��ȡԭ���鲻Ϊ0��Ԫ�صĸ���
		int[] newArr = new int [len];    //����������
		
		for(int i:copy(oldArr, newArr))  //����������ֵ
		{
			System.out.print(i + " ");
			
		}
		System.out.println("");
	}
	public static int count(int[] oldArr)//������ȡԭ���鲻Ϊ0��Ԫ�صĸ���
	{
		int count = 0;       //��ʼ��������Ϊ0
		for(int i = 0; i < oldArr.length ; i++)
		{
			if(oldArr[i] != 0 )
			{
				count ++;
			}
		}
		return count;
	
	}
	public static int[] copy(int[] oldArr, int[] newArr)//��ԭ���鲻Ϊ0��Ԫ�ظ��Ƶ�������
	{
		int j = 0;   //�������±�
		for(int i =0; i < oldArr.length ; i++)
		{
			if(oldArr[i] != 0)
			{
				newArr[j] = oldArr[i];
				j++;
			}
		}
		return newArr;
	}
	/*
	public static int[] change(int[] oldArr)
	{
		int j = 0;
		int []newArr;
		for(int i = 0; i < oldArr.length; i++)
		{
			if(oldArr[i] != 0)
			{
				newArr = new int[];
				newArr[j] = oldArr[i];
				j++;
			}
			else
			{
				continue;
			}
			
		}
		
	}
	*/
}
