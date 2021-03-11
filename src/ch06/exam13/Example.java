package ch06.exam13;

public class Example {

	public static void main(String[] args) {
		
		//int result1=Singleton.method1();
		//String result2=Singleton.method2();
		//int[] result3=Singleton.method3();
		
		//Singleton result4=new Singleton(); //평소에 썼던거
		//Singleton result4=Singleton.method4();
		
		//생성자를 이용해서 객체얻기
		//Singleton result1=new Singleton();
		//불가
		
		//Factory Method 이용해서 객체얻기
		Singleton result2=Singleton.getIntance();
		Singleton result3=Singleton.getIntance();
		if(result2==result3) {
			System.out.println("같은객체참조");
		}else {
			System.out.println("다른 객체참조");
		}
	}	

}
