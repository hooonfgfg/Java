package ch11.exam02;

import java.util.Date;

public class Example {

	public static void main(String[] args) {
		
		Object var1=new Object();
		System.out.println(var1.toString());
		
		Date var2=new Date();
		System.out.println(var2.toString());
		
		String var3="abc";
		System.out.println(var3.toString());
		
		Member var4=new Member("winter","늦겨울");
		System.out.println(var4.toString());
		System.out.println(var4);
		
		//toString재정의하면 toString형태로 출력->편리해짐
		String result=var4.toString() + " => spring: 봄돌이"; 
		System.out.println(result);
		
	}

}
