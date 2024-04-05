package day10;

import java.util.Scanner;

import day08.Method07로또;

public class BaseBallGame {

	public static void main(String[] args) {
		/* 야구게임을 메서드화
		 * 사용자번호는 직접입력
		 * 번호는 랜덤 생성 (1~9, 중복X)
		 * 중복안되게 하는 메서드 isContain 호출하여 사용
		 * 
		 */
		Scanner scan = new Scanner(System.in);		
		int comNum[] = new int[3];
		int myNum[] = new int[3];
		
		//컴퓨터 번호 생성
		randomArray(comNum);
		Method07로또.printArray(comNum);
		

		//사용자 번호 입력
		
		do{
			int stk = 0;
			int ball = 0;
			System.out.println("숫자를 입력해주세요.");
			String mystr = scan.next();
			String[] myNumStr = mystr.split(""); //한 글자씩 나누어 배열에 저장
			for(int i =0; i<myNumStr.length;i++) {
				// 문자를 숫자로 변환하여 myNum에 저장
				myNum[i] = Integer.parseInt(myNumStr[i]); 
			}
			// 입력값을 나타내주는 메서드
			Method07로또.printArray(myNum);
			//아웃?
			
			if(strikeCount(comNum, myNum) == 0 && ballCount(comNum, myNum)==0 ) {
				System.out.println("결과 : out");
			}else {
				System.out.print("결과 : ");
				// 스트라이크 개수를 카운트하는 메서드
				System.out.print(strikeCount(comNum, myNum)+"S");
				
				// 볼 개수를 카운트하는 메서드
				System.out.print(ballCount(comNum, myNum)+"B");	
				System.out.println();
			}
			
		}while(strikeCount(comNum, myNum)!=3);
		
		//결과 출력
		System.out.print("정답 : ");
		Method07로또.printArray(myNum);
		System.out.print("축하합니다! 게임이 끝났습니다!");
		
		scan.close();

	}
	
	// 랜덤으로 배열을 중복되지 않게 생성
	// Method07로또의 isContain 가져와서 사용
	public static void randomArray(int arr[]) {
		int cnt =0;
		while(cnt < arr.length) {
			int r = (int)(Math.random()*9)+1;
			if(!Method07로또.isContain(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	}
	
	//랜덤 범위에 상관없이 랜덤 수를 채우는 메서드
	//범위를 매개변수로 받아오면 됨.
	//(int)(Math.random()*개수)+시작값;
	// start, count 매개변수로 받아 범위를 생성
	public static void creatArrayRandom(int arr[],int start, int count) {
		int cnt =0;
		while(cnt < arr.length) {
			int r = (int)(Math.random()*count)+start;
			if(!Method07로또.isContain(arr, r)) {
				arr[cnt] = r;
				cnt++;
			}
		}
	}
	
	
	
	
	
	
	//스트라이크 개수를 카운트하는 메서드
	/* comNum, myNum를 주고 번호와 위치가 일치하면 count하는 메서드
	 * 리턴 타입 : int count를 리턴
	 */
	public static int strikeCount(int comNum[], int myNum[]) {
		int cnt =0;
		for(int i = 0; i<comNum.length;i++) {
			if(comNum[i] == myNum[i]) { //같은 index에 같은 값
				cnt++;	 
			}
		}
		return cnt;
	}
	
	//볼 개수를 카운트하는 메서드
	/* comNum, myNum를 주고 번호만 위치가 일치하면 count하는 메서드
	 * 리턴 타입 : int count를 리턴
	 */
	public static int ballCount(int comNum[], int myNum[]) {
		int cnt = 0;
		for(int i = 0;i<comNum.length;i++) {
			if(Method07로또.isContain(comNum, myNum[i])&&comNum[i]!=myNum[i]) {
				cnt++;
			}
		}
		
		return cnt;
	}

}
