class ThreeArr 
{
	/*
	ʱ�䣺2016.09.11
	���ߣ�phs
	���ܣ���ά�������ʵ��	
	*/
	public static void main(String[] args) 
	{
		int sum = 0;
		int[][][] a = {
			{{5 , 1}, {6 ,11 ,7}},
			{{9 , 4}, {8 , 3},{12,32,45,323}}
		};
		for(int i=0; i < a.length; ++i)
		{
			for(int j = 0; j < a[i].length; ++j)
			{
				for(int k = 0; k < a[i][j].length; ++k)
				{
					System.out.print("a["+i+"]["+j+"]["+k+"]=");
					System.out.println(a[i][j][k]);
					sum+=a[i][j][k];
				}
			}
		}
		System.out.println("sum= "+sum);
	}
}
