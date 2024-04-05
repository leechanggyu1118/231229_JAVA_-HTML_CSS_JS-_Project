package day07;

import java.util.Scanner;

public class StringEx02 {

	public static void main(String[] args) {
		
		/* 5개의 파일명이 주어졌을 때,
		 * 검색어를 입력하면 해당 단어를 포함하는 파일을 출력
		 * 
		 */
		String[] fileName = {"이것이자바다.java","java의정석.java",
				"String.jpg", "String 메서드.txt","arry.txt"};
		
		// ex : java => 이것이자바다.java java의정석.java 출력
		// String =>  "String.jpg", "String 메서드.txt"
		// txt => String 메서드.txt arry.txt
		// 스트링 => 검색결과가 없습니다.
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		int cnt = 0;
		System.out.println("--검색어 : "+s+"--");
		for(String tmp : fileName) {
			if(tmp.contains(s)) {
				System.out.println(tmp);
				cnt++;
			}
			if(cnt == 0) {
				System.out.println("검색결과가 없습니다.");
			}
		}
			
		scan.close();
		
		}
		
		
	}


