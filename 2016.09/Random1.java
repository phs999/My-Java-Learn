class Random1 
{
	/*
      ʱ�䣺2016.09.10
	  ���ܣ�����һ�����ĸ�������6.5ʵս��ϰ��
	  ���ߣ�phs
	  ԭ��
	  Math.random()�������doubleֵ����ֵ����[0,1)
	  ��(int)(Math.random()*26) ���� [0,26) 

	  A~Z��Ӧ65~90��
	  ��65+(int)(Math.random()*26

	  a~z��Ӧ97~122,
	  97+(int)(Math.random()*26

	*/
	public static void main(String[] args) 
	{
		//����1��
		String chars1 = "abcdefghfjklmnopqrstuvwxyz";   //Сд�ַ���
		System.out.println("���Сд��ĸ��" + chars1.charAt((int)(Math.random()*26)));
		String chars2 = "ABCDEFGHFJKLMNOPQISTUVWXYZ";   //��д�ַ���
		System.out.println("�����д��ĸ��" + chars2.charAt((int)(Math.random()*26)));
		String chars3 = "abcdefghfjklmnopqrstuvwxyzABCDEFGHFJKLMNOPQISTUVWXYZ";   //��Сд�ַ���
		System.out.println("�����Сд��ĸ��" + chars3.charAt((int)(Math.random()*52)));
        //����2��
		char c1 = (char)(97+(int)(Math.random()*26));   //Сд������
		char c2 = (char)(65+(int)(Math.random()*26));   //��д������
		System.out.println("s���Сд��ĸ��" + c1);
		System.out.println("s�����д��ĸ��" + c2);
	}
}
