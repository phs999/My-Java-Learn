import java.io.*;
class CharIn 
{
	/*
	ʱ�䣺2016.09.11
	���ߣ�phs
	���ܣ����ַ���ʵ�ֵ����ַ�������
	ԭ�����¡�
	*/
	public static void main(String[] args) 
	{
		//����һ��
		char c = 0;
        try {
             c = (char)new BufferedReader(new InputStreamReader(System.in)).read();
                
			} catch (IOException ioe) {
                        System.exit(0);
                }
		
		//������������һ�ķֽ���ʽ
		char str;
		InputStreamReader stdin=new InputStreamReader(System.in);
		BufferedReader bufin = new BufferedReader(stdin);
		try{
			System.out.print("�������ַ��� ");
			str=(char)bufin.read();
			System.out.println("��������ַ�Ϊ�� "+str);
		}catch(Exception e){
			System.err.println("����IO���󣡣���");
			e.printStackTrace();

		//���������ַ������룬�ַ������str.charAt(0)
		String str;
		InputStreamReader stdin=new InputStreamReader(System.in);
		BufferedReader bufin = new BufferedReader(stdin);
		try{
			System.out.print("�������ַ��� ");
			str = bufin.readLine();
			
			System.out.println("��������ַ�Ϊ�� "+str.charAt(0));
		}catch(Exception e){
			System.err.println("����IO���󣡣���");
			e.printStackTrace();
		}
	}
}
