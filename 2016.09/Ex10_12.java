/*
 时间：2016.09.22
 作者：phs
 功能：（第十章练习1）把数组中不为0的数存入新数组
 原理：先计算原数组中不为0的元素个数
       为新数组申请空间
	   将不为0的数存入新数组
	   遍历输出新数组
	   */

class Ex10_12
{
	
	public static void main(String[] args) 
	{
		int[] oldArr = {1,3,4,5,0,0,6,6,0,5,4,7,6,7,0,5};//原数组
		int len = count(oldArr);        //获取原数组不为0的元素的个数
		int[] newArr = new int [len];    //定义新数组
		
		for(int i:copy(oldArr, newArr))  //输出新数组的值
		{
			System.out.print(i + " ");
			
		}
		System.out.println("");
	}
	public static int count(int[] oldArr)//计数获取原数组不为0的元素的个数
	{
		int count = 0;       //初始化计数器为0
		for(int i = 0; i < oldArr.length ; i++)
		{
			if(oldArr[i] != 0 )
			{
				count ++;
			}
		}
		return count;
	
	}
	public static int[] copy(int[] oldArr, int[] newArr)//将原数组不为0的元素复制到新数组
	{
		int j = 0;   //新数组下标
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
