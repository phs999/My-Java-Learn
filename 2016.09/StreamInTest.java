//�򵥵����롢�����ʹ�÷���
import java.io.*;
class StreamInTest 
{
	public static void main(String[] args) 
	{
		String str;
		InputStreamReader stdin=new InputStreamReader(System.in);
		BufferedReader bufin = new BufferedReader(stdin);
		try{
			System.out.print("�������ַ��� ");
			str = bufin.readLine();
			
			System.out.println("��������ַ�Ϊ�� "+str.charAt(0));  //���ַ����
		}catch(Exception e){
			System.err.println("����IO���󣡣���");
			e.printStackTrace();
		}
		

	}
}
