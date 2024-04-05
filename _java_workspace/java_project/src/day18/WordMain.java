package day18;


import java.io.IOException;
import java.util.Scanner;

public class WordMain {

	public static void main(String[] args) throws IOException {
		/* 단어장 프로그램 작성
		 * 1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.단어삭제|6.종료
		 * WordManager 클래스를 생성하여 메서드 구현
		 * map을 이용하여 단어 등록
		 * 기본단어 등록(5가지 등록)
		 * main에서는 메뉴가 반복 실행되도록 설정.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		WordManager w = new WordManager();
		int menu = 0;
		w.voak();
		do {
			System.out.println("---단어장 프로그램---");
			System.out.println("1.단어등록|2.단어검색|3.단어수정");
			System.out.println("4.단어출력|5.단어삭제|6.단어파일출력");
			System.out.println("7.종료");
			
			menu = scan.nextInt();
			
			switch (menu) {
			case 1: System.out.println("단어등록");
				w.insertWord(scan);
				break;
			case 2: System.out.println("단어검색");
				w.searchWord(scan);
				break;
			case 3: System.out.println("단어수정");
				w.modifyWord(scan);
				break;
			case 4: System.out.println("단어출력");
				w.printWord();
				break;
			case 5: System.out.println("단어삭제");
				w.deleteWord(scan);
				break;
			case 6: System.out.println("단어파일출력");
				w.wordFilePrint();
				break;
			case 7: System.out.println("종료");
			
			break;

			default:
				System.out.println("잘못된 메뉴입니다.");
				break;
			}
			
			
			
			
		}while(menu != 7);
		
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();

	}

}
