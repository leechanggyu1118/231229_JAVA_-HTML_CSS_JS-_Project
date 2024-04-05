package day18;

import java.util.HashMap;
import java.util.Scanner;

public class MapEx02 {

	public static void main(String[] args) {
		/* 단어장
		 * 단어 5개를 입력받아 콘솔에 출력하는 기능
		 * --단어장---
		 * hello : 안녕
		 * apple : 사과
		 * orange : 오렌지
		 * ...
		 * map에 저장 후 출력
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		HashMap<String, String> voka = new HashMap<String, String>();
		int cnt = 0;
		do {
			System.out.println("---단어장---");
			
			System.out.println("영어단어를 입력해주세요");
			String a = scan.next();
			System.out.println("해석을 입력해주세요");
			String b = scan.next();
			voka.put(a, b);
			cnt++;
		}while(cnt != 5);
		
		System.out.println("---단어장---");
		for(String s : voka.keySet()) {
			System.out.println(s+" : "+voka.get(s));
		}
		
//		voka.put("hello", "안녕");
//		voka.put("apple", "사과");
//		voka.put("orang", "오렌지");
//		voka.put("banana", "바나나");
//		voka.put("kiwi", "키위");
//		
//		for(String a : voka.keySet()) {
//			System.out.println(a+" : "+voka.get(a));
//		}
//		
		
		scan.close();

	}

}
