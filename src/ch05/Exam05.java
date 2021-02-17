package ch05;

public class Exam05 {

	public static void main(String[] args) {

		//배열 생성
		int[] arr1 = new int[3];
		
		//배열 항목 값 읽고 출력
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		//배열 항목 값 변경
		arr1[0]=90;
		arr1[1]=80;
		arr1[2]=95;
		
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		//배열항목비교(기본타입)
		System.out.println(arr1[0]==90);
		System.out.println(arr1[1]!=80);
		
	}
	
}
