class Demox
{
	static int x=10;
	public static void main(String[] args) 
	{
		for(int i=0;i<=2;i++)
		//for(int i=Integer.MIN_VALUE;i<=Integer.MAX_VALUE;++i)
		{
			boolean isEven=(i%2==0);
			System.out.println(String.format("i=%d,isEven=%b",i,isEven));
		}
		 
	}
}
