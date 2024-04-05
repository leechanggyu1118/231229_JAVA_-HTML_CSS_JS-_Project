package day04;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		/* 숫자 2개를 입력받고,
		 * mun1 = 5 / num2 = 3
		 * menu
		 * 1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료
		 * menu에 따라서 두 수의 연산결과를 출력
		 * 1 => 5 + 3 = 8
		 * 2 => 5 - 3 = 8
		 * ...
		 * 6 => 종료
		 * 다른 번호는 잘못된 메뉴로 출력
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("두 수를 입력해주세요");
		int menu = 0;
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int menu1 = num1 + num2;
		int menu2 = num1 - num2;
		int menu3 = num1 * num2;
		int menu4 = 0;
		int menu5 = 0;
		
		if(num2 == 0) {
			System.out.println("(/ 와 %)는 두 번째 값이 0이 되면 안됩니다.");
		} else {
			 menu4 = num1 / num2;
			 menu5 = num1 % num2;
		}
		
		do{
			System.out.println("---menu---");
			System.out.println("연산할 연산자를 선택해주세요");
			System.out.println("1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료");
			System.out.println("menu 선택 >");
			menu = scan.nextInt();
			switch(menu) {
			case 1 :
				System.out.println("두 수를 더한 값 :"+menu1);
				break;
			case 2 :
				System.out.println("두 수를 뺀 값 :"+menu2);
				break;
			case 3 :
				System.out.println("두 수를 곱한 값 :"+menu3);
				break;
			case 4 :
				if(num2 == 0) {
					System.out.println("두 번째 값은 0이 되면 안됩니다.");
					System.out.println("두 번째 값을 초기화 하였습니다. 다시 입력해주세요.");
					System.out.println("첫번째 값 : "+num1+" 두 번째 값 : ?");				
					num2 = scan.nextInt();	
					System.out.println("두 수를 나눈 값 :"+num1/num2);
					break;
				}				
				System.out.println("두 수를 나눈 값 :"+menu4);
				break;
			case 5 :
				if(num2 == 0) {
					System.out.println("두 번째 값은 0이 되면 안됩니다.");	
					System.out.println("두 번째 값을 초기화 하였습니다. 다시 입력해주세요.");
					System.out.println("첫번째 값 : "+num1+" 두 번째 값 : ?");
					num2 = scan.nextInt();	
					System.out.println("두 수를 나눈 값 :"+num1%num2);
					break;
				}
				System.out.println("두 수의 나머지 값 :"+menu5);
				break;
				
			case 6 :
				System.out.println("종료하겠습니다.");
				break;
				
			default :
				System.out.println("잘못된 메뉴입니다.");
					
			}
		
		}while(menu != 6);
		
		scan.close();
		
		

	}

}
