import java.io.*;
class Random2 
{
	/*
	ʱ�䣺2016.09.10
	���ߣ�phs
	���ܣ�ʵ�ֲ����������룩һ�����ĸ�� a~z , A~Z ��,ת��Ϊ��д��ʽ�����
	      �ֱ�ʹ����Ԫ�����λ����ʵ��
		  �磺
		  i----I
		  T----T
	ԭ��a~z ��Ӧ 97 ~ 122
	      A~Z ��Ӧ 65 ~ 90
		  ��д��ĸ��Сд��ĸ���32
          A     65     01000001 
          a     97     01100001-->A�ĵ�6λתΪ1�����ܱ�Ϊa

          B     66     01000010
          b     98     01100010-->B�ĵ�6ΪתΪ1�����ܱ�Ϊb

    ��д��ĸ��Сд��ĸ֮��͵�6λ��ֵ��һ��������Ϊ������ͬ��
	����С��ĸת��ΪСд��ĸ����������λ, ʹ�á���0010 0000��(���뼴��!32��)ʵ��ת�� 0x20
	ͬ��, ���Ҫ��СдתΪ��д, �á���1101 1111��(���뼴��&-33��)  0xdf

	*/
	public static void main(String[] args) 
	{
		String str="";
		InputStreamReader stdin=new InputStreamReader(System.in);
		BufferedReader bufin = new BufferedReader(stdin);
		try{
			System.out.print("�������ַ��� ");
			str=bufin.readLine();                                      //�����ַ�
			System.out.println("��������ַ�Ϊ�� "+str.charAt(0));     //����ַ�
			
		}catch(Exception e){
			System.err.println("����IO���󣡣���");
			e.printStackTrace();
		}
		int num = (int) str.charAt(0);                     //ǿ��ת��Ϊint���Ա��ж�
	
			//����һ����Ԫ�����ʵ��
		    char ch = num>=97&&num<=122? (char)(num-32) : (char)num;   //�ж��Ƿ�ΪСд��ĸ������ת��Ϊ��д�����򲻱�
		    System.out.println("�������ĸ��" + str.charAt(0)); 
			System.out.println("�������ĸ��" + ch);
            


            //�������� λ����ʵ��
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
			System.out.println("ת��ǰ��" + (char)num);
			System.out.println("ת����" + ch2);
		
	
	}
}
