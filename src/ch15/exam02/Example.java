package ch15.exam02;

import java.util.ArrayList;
import java.util.List;

public class Example {

	public static void main(String[] args) {
		
		List<Board> list=new ArrayList<>();
		//List로 사용가능한것들은 모두 사용가능(ex. 링크드리스트, 벡터)
		//ArrayList 싱글스레드(하나의 스레드)에서 사용
		//Vector 멀티스레드환경에서 사용할떄
		//링크드리스트 효율적 구조 앞 번지 뒤번지 현재저장값
		
		//객체 저장
		list.add(new Board(1,"제목1"));
		list.add(new Board(2,"제목2"));
		list.add(new Board(3,"제목3"));
		System.out.println(list.size());
		
		//객체 얻기
		Board board1=list.get(0);
		System.out.println(board1.getBno()+":"+board1.getTitle());
		Board board2=list.get(1);
		Board board3=list.get(2);
		
		//반복 처리
		for(int i=0;i<list.size();i++) {
			Board board=list.get(i);
			System.out.println(board.getBno()+":"+board.getTitle());
		}
		
		for(Board board:list) {
			System.out.println(board.getBno()+":"+board.getTitle());
		}
		
		//객체 제거
		list.remove(0);
		list.remove(0);
		System.out.println(list.size());
		
	}

}
