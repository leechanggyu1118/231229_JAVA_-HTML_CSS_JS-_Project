package day18;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class WordManager implements Program {
	
	/* 단어장 프로그램 작성
	 * 1.단어등록|2.단어검색|3.단어수정|4.단어출력|5.단어삭제|6.종료
	 * WordManager 클래스를 생성하여 메서드 구현
	 * map을 이용하여 단어 등록
	 * 기본단어 등록(5가지 등록)
	 * main에서는 메뉴가 반복 실행되도록 설정.
	 * 
	 */
	private HashMap<String, String> voka = new HashMap<String, String>();
	
	public void voak() {
		voka.put("apple", "사과");
		voka.put("banana", "바나나");
		voka.put("candy", "사탕");
		voka.put("diamond", "다이아몬드");
		voka.put("entry", "입구");

	}
	
	public WordManager() {};
	


public HashMap<String, String> getVoka() {
		return voka;
	}

	public void setVoka(HashMap<String, String> voka) {
		this.voka = voka;
	}
	
public void wordFilePrint() throws IOException { //단어파일출력
	//StringBuffer 객체
	//.append : 기존 String에 데이터 추가 가능.
	PrintWriter pw = new PrintWriter("wordFile.txt");
	BufferedWriter bw = new BufferedWriter(pw);
	
	StringBuffer sb = new StringBuffer();
	//sb.append : 기존 String에 데이터 추가
	String data = null;
	sb.append("--단어장--");
	sb.append("\r\n"); //줄바꿈
	
		for(String key : voka.keySet()) {
			sb.append(key+":"+voka.get(key));
			sb.append("\r\n"); //줄바꿈						
		}
		
	data = sb.toString(); //StringBuffer 객체여서 String 객체로 변환
	System.out.println(data);
	bw.write(data);
	if(bw!=null) {
		bw.close();
	}
	if(pw != null) {
		pw.close();
	}
	
	
//	int cnt = 1;
//		
//		for(String a : voka.keySet()) {
//			String data = cnt+". "+a+" "+voka.get(a)+"\r\n";
//			cnt++;
//			pw.write(data);	
//	}
	pw.close();
}

public void printWord() { //단어출력 완료
	System.out.println("---단어출력---");
	int cnt = 1;
	for(String a : voka.keySet()) {
		System.out.println(cnt+". "+a+" "+voka.get(a));
		cnt++;
	}
}

@Override
public void insertWord(Scanner scan) { //단어등록 완료
	System.out.println("영어를 입력해주세요");
	String a = scan.next();
	System.out.println("해석을 입력해주세요");
	String b = scan.next();
	voka.put(a, b);
	System.out.println("등록하였습니다.");

}


public void searchWord(Scanner scan) { //단어검색 완
	System.out.println("검색할 단어를 검색해주세요");
	String search = scan.next();
	if(voka.get(search) == null) {
		System.out.println("검색할 단어가 없습니다.");
	}else {	
			System.out.println(search+" : "+voka.get(search));
		
	}
	
	
	
	
}

@Override
public void modifyWord(Scanner scan) { //단어수정
	System.out.println("수정할 영어단어를 입력해주세요");
	String modify = scan.next();
	if(voka.get(modify) == null) {
		System.out.println("수정할 단어가 없습니다.");
	}else {
		voka.remove(modify);
		System.out.println("--수정을 시작합니다--.");
		System.out.println("영어를 입력해주세요");
		String a = scan.next();
		System.out.println("해석을 입력해주세요");
		String b = scan.next();
		voka.put(a, b);
		System.out.println("등록하였습니다.");
	}
	
}

@Override
public void deleteWord(Scanner scan) { //단어삭제 완료
	System.out.println("삭제할 영어단어를 입력해주세요");
	String delete = scan.next();
	if(delete != null) {
		voka.remove(delete);
		System.out.println("삭제했습니다.");
	}else {
		System.out.println("삭제할 단어가 없습니다.");
	}
		
	
	
	}



}



