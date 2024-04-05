package day05;

public class Array03 {

	public static void main(String[] args) {
		
		int arr[] = new int[] {10, 56, 78, 89, 48, 62, 93, 50};
		/* arr배열의 합계와 평균을 출력
		 * 최대값/ 최소값 출력
		 * Math.max Math.min
		 * if문
		 */
		
		
		int sum = 0;
		int max = 0;
		int min = 0;
		int emt = arr[0];
		int emt2 = arr[0];
		for(int i =0; i<arr.length;i++) {
			sum = sum+arr[i];
			if(emt<arr[i]) {
				emt = arr[i];
			}
			if(emt2>arr[i]) {
				emt2 = arr[i];
			}
			
			max = emt;
			min = emt2;
			Math.max(max, arr[i]);
			Math.min(min, arr[i]);
			
		}
		System.out.println("배열의 합계 : "+sum);
		double avg = sum/(double)arr.length;
		System.out.println("배열의 평균 : "+avg);	
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		System.out.println("--------------");
		
		
		
		
		 
		
		
	}

}
