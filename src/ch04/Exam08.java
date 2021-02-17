package ch04;

public class Exam08 {

	public static void main(String[] args) {
		//블럭 단위
		int sum=0;
		int i;
		
		for(i=1;i<=100;i++) {
			int value=i;
			sum+=value; //sum=sum+i;
		}
		
		
		
		System.out.println("1~"+i+": "+sum);
		
	}

}
