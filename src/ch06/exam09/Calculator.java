package ch06.exam09;

public class Calculator {
	
	//�ʵ� ������ �޼ҵ�
	
	Calculator(){
		
	}
	
	
	//�簢�� ����
	double area(double w) {
		return w*w;
	}
	
	double area(double w,double h) {
		return w*h;
	}
	
	//���� ����(�̸��� �޸��Ҽ��ۿ����� Ÿ��,�Ű����� ������ area)
	double areaCircle(double r) {
		return r*r*Math.PI;
	}
	
	double area(int w){ //����
		return 1;
	}
	
}
