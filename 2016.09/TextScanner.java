import java.util.Scanner;
public class TextScanner{
		public static void main(String [] args){
		//����Scanner���� ���ܴӿ���̨����
		Scanner input = new Scanner(System.in);
		System.out.print("����������:");
		//����String��
		String name = input.next();
		System.out.println("������ѧ��");
		//����int��
		int id = input.nextInt();//ʲô����next����ͽ�ʲô ע���Сд
		//������
		System.out.println("����Ϊ:"+name+"\tѧ��Ϊ:"+id);
	}
}