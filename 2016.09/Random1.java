class Random1 
{
	/*
      时间：2016.09.10
	  功能：生成一随机字母并输出（6.5实战练习）
	  作者：phs
	  原理：
	  Math.random()返回随机double值，该值属于[0,1)
	  则(int)(Math.random()*26) 属于 [0,26) 

	  A~Z对应65~90，
	  即65+(int)(Math.random()*26

	  a~z对应97~122,
	  97+(int)(Math.random()*26

	*/
	public static void main(String[] args) 
	{
		//方法1：
		String chars1 = "abcdefghfjklmnopqrstuvwxyz";   //小写字符串
		System.out.println("随机小写字母：" + chars1.charAt((int)(Math.random()*26)));
		String chars2 = "ABCDEFGHFJKLMNOPQISTUVWXYZ";   //大写字符串
		System.out.println("随机大写字母：" + chars2.charAt((int)(Math.random()*26)));
		String chars3 = "abcdefghfjklmnopqrstuvwxyzABCDEFGHFJKLMNOPQISTUVWXYZ";   //大小写字符串
		System.out.println("随机大小写字母：" + chars3.charAt((int)(Math.random()*52)));
        //方法2：
		char c1 = (char)(97+(int)(Math.random()*26));   //小写随机输出
		char c2 = (char)(65+(int)(Math.random()*26));   //大写随机输出
		System.out.println("s随机小写字母：" + c1);
		System.out.println("s随机大写字母：" + c2);
	}
}
