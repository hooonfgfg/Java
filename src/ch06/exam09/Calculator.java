package ch06.exam09;

public class Calculator {
	
	//필드 생성자 메소드
	
	Calculator(){
		
	}
	
	
	//사각형 면적
	double area(double w) {
		return w*w;
	}
	
	double area(double w,double h) {
		return w*h;
	}
	
	//원의 면적(이름을 달리할수밖에없음 타입,매개변수 같으면 area)
	double areaCircle(double r) {
		return r*r*Math.PI;
	}
	
	double area(int w){ //가능
		return 1;
	}
	
}
