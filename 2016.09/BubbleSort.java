public class BubbleSort{ 
	/*
     时间：2016.09.15
	 作者: phs
	 功能：实现冒泡排序
	 原理：
	     　冒泡排序算法的运作如下:

                比较相邻的元素。如果第一个比第二个大，就交换他们两个。
                对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
                针对所有的元素重复以上的步骤，除了最后一个。
                持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
	*/
      public static void main(String[] args){  
          int[] score = {25, 24, 12, 76, 98, 101, 90, 28 };  
          for (int i = 0; i < score.length -1; i++)
			  {    //最多做n-1趟排序  
              for(int j = 0 ;j < score.length - i - 1; j++)
				  {    //对当前无序区间score[0......length-i-1]进行排序(j的范围很关键，这个范围是在逐步缩小的)  
                  if(score[j] > score[j + 1]){    //把小的值交换到后面  
                      int temp = score[j];  
                      score[j] = score[j + 1];  
                      score[j + 1] = temp;  
                  }  
              }  
			  /*
			  冒泡排序方法二：
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
              System.out.print("第" + (i + 1) + "次排序结果：");  
              for(int a = 0; a < score.length; a++){  
                  System.out.print(score[a] + "\t");  
              }  
              System.out.println("");  
          }  
              System.out.print("最终排序结果：");  
              for(int a = 0; a < score.length; a++){  
                  System.out.print(score[a] + "\t");  
         }  
      }  
  }  

