package ch11.exam07;

public class Example3 {

	public static void main(String[] args) {
		
		/*
		 Integer var1=new Integer(500); 
		 Integer var2=new Integer(500);
		*/
		
		/*
		 * Integer var1=500;
		 *  Integer var2=500;
		 */
		
		//값이 `128~127이면 객체를 공유한다.
		Integer var1=10;
		Integer var2=10;
		
		System.out.println(var1==var2); //값의 범위에 따라서 다른 값
		System.out.println(var1.equals(var2)); //객체안의값비교, 되도록 이걸써야함.
		
	}

}
