package ch04homework;

public class Exercise05 {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				if(((i*4)+(j*5))==60) {
					System.out.println("("+i+", "+j+")");
				}
			}
		}
		
	}

}
