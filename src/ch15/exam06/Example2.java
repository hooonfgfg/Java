package ch15.exam06;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Example2 {

	public static void main(String[] args) {
		
		TreeMap<String,String> map=new TreeMap<>();
		
		map.put("s1","박길순");
		map.put("s3","감자바");
		map.put("s4","방돌이");
		map.put("s2","홍길동");
		map.put("s5","디자이너");
		
		//키정렬(오름차순)
		Set<String> keys=map.keySet();
		for(String key:keys) {
			System.out.println(key + ": "+map.get(key));
		}
		System.out.println();
		
		//내림차순
		keys=map.descendingKeySet();
		for(String key:keys) {
			System.out.println(key + ": "+map.get(key));
		}
		System.out.println();
		
		Map<String,String> smap=map.subMap("s3", true,"s5",true); //3~5 선택
		keys=smap.keySet();
		for(String key:keys) {
			System.out.println(key + ": "+map.get(key));
		}
		
	}

}
