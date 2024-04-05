package day06;

public class Array04 {

	public static void main(String[] args) {
		/* 10개의 값을 가지는 배열을 생성 후
		 * 1~50사이의 랜덤 수를 배열에 저장 한 후 출력
		 * 합계, 평균, 최대, 최소 출력
		 */
		
		
		int arr[] = new int[10]; // 배열의 초기값은 모두 0
		int sum = 0;
		double avg = 0;
		int max = 0;
		int min = 100;
		
		for(int i = 0; i<arr.length;i++) {
			int rand = (int)(Math.random()*50)+1;
			arr[i] = rand;
			
			System.out.print(arr[i]+" ");
			
			sum = sum + arr[i];
			if(max < arr[i]) {
				max = arr[i];
			}
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		
		avg = (double)sum/arr.length;
		System.out.println();
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		
	}

}
