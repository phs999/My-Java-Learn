public class BubbleSort{ 
	/*
     ʱ�䣺2016.09.15
	 ����: phs
	 ���ܣ�ʵ��ð������
	 ԭ��
	     ��ð�������㷨����������:

                �Ƚ����ڵ�Ԫ�ء������һ���ȵڶ����󣬾ͽ�������������
                ��ÿһ������Ԫ����ͬ���Ĺ������ӿ�ʼ��һ�Ե���β�����һ�ԡ�����һ�㣬����Ԫ��Ӧ�û�����������
                ������е�Ԫ���ظ����ϵĲ��裬�������һ����
                ����ÿ�ζ�Խ��Խ�ٵ�Ԫ���ظ�����Ĳ��裬ֱ��û���κ�һ��������Ҫ�Ƚϡ�
	*/
      public static void main(String[] args){  
          int[] score = {25, 24, 12, 76, 98, 101, 90, 28 };  
          for (int i = 0; i < score.length -1; i++)
			  {    //�����n-1������  
              for(int j = 0 ;j < score.length - i - 1; j++)
				  {    //�Ե�ǰ��������score[0......length-i-1]��������(j�ķ�Χ�ܹؼ��������Χ��������С��)  
                  if(score[j] > score[j + 1]){    //��С��ֵ����������  
                      int temp = score[j];  
                      score[j] = score[j + 1];  
                      score[j + 1] = temp;  
                  }  
              }  
			  /*
			  ð�����򷽷�����
			  for(int i = 0; i < score.length; i++)
				  {
					  for(int j = i+1; j < score.length; j++)
						{
							if(score[i] < score[j])
							{
								int temp = score[i];
								score[i] =score[j];
								score[j] = temp;
	
							}
						}
				  }
			  */
              System.out.print("��" + (i + 1) + "����������");  
              for(int a = 0; a < score.length; a++){  
                  System.out.print(score[a] + "\t");  
              }  
              System.out.println("");  
          }  
              System.out.print("������������");  
              for(int a = 0; a < score.length; a++){  
                  System.out.print(score[a] + "\t");  
         }  
      }  
  }  

