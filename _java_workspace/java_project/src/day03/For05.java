package day03;

public class For05 {

	public static void main(String[] args) {
		/* 약수 : 1부터 자기자신까지 나누어서 떨어지는 수
		 * 6의 약수 : 6%1=0, 6%2=0, 6%3=0, 6%4=2, 6%5=1, 6%6=0
		 * 6의 약수 : 1, 2, 3, 6
		 * 12의 약수 : 1, 2, 3, 4, 6, 12
		 * 
		 * 두 수의 공약수 : 1 2 3 6 (두 수의 공통된 약수)
		 * 
		 * 그 공약수 중 가장 큰 값은 최대공약수 : 6
		 */
		
		int num1 = 6;
		int num2 = 12;
		int num3 = 0;
		for(int i = 1; i <= num1; i++) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.print(i+" ");
				num3 = i;
			}
			
		}
		System.out.println("최대공약수 = "+num3+" ");
		
		/*break;
		 * 반복문에서 조건이 맞다면 반복문을 빠져나오는 역할
		 * 
		 */
		
		for(int i = num1;;i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println(i);
				break;
			}
		}
		
		// 중첩 for문 일 경우 break는 나를 감싸고 있는 가장 안쪽 for문을 벗어남.
		int i = 0;
		a: for(;;) {
			for(;;) {
				for(;;) {
					i++;
					if(i==10) {
						System.out.println(i);
						break a;
						
					}
				}
			}
		}

	}

}

