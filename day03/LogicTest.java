/*
�����֮�ģ��߼������

& && | || ! ^

˵����
1.�߼�����������ö���boolean����


*/
class LogicTest {
	public static void main(String[] args) {
		//����& �� &&
		//��ͬ��1��& �� && ����������ͬ
		//��ͬ��2�������������trueʱ�����߶���ִ�з����ұߵ�����
		//��ͬ�㣺�����������falseʱ��&����ִ�з����ұߵ����㡣 &&����ִ�з����ұߵ����㡣
		//�����У��Ƽ�ʹ��&&
		boolean b1 = true;
		b1 = false;
		int num1 = 10;
		if(b1 & (num1++ > 0)){
			System.out.println("�������ڱ���");
		}
		else{
			System.out.println("���������Ͼ�");
		}
		System.out.println("num1 = " + num1);//11

		boolean b2 = true;
		b2 = false;
		int num2 = 10;
		if(b2 && (num2++ > 0)){
			System.out.println("�������ڱ���");
		}
		else{
			System.out.println("���������Ͼ�");
		}
		System.out.println("num2 = " + num2);//10

		//���֣� | �� ||
		//��ͬ��1��| �� || ����������ͬ
		//��ͬ��2�������������falseʱ�����߶���ִ�з����ұߵ�����
		//��ͬ�㣺�����������trueʱ��|����ִ�з����ұߵ����㡣 ||����ִ�з����ұߵ����㡣
		//�����У��Ƽ�ʹ��||
		boolean b3 = true;
		int num3 = 10;
		if(b3 | (num3++ > 0)){
			System.out.println("�������ڱ���");
		}
		else{
			System.out.println("���������Ͼ�");
		}
		System.out.println("num3 = " + num3);//11

		boolean b4 = true;
		int num4 = 10;
		if(b4 || (num4++ > 0)){
			System.out.println("�������ڱ���");
		}
		else{
			System.out.println("���������Ͼ�");
		}
		System.out.println("num4 = " + num4);//10


	}
}



