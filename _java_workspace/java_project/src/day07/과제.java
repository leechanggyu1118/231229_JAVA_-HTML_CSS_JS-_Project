package day07;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 계산기 만들기
		 * ---menu---
		 * 1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.나머지|6.종료
		 * >>메뉴 선택 1
		 * >>숫자1 5
		 * >>숫자2 10
		 * 결과 : 5+10=15
		 * (더하기 메서드를 호출하여 연산결과를 출력)
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		int a = 0;
		int b = 0;
		do {
			System.out.println("---계산기---");
			System.out.println("---menu---");
			System.out.println("1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.나머지|6.종료");
			System.out.println(">>메뉴 선택");
			menu = scan.nextInt();
		
			switch(menu) {
			case 1 :
				System.out.println("첫 번째 수를 입력하세요");
				 a = scan.nextInt();
				System.out.println("두 번째 수를 입력하세요");
				 b = scan.nextInt();
				System.out.println("두 수의 덧셈 : "+sum(a, b));
				break;
				
			case 2 :
				System.out.println("첫 번째 수를 입력하세요");
				 a = scan.nextInt();
				System.out.println("두 번째 수를 입력하세요");
				 b = scan.nextInt();
				System.out.println("두 수의 뺄셈 : "+sub(a, b));
				break;
			case 3 :
				System.out.println("첫 번째 수를 입력하세요");
				 a = scan.nextInt();
				System.out.println("두 번째 수를 입력하세요");
				 b = scan.nextInt();
				System.out.println("두 수의 곱셈 : "+mul(a, b));
				break;
			case 4 :
				System.out.println("첫 번째 수를 입력하세요");
				 a = scan.nextInt();
				System.out.println("두 번째 수를 입력하세요");
				 b = scan.nextInt();
				 if(b == 0) {
					 System.out.println("------- 계산오류!!-------.");
					 System.out.println("두 번째 수는 0이 되면 안됩니다.");
					 break;
				 }
				System.out.println("두 수의 나눗셈 : "+div(a, b));
				break;
			case 5 :
				System.out.println("첫 번째 수를 입력하세요");
				 a = scan.nextInt();
				System.out.println("두 번째 수를 입력하세요");
				 b = scan.nextInt();
				 if(b == 0) {
					 System.out.println("------- 계산오류!!-------.");
					 System.out.println("두 번째 수는 0이 되면 안됩니다.");
					 break;
				 }
				System.out.println("두 수의 나머지 : "+mod(a, b));
				break;
			case 6 :
				System.out.println("계산기를 종료합니다.");
				break;
			default :
				System.out.println("잘못된 메뉴입니다.");
			}
			
			
			
			
		}while(menu != 6);
		
		
		
		scan.close();

	}
	//메서드 선언위치
		// 두 정수의 합을 알려주는 메서드 sum
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
		// 두 정수의 차를 알려주는 메서드 sub
	public static int sub(int num1, int num2) {
		return num1 - num2;
	}
		// 두 정수의 곱을 알려주는 메서드 mul
	public static int mul(int num1, int num2) {
		return num1 * num2;
	}
		// 두 정수의 몫를 알려주는 메서드 div
	public static double div(int num1, int num2) {
		
		return num1 /(double) num2;
	}
		// 두 정수의 나머지를 알려주는 메서드 mod
	public static int mod(int num1, int num2) {
		return num1 % num2;
	}

}
