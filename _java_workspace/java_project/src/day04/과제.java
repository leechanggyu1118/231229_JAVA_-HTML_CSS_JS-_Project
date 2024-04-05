package day04;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 주사위 게임
		 * 주사위를 던져서 총 30칸을 이동
		 * 주사위는 랜덤으로 생성(1~6까지 생성)
		 * 주사위 : 3
		 * 3칸을 전진 => 27칸 남았습니다.
		 * 주사위 : 1
		 * 1칸 전진 => 26칸 남았습니다.
		 * 주사위 : 6
		 * 6칸 전진 => 20칸 남았습니다.
		 * ...
		 * 도착~!! 총 이동횟수 : 10번 => 주사위를 던진 횟수
		 * 몇 번 던져서 도착을 했는지?
		 */
		Scanner scan = new Scanner(System.in);
		int sum = 0; //랜덤 주사위 합계
		int cnt = 0; // 주사위를 던진 횟수
		do {
			System.out.println("주사위게임");
			System.out.println("주사위를 가장 적게 던진 사람이 승리.");
			System.out.println("키를 입력해주세요");
			System.out.println("1 = 주사위던지기");
			int a = scan.nextInt();
			switch(a) {
			case 1:
				cnt++;	
				System.out.println("주사위를 던졌습니다.");
				int rand = (int)(Math.random()*6)+1;
				System.out.println(rand+" 나왔습니다.");
				System.out.println(rand+"칸 움직입니다.");
				sum = sum +rand;
				System.out.println("남은 칸 = "+ (30-sum));
				System.out.println("던진 횟수 = "+ cnt);
				
				System.out.println("----------------");
				
				break;
				
			default :
				System.out.println("잘못된 키 입니다. ");
				
			}
			
			
			
		}while(sum<30);
		System.out.println("축하합니다 게임이 종료되었습니다.");
		System.out.println("주사위 게임 결과");
		System.out.println("총 이동 횟수 = "+ cnt);
		
			
			
			
		scan.close();
		
	}

}
