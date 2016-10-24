class MonthOut 
{
	/*
	时间：2016.09.11
	作者：phs
	功能：随机产生1~12的整数，并输出其对应月份的天数
	思路：
	    随机数产生：(int)(Math.random()*11）+1
		switch 选择语句
	
	*/
	public static void main(String[] args) 
	{
		int month = (int)(Math.random()*11)+1;
		switch(month)
		{
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10 :
			case 12 :
			{
				System.out.println(month+"月有31天。");
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11:
			{
				System.out.println(month+"月有30天。");
				break;
			}
			default:
			{
				System.out.println("2月闰年有29天，平年有28天。");
			}


		
		
		
		}
		
	}
}
