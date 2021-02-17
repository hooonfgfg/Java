package ch04homework;

public class Exercise04 {

	public static void main(String[] args) {
		
		int sum=0;
		do{
			int temp1=(int) (Math.random()*6)+1; //1~6
			int temp2=(int) (Math.random()*6)+1; //1~6
			sum=(int)(temp1+temp2);
			
			System.out.println("("+temp1+", "+temp2+")");
		}while(sum!=5);
		
	}
}
