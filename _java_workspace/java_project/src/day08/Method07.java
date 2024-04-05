package day08;

import java.util.Scanner;

public class Method07 {

	public static void main(String[] args) {
		/* 로또 번호 생성
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		int lotto[] = new int[7]; //당첨번호
		int user[] = new int[6]; //사용자 로또 번호
		
		 
		
		System.out.print("입력한 로또 번호 : ");
		for(int i =0; i<user.length;i++) {
			
//			int tmp = user[i];
//			if(user[i]>45 || user[i]<=0 || check(user, tmp)==true) {
//				System.out.println("잘못된 값입니다. 다시 입력해주세요");
//				i--;
//			}
			
			user[i] = scan.nextInt();
			if((user[i]>45 || user[i]<=0)) {
				System.out.println("잘못된 값입니다. 다시 입력해주세요");
				i--;
			}
			else {
				printArray(user);
				System.out.println();
				System.out.println("남은 입력 수 : "+(6-(i+1))+"회 입니다.");				
			}
			
			
		
		}
		System.out.print("입력한 로또번호 : ");
		printArray(user);
		System.out.println();
		random(lotto);
		
		scan.close();

	}
	
	/* 배열을 매개변수로 받아 1~45까지 랜덤 수를 채워서 생성
	 * 랜덤 수는 같은 수가 나오면 안된다.
	 */
	public static void random(int lotto[]) {
		int arr[] = new int[7];
		int i = 0;
		System.out.print("로또번호 : ");
		while(i<=6) {
			int tmp = (int)(Math.random()*45)+1;
			if(i == 0) {
				arr[i] = tmp;
			}
			if (i != 0 ) {
				
					if(check(arr, tmp)==true) {				
								while(check(arr, tmp) == true) {
									tmp = (int)(Math.random()*45)+1;			
								}							
					}
					arr[i] = tmp;
				
			}
			System.out.print(arr[i]+" ");
			i++;
		
		}
		
				
			}
			
		
		
	
		/* 배열을 매개변수로 받아 배열을 출력하는 메서드
	 * 
	 */
	public static void printArray(int arr[]) {
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
		
	
	}
	
	
	
	/* 중복 확인 메서드
	 * 매개변수 : 배열, 값
	 * 해당 값이 배열에 있는지 체크
	 * 있으면 true,없으면 false
	 */
	public static boolean check(int arr[],int a) {
		
		for(int i =0;i<arr.length; i++) {
			if(arr[i] == a) {
				return true;
			}
		}
		return false;
		
	}


}