package day07;

public class Method02 {

	public static void main(String[] args) {
		// + - * / % 메서드를 생성
		// main에서 호출하여 확인
		System.out.println("두 정수의 합 : "+sum(10, 20));
		System.out.println("두 정수의 차 : "+sub(2, 5));
		System.out.println("두 정수의 곱 : "+mul(4, 6));
		System.out.println("두 정수의 몫 : "+div(16, 2));
		System.out.println("두 정수의 나머지 : "+mod(4, 3));
		
	}
	
	//메서드 선언위치
	// 두 정수의 합을 알려주는 메서드 sum
	// 두 정수의 차를 알려주는 메서드 sub
	// 두 정수의 곱을 알려주는 메서드 mul
	// 두 정수의 몫를 알려주는 메서드 div
	// 두 정수의 나머지를 알려주는 메서드 mod
	public static int sum(int num1,int num2) {
		return num1 + num2;
	}
	public static int sub(int num1,int num2) {
		if(num1>num2) {
			return num1-num2;
		}
		return num2 - num1;
	}
	public static int mul(int num1,int num2) {
		return num1*num2;
	}
	public static double div(int num1,int num2) {
		return num1/(double)num2;
	}
	public static int mod(int num1,int num2) {
		
		return num1%num2;
	}

}
