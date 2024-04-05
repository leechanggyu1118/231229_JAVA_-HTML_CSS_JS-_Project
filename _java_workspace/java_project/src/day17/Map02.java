package day17;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		/* 과목과 점수를 입력받아 (Scanner) map에 저장 후 출력
		 * 합계, 평균 출력
		 * 종료 키워드가 나올 때 까지 반복 (1=계속 / 0=종료)
		 * 과목과 점수를 입력해주세요 >
		 * 국어 89
		 * 수학 78
		 * 0 종료
		 * map으로 저장 후 출력
		 * 종료 후 합계 평균 출력
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		int menu = 0;
		int cnt = 0;
		int cnt2 = 0;
		
		do {
			System.out.println("---과목 점수의 합계와 평균---");
			System.out.println("계속 진행하시려면 1 / 종료하시려면 0 을 입력해주세요");
			menu = scan.nextInt();
			
			
			switch (menu) {
			case 0: System.out.println("프로그램을 종료합니다."); 
			cnt2++; 
			break;
			
			case 1: System.out.println("과목을 입력해주세요.");
			String sub = scan.next();
			cnt++;
			System.out.println("점수를 입력해주세요");
			int score = scan.nextInt();
			map.put(sub, score);
			
			break;
			
			default: System.out.println("잘못된 키입니다. 다시입력해주세요");
			menu = scan.nextInt();
				break;
			}
			
		}while(cnt2 != 1);
		
		Iterator<String> it = map.keySet().iterator();
		int sum =0;
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("과목 : "+key+" | 점수 : "+map.get(key));
			sum += map.get(key);
		}
		double avg = sum/cnt;
		System.out.println("합계 : "+sum+"점");
		System.out.println("평균 : "+avg+"점");
		
		
		
		scan.close();

	}

}
