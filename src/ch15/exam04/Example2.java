package ch15.exam04;

import java.util.HashMap;
import java.util.Map;

import ch11.exam08.Board;

public class Example2 {

	public static void main(String[] args) {
		
		Map<User,Board>map= new HashMap<>();
		
		//map.put(new User("winter","�ܿ��"),new Board(1,"�ܿ��"));
		//map.put(new User("winter","������"),new Board(1,"����"));
		System.out.println(map.size());
		
		Board board=map.get(new User("winter","a"));
	}

}
