package day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 숫자를 입력받아 입력받은 숫자를 list로 구성하고, 출력
		 * 합계를 출력
		 * 입력 : 45,78,89,97,68,57,48 =>String
		 * list에 넣고, 출력 => 합계 출력 (인원수)
		 * 70이상 점수 개수 출력
		 */
		Scanner scan = new Scanner(System.in);
		String num = "45,78,89,97,68,57,48";
		int exit = 0;
		int cntpeple = 0;
		int sum = 0;
		int scorecnt =0;
		int a = 0;
		ArrayList<String> list = new ArrayList<String>();
		while(exit !=1) {
			System.out.println("계속> 1, 종료> 0 입력해주세요");
			 a = scan.nextInt();
			if(a == 0) {
				exit++;
			}else if(a == 1) {
				System.out.println("점수를 입력해주세요");
				list.add(scan.next());
				cntpeple++;		
			}else {
				System.out.println("잘못된 입력입니다 다시 입력해주세요");
				a = scan.nextInt();
				
			}
		}
		for(int i=0;i<list.size();i++) {	
			sum += Integer.valueOf(list.get(i));
			if(Integer.valueOf(list.get(i))>=70) {
				scorecnt++;
			}
		}
		System.out.println("----프로그램이 종료되었습니다----");
		System.out.println("점수의 합계: "+sum);
		System.out.println("인원수 : "+cntpeple);
		System.out.println("70점 이상 갯수 : "+scorecnt);
		
		scan.close();
		
	}

}
