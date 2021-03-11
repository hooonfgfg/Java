package ch15.exam01;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		//°´Ã¼ ÀúÀå
		list.add("È«±æµ¿");
		list.add(3);
		list.add(new Board());
		System.out.println(list.size());
		
		//°´Ã¼ ¾ò±â
		String name=(String) list.get(0);
		int value=(Integer) list.get(1);
		//Integer °´Ã¼¾ÈÀÇ °ª  AutounBoxing
		Board board=(Board) list.get(2);
		
		//°´Ã¼ Á¦°Å
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());
		
	}

}
