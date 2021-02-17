package ch04;

import java.util.Scanner;

public class Exam15 {

	public static void main(String[] args) {
		//키보드로 입력한 내용을 받기 위해 Scanner 생성
		Scanner scanner=new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			//키보드에서 입력한 내용을 data변수에 저장
			System.out.print("입력: "); // 개행안됨 ln안붙임
			String data=scanner.nextLine();
			
			//data변수값 출력
			System.out.println("출력: "+data);
		}
	}

}
