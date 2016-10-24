import java.io.*;
class CharIn 
{
	/*
	时间：2016.09.11
	作者：phs
	功能：多种方法实现单个字符的输入
	原理：如下。
	*/
	public static void main(String[] args) 
	{
		//方法一：
		char c = 0;
        try {
             c = (char)new BufferedReader(new InputStreamReader(System.in)).read();
                
			} catch (IOException ioe) {
                        System.exit(0);
                }
		
		//方法二：方法一的分解形式
		char str;
		InputStreamReader stdin=new InputStreamReader(System.in);
		BufferedReader bufin = new BufferedReader(stdin);
		try{
			System.out.print("请输入字符： ");
			str=(char)bufin.read();
			System.out.println("你输入的字符为： "+str);
		}catch(Exception e){
			System.err.println("发生IO错误！！！");
			e.printStackTrace();

		//方法三：字符串输入，字符输出，str.charAt(0)
		String str;
		InputStreamReader stdin=new InputStreamReader(System.in);
		BufferedReader bufin = new BufferedReader(stdin);
		try{
			System.out.print("请输入字符： ");
			str = bufin.readLine();
			
			System.out.println("你输入的字符为： "+str.charAt(0));
		}catch(Exception e){
			System.err.println("发生IO错误！！！");
			e.printStackTrace();
		}
	}
}
