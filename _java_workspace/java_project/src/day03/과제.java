package day03;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* up/down 게임
		 * 
		 * 1~50 사이의 랜덤 수를 생성하여 맞추는 게임
		 * 컴퓨터가 랜덤 수 생성 : 23
		 * 입력 > 10
		 * up~~!!
		 * 입력 > 20
		 * up~~!!
		 * 입력 > 30
		 * down~~!!
		 * 입력 > 23
		 * 정답~~!!
		 */
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*50)+1;
		System.out.println("up down 게임을 시작합니다!");
		System.out.println("숫자를 입력해주세요!");
		int a = scan.nextInt();
		int c = 0; // 카운트 되는 변수
		
		while(a != num) {
			
			if(c >= 5) {
				break;
			}else if(a < num) {
				c++;
				System.out.println("up!!");
				System.out.println("다시 입력해주세요!"+c+"회");
				a = scan.nextInt();
			}else if(a > num){
				c++;
				System.out.println("down~~!!");
				System.out.println("다시 입력해주세요!"+c+"회");
				a = scan.nextInt();
			}else {
				c++;
				System.out.println("정답입니다!");
				System.out.println(c+"번 만에 맞췄습니다.");
			}
			
		}
		System.out.println("탈락입니다! 5회 초과하여 틀렸습니다.");
		
		scan.close();
	}

}
