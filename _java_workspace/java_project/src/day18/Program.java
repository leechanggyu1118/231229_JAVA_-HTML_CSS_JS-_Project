package day18;

import java.util.Scanner;

public interface Program {
	/* 단어장 프로그램 작성
	 * 1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.단어삭제|6.종료
	 * WordManager 클래스를 생성하여 메서드 구현
	 * map을 이용하여 단어 등록
	 * 기본단어 등록(5가지 등록)
	 * main에서는 메뉴가 반복 실행되도록 설정.
	 * 
	 */
	void insertWord(Scanner scan);
	void searchWord(Scanner scan);
	void modifyWord(Scanner scan);
	void printWord();
	void deleteWord(Scanner scan);
	
}