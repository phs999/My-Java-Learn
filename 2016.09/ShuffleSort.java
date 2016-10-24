public class ShuffleSort { 
	/*
	时间：2016.09.15
	作者：phs
	功能：实现随机排序
	原理：
	遍历数组中的每一元素，每当遍历到一个元素时，
	随机从数组中选出一个元素与之交换
	遍历完成，随机排序完成。	
	
	*/
  
    public static void main(String[] args) {  
        int[] data = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };  
        print(data);  //输出数组各元素
        shuffleSort(data);  //随机交换算法
        System.out.println("排序后的数组：");  
        print(data);  //输出数组各元素
    }  
  
    public static void swap(int[] data, int i, int j) {  
        if (i == j) {  
            return;  
        }  
		//下面是数组中两个元素交换
        data[i] = data[i] + data[j];  
        data[j] = data[i] - data[j];  
        data[i] = data[i] - data[j];  
    }  
  
    public static void shuffleSort(int[] data) {  
        for (int i = 0; i < data.length - 1; i++) {  
            int j = (int) (data.length * Math.random());  
            swap(data, i, j);  
        }  
    }  
  
    public static void print(int[] data) {  
        for (int i = 0; i < data.length; i++) {  
            System.out.print(data[i] + "\t");  
        }  
        System.out.println();  
    }  
  
} 