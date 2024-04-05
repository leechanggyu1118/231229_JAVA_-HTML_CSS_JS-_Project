package day02;

import java.util.Scanner;

public class IF02 {

	public static void main(String[] args) {
		/*국어, 영어, 수학 점수를 입력받아
		 * 합계, 평균, 평가를 출력
		 * 평가는
		 * 평균이 90이상이면 A
		 * 평균이 80이상이면 B
		 * 평균이 70이상이면 C
		 * 나머지는 D
		 * 입력값이 0보타 작거나 100보다 크면 잘못된 값
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요.");
		int kor = scan.nextInt();
		if (kor > 100 || kor < 0) {
			System.out.println("국어 점수를 다시 입력해주세요.");
		}
		
		System.out.println("영어 점수를 입력해주세요.");
		int eng = scan.nextInt();
		if (eng > 100 || eng < 0) {
			System.out.println("영어 점수를 다시 입력해주세요.");
		}
		
		
		System.out.println("수학 점수를 입력해주세요.");
		int math = scan.nextInt();
		if (math > 100 || math < 0) {
			System.out.println("수학 점수를 다시 입력해주세요.");
		}
		
		int sum = kor + eng + math;
		double avg = sum / 3.0;
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		if(avg >= 90) {
			System.out.println("평가 : A");
		}else if(avg >= 80) {
			System.out.println("평가 : B");
		}else if(avg >= 70) {
			System.out.println("평가 : C");
		}else {
			System.out.println("평가 : D");
		}
		
		
		
		scan.close();
		

	}

}
