package ch02;

public class Exam01 {

	public static void main(String[] args) {
		
		//����
		byte 	var1=100; 	//~128~127
		short 	var2=10000;	//-32000~32000
		int		var3=20000000;
		long	var4=20000000000L;	//���ڳ���L ���������� longŸ���� �̸� �˷������.
		
		//���� Ÿ�� ���� ����� �� ����
		char var9=65;
		char var10='A';
		System.out.println("var9: "+var9);
		System.out.println("var10: "+var10);
		
		//�Ǽ�
		float 	var5=0.123456789f;	//�Ҽ�7¥������ ����
		double 	var6=0.123456789123456789;	//���е� ����(�Ҽ�16�ڸ�����)
		System.out.println("var5: " + var5);
		System.out.println("var6: " + var6);
		
		//�� 
		boolean var7=true;	//
		boolean var8=false;	//
		
		
	}

}
