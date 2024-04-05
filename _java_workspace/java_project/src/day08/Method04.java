package day08;

public class Method04 {

	public static void main(String[] args) {
		/* 최대공약수, 최소공배수 리턴
		 * 리턴을 받은 값을 메인에서 출력 
		 */
		System.out.println("최대공약수 : "+gcd(6 ,12));
		System.out.println("최소공배수 : "+lcm(15,10 ));
		System.out.println("최소공배수2 : "+lcm2(10, 15));
	}
	
	/* 두 정수를 매개변수로 받아, 최대공약수를 리턴하는 메서드
	 * 매개변수 : 두 정수 (int num1, int num2)
	 * 리턴타입 : 최소약배수(int)
	 * 매서드명 : gcd
	 */
	public static int gcd(int num1, int num2) {
		
		int num3 = 0;
		 for(int i = 1; i<= num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				num3 = i;
			}
		}
		 return num3;
	}
	
	/* 두 정수를 매개변수로 받아, 최소공배수를 리턴하는 메서드
	 * 매개변수 : 두 정수 (int num1, int num2)
	 * 리턴타입 : 최소공배수(int)
	 * 매서드명 : lcm
	 */
	public static int lcm(int num1, int num2) {
		
		for(int i = num1; ;i+=num1) {
			if(i % num1 == 0 && i % num2==0) {
				return i;
				
			}
		}
	
	}
	// 최소공배수 규칙 : 두 수를 곱한 후 최대공약수로 나누면 최소공배수.
	// 10 15 = 150 / 5 =30
	// 매서드안에서 메서드를 호출 리턴값을 사용
	public static int lcm2(int num1, int num2) {
		return num1 * num2 / gcd(num1, num2);
	}
	

}
