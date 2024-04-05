package day08;

public class Method05 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		
		System.out.println(isPrime(6));
		
		// 2부터 100까지의 소수를 출력하고, 소수의 합계를 출력
		int sum = 0;
		System.out.print("2부터 100까지의 소수 : ");
		for(int i = 2; i<=100; i++) {
			if(isPrime(i)) { //isPrime 값은 이미 소수 값이 들어가면 true이다.
				System.out.print(i+" ");
				sum += i;
			}
		}
		System.out.println();
		System.out.println("소수의 합게 : "+sum);
		

	}
	/* 정수 하나가 주어지면 이 정수가 소수인지 아닌지 판별(true/false)
	 * 리턴타입 : boolean
	 * 매개변수 : int num
	 * 매서드명 : isPrime
	 * 
	 */
	public static boolean isPrime(int num) {
		int cnt = 0;
		for(int i =1; i<=num;i++) {
			if(num % i == 0 ) {
				cnt++;
			}
		}
		return ((cnt == 2)? true : false);
	}

}
