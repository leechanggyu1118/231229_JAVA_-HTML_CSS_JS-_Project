package day09;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 야구게임
		 * 컴퓨터가 3자리의 숫자를 생성 ( 각 자리수는 1~9까지의 수) => 배열로 랜덤 저장(중복불가능)
		 * 유저는 3자라의 숫자를 맞추는 게임  => 직접 입력 (중복되지 않게)
		 * 자리와 숫자가 일치하면 strike
		 * 숫자만 맞으면 ball
		 * 아무것도 안 맞으면 out
		 * ex) 컴퓨터 생성 번호 : 1 2 3
		 * 사용자 번호 : 1 7 8 => 1s
		 * 사용자 번호 : 1 3 2 => 1s 2b
		 * 사용자 번호 : 7 8 9 => out
		 * 사용자 번호 : 1 2 3 => 3s 정답.
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		int usernum = 0;
		int com[] = new int[3];
		int comnum = 0;
		int st = 0;
		int ball = 0;
		int out = 0;
			for(int i =0; i<com.length;i++) {
				comnum = (int)(Math.random()*9)+1;
				if(i == 0){
					com[i] = comnum;	
				}else {
					while(check(com, comnum)) {
						comnum =(int)(Math.random()*9)+1;
					}
					com[i]=comnum;
				}
				
			}
			System.out.println("---야구게임 시작---");
			System.out.print("컴퓨터 숫자 : ");
			printArray(com);
			System.out.println();
			
			System.out.println("3자리 컴퓨터 값 생성 완료!");
			do {	
			System.out.println("3자리 숫자를 입력해주세요!");
			int user[] = new int[3];
			for(int i =0;i<user.length;i++) {
				
				usernum = scan.nextInt();
				if(i == 0) {
					user[i] = usernum;
				}else {
				while(check(user, usernum)) {
					System.out.println("중복값이 있습니다. 다시 입력해주세요");
					usernum = scan.nextInt();					
						}
				}if(usernum>9 ||usernum<1) {
					System.out.println("1~9사이의 값으로 다시 입력해주세요");
					usernum = scan.nextInt();
				}
				
				user[i] = usernum;	
				
			}
			System.out.println();
			System.out.print("입력값 : ");
			printArray(user);
			
			//스트라이크,볼,아웃
			st = 0;
			ball = 0;
			out = 0;
			for(int i =0;i<user.length;i++) {
				
				if(com[i]==user[i]) {
					st++;
				}
				if((com[i]!=user[i])&&check(com, user[i])) {
					ball++;
				}
				if((st==0 && ball==0)&&check(com, user[i])==false) {
					out++;
					
				}
				
			}
			if(out>=1) {
				System.out.print("out");
				System.out.println();
			}else {
				System.out.print("--"+st+"s");
				System.out.print(" "+ball+"b");
				System.out.println();
				
			}
			
			
			
			
			
			
		}while(st!=3);
		System.out.println("축하합니다 3스트라이크 입니다.");
		System.out.println("게임을 종료합니다.");
		
		
		
		scan.close();	
		
		
	}


	// 중복확인 메서드
	public static boolean check(int arr[], int random) {
		for(int i =0; i<arr.length;i++) {
			if(arr[i]== random) {
				return true;
			}
		}
		return false;
		
	}
	// 배열을 매개변수로 받아 배열을 출력하는 메서드
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	}

}
