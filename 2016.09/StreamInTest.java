//简单的输入、输出流使用范例
import java.io.*;
class StreamInTest 
{
	public static void main(String[] args) 
	{
		String str;
		InputStreamReader stdin=new InputStreamReader(System.in);
		BufferedReader bufin = new BufferedReader(stdin);
		try{
			System.out.print("请输入字符： ");
			str = bufin.readLine();
			
			System.out.println("你输入的字符为： "+str.charAt(0));  //单字符输出
		}catch(Exception e){
			System.err.println("发生IO错误！！！");
			e.printStackTrace();
		}
		

	}
}
