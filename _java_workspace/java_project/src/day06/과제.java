package day06;

import java.util.Scanner;

public class 과제 {

	public static void main(String[] args) {
		/* 숫자를 입력받아서 받은 숫자를 거꾸로 출력. 각자리의 합계 출력
		 * ex) 11456 = > 출력 65411 = > 6+5+4+1+1 = > 결과값 출력
		 * ex) 19874 = > 출력 47891 = > 4+7+8+9+1 = > 출력
		 */
		
		Scanner scan =  new Scanner(System.in);
		System.out.println("숫자를 입력해주세요");
		int sum = 0;
		int arr[] = new int [5];
		for(int i=0; i<arr.length;i++) {
			arr[i] = scan.nextInt();
			sum += arr[i];
		}
		
		System.out.print("입력받은 값 : ");
		for(int a : arr) {
			System.out.print(+a+" ");
		}
		System.out.println();
		System.out.print("거꾸로 출력한 값 : ");
		for(int i = arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("합계 : ");
		System.out.println(sum);
		scan.close();


	}

}
