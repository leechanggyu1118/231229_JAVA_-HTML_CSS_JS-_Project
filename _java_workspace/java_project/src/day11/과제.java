package day11;



public class 과제 {

	public static void main(String[] args) {
		/* 메서드를 이용하여 작업.
		 * 두 정수의 값이 주어졌을 때 두 정수사이의 모든 정수의 합을 리턴하는 메서드
		 * ex)a=3, b=5 => 3+4+5
		 * ex)a=5, b=1 => 1+2+3+4+5
		 * ex)a=3, b=3 => 3
		 */
		
		과제 과제1 =  new 과제();
		
		System.out.println(과제1.between(3, 5));
		System.out.println(과제1.between(5, 1));
		System.out.println(과제1.between(3, 3));

	}
	//1. 들어가는 값(매개변수), 나오는 값(리턴타입)
	//매개변수 : int a, int b / 리턴타입 : 합 (int)
	
	//두 정수의 값이 주어졌을 때 두 정수 사이의 모든 정수 합을 리턴
	public int between(int num1,int num2) {
		int btwhap = 0;
		if(num1 == num2) {
			btwhap = num1;
		}
		if(num1 < num2) {
		for(int i =num1; i<=num2;i++) {
			btwhap = btwhap + i;
		}
			 
		}
		if(num2 < num1) {
			for(int i =num2; i<=num1;i++) {
				btwhap = btwhap + i;
			}
			
		}
		return btwhap;
	}
	public int sum2(int a, int b) {
		int sum = 0;
		//a는 작은값, b는 큰값
		int max = Math.max(a, b);
		int min = Math.min(a, b);
		
		for(int i = min; i<=max; i++) {
			sum+= i;
		}
		return sum;
	}
	

}
