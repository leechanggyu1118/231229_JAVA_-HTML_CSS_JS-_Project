package day02;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/*카페에 제출
		 * 정수 2개와 연산자 1개를 입력받아 두 정수의 연산을 출력
		 * ex) 2 3 + => 2 + 3 => 5
		 * ex) 5 1 - => 5 - 1 => 4
		 * 연산자는 + - * / % 가능
		 * 다른 종류의 연산자가 들어오면 잘못된 연산자로 출력
		 * 
		 */
		
		//연산자 = char(기본자료형) ++ 비교가능 / String(객체) ++ 비교불가능
		
		Scanner scan = new Scanner(System.in);
		System.out.println("1.첫 번째 정수를 입력하세요");
		int num = scan.nextInt();
		System.out.println("2.두 번째 정수를 입력하세요");
		int num2 = scan.nextInt();
		System.out.println("3.연산자를 입력하세요");
		char ch = scan.next().charAt(0); //한글자 받기
		
		// /, %일경우 num2가 0이 되면 안내문구 띄우기
		
		if((ch == '/'&& num2 ==0) || (ch == '%'&& num2 ==0) ) {
			System.out.println("연산자가 / 또는 % 일 때 두번 째 연산자는 0이 되면 안됩니다.");
		} else {
		
		if(ch =='+') {
			System.out.println(""+num+ ch + num2+"="+(num+num2));
		} else if(ch =='-'){
			System.out.println(""+num+ ch + num2+"="+(num-num2));
		} else if(ch =='*'){
			System.out.println(""+num+ ch + num2+"="+(num*num2));
		} else if(ch =='/'){
			System.out.println(""+num+ ch + num2+"="+(num/num2));	
		} else if(ch =='%'){
			System.out.println(""+num+ ch + num2+"="+(num%num2));
			
		} else {
			System.out.println("잘못된 연산자 입니다.");
		}
	
		scan.close();
		}
	}

}