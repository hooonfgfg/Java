package ch06.exam05;

public class Korean {
	
	//Field
	String nation="�ѱ�";
	String name;
	String ssn;
	int age;
	
	//Constructor Overloading
	Korean(){
		System.out.println("Korean() ����");
	}
	
	Korean(String name){
		this(name,"000000-0000000",1);
	}
	
	Korean(String name,String ssn){
		this(name,ssn,1);
	}
	
	Korean(String name,String ssn,int age){
		this.name=name;
		this.ssn=ssn;
		this.age=age;
	}
	
}