package day09;

import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		/* 컴퓨터가 가위바위보를 랜덤으로 선택(0 = 가위, 1 = 바위, 2 = 보)
		 * 내가 가위바위보 중 하나를 선택해서 입력
		 * 승/패/무 결과를 출력
		 * ex)
		 * com = 0(가위)
		 * user = 가위 => 무승부입니다.
		 */
		Scanner scan = new Scanner(System.in);
		int game = 0;
		int i = 3;
		int win = 0;
		int lose = 0;
		int draw = 0;
		do {
			int good = 0;
			System.out.println("---삼세판 가위바위보 게임---");
			System.out.println("가위or바위or보 를 입력하세요");
			String a = scan.next();
			
			while(good != 1) {
				
				if(a.equals("가위")) {
					System.out.println("나 : 가위");
					i = 0;
					good++;
				} 
				if(a.equals("바위")){
					System.out.println("나 : 바위");
					i = 1;
					good++;
				} 
					if(a.equals("보")) {
					System.out.println("나 : 보");
					i = 2;
					good++;
				}
					if(good == 0) {
					System.out.println("잘못된 값입니다. 다시 입력해주세요.");
					a = scan.next();
				}
					
					
			}
			int rand = (int)(Math.random()*3);
			if(rand == 0) {
				System.out.println("컴퓨터 : 가위");
			}else if(rand == 1) {
				System.out.println("컴퓨터 : 바위");
			}else {
				System.out.println("컴퓨터 : 보");
			}
			
			
			if(i == rand) {
				System.out.println("무승부 입니다.");
				draw++;
			}else {
				switch(i) {
				case 0 : 
					if(rand == 1) {
						System.out.println("졌습니다.");
						lose++;
					}else {
						System.out.println("이겼습니다.");
						win++;
					}
					break;
				case 1 : 
					if(rand == 0) {
						System.out.println("이겼습니다.");
						win++;
					}else {
						System.out.println("졌습니다.");
						lose++;
					}
					break;
					
				case 2 : 
					if(rand == 0) {
						System.out.println("졌습니다.");
						lose++;
					}else {
						System.out.println("이겼습니다.");
						win++;
					}
					break;
					
				}
				
			}
			
			game++;
			System.out.println("-------"+game+"회차------");
			
		}while(game != 3);
		System.out.println("게임이 끝났습니다.");
		System.out.print("결산 = ");
		System.out.println("승리"+win+"번 패배"+lose+"번 무승부"+draw+"번");
		if(win>lose) {
			System.out.println("승리하였습니다!");
		}else {
			System.out.println("패배하였습니다!");
		}
		
		
		
		scan.close();

	}

}
