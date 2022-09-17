package ch13;

import java.util.HashMap;
import java.util.Map;

/*
 * 날짜 : 2022/09/17
 * 이름 : 박가영
 * 내용 : P576 Map에 학생들의 데이터 저장하기
 */
public class P576 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("Kim", "1234");
		map.put("Park", "pass");
		map.put("Lee", "word");
		
		System.out.println(map.get("Lee"));
		
		for(String key : map.keySet()) {
			String value = map.get(key);
			System.out.println("key="+key+", value="+value);
		}
		map.remove(3);
		map.put("choi", "password");
		System.out.println(map);
	}

}
