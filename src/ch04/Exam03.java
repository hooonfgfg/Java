package ch04;

public class Exam03 {

	public static void main(String[] args) {
		int score=95;
		
		System.out.println("A");
		
		if(score>=90) { // 90이상
			System.out.println("B1");
		}else if(score>=80) { // 80이상
			System.out.println("B2");
		}else {// 그외
			System.out.println("B3");
		}
		
		System.out.println("C");
	}

}
