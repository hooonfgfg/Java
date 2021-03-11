package ch10.exam07;

public class Example {

	public static void main(String[] args) {
		
		try {
			method();
		}catch(Exception e) {
			//예외 메시지별로 예외처리를 할때 사용
			String message=e.getMessage();
			System.out.println(message);
			//디버깅할때 사용핤 수 있는 예외정보
			System.out.println(e.toString());
			e.printStackTrace(); //예외종류, 메세지 등 종류알려줌
		}
	}
	
	public static void method() throws NoAccountException{
		throw new NoAccountException("입급 계좌가 없음");
		
		
	}
}
