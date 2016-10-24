import java.io.*;
class Random2 
{
	/*
	时间：2016.09.10
	作者：phs
	功能：实现产生（或输入）一随机字母（ a~z , A~Z ）,转换为大写形式并输出
	      分别使用三元运算和位运算实现
		  如：
		  i----I
		  T----T
	原理：a~z 对应 97 ~ 122
	      A~Z 对应 65 ~ 90
		  大写字母与小写字母相差32
          A     65     01000001 
          a     97     01100001-->A的第6位转为1，就能变为a

          B     66     01000010
          b     98     01100010-->B的第6为转为1，就能变为b

    大写字母和小写字母之间就第6位的值不一样，其他为都是相同的
	将大小字母转换为小写字母即保留其他位, 使用”或0010 0000”(代码即”!32”)实现转换 0x20
	同样, 如果要将小写转为大写, 用”与1101 1111”(代码即”&-33”)  0xdf

	*/
	public static void main(String[] args) 
	{
		String str="";
		InputStreamReader stdin=new InputStreamReader(System.in);
		BufferedReader bufin = new BufferedReader(stdin);
		try{
			System.out.print("请输入字符： ");
			str=bufin.readLine();                                      //读入字符
			System.out.println("你输入的字符为： "+str.charAt(0));     //输出字符
			
		}catch(Exception e){
			System.err.println("发生IO错误！！！");
			e.printStackTrace();
		}
		int num = (int) str.charAt(0);                     //强制转换为int，以便判断
	
			//方法一：三元运算符实现
		    char ch = num>=97&&num<=122? (char)(num-32) : (char)num;   //判断是否为小写字母，是则转换为大写，否则不变
		    System.out.println("输入的字母：" + str.charAt(0)); 
			System.out.println("输出的字母：" + ch);
            


            //方法二： 位运算实现
			char ch2 = 0;
			if(num>=97&&num<=122)
			{
				ch2 = (char)(num & 0xDF);
			}
			else if(num>=65&&num<=90)
			{
				ch2 = (char)num;

			}
			else
			{
				System.out.println("error");
			}
			System.out.println("转换前：" + (char)num);
			System.out.println("转换后：" + ch2);
		
	
	}
}
