class MonthOut 
{
	/*
	ʱ�䣺2016.09.11
	���ߣ�phs
	���ܣ��������1~12����������������Ӧ�·ݵ�����
	˼·��
	    �����������(int)(Math.random()*11��+1
		switch ѡ�����
	
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
				System.out.println(month+"����31�졣");
				break;
			}
			case 4:
			case 6:
			case 9:
			case 11:
			{
				System.out.println(month+"����30�졣");
				break;
			}
			default:
			{
				System.out.println("2��������29�죬ƽ����28�졣");
			}


		
		
		
		}
		
	}
}
