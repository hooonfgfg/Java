package ch11.exam07;

public class Example {

	public static void main(String[] args) {
		
		int value=10;
		
		Integer var2=new Integer(10); //참조변수
		Integer var3=10; //10을같고있는 Integer객체의 번지 (Auto Boxing)
		
		double var4=3.5;
		Double var5=new Double(3.5);
		Double var6=3.5; //Auto Boxing
		
		Integer var7=new Integer(10);
		int var8=var7.intValue();
		int var9=var7; //Auto UnBoxing
		
		Double var10=new Double(3.5);
		double var11=var10.doubleValue();
		double var12=var10; //Auto UnBoxing
		
		Object[] arr=new Object[5];
		arr[0]="abc";
		arr[1]=10; //Auto Boxing
		arr[2]=true; //Auto Boxing
		
	}

}
