package day16;

import javax.management.RuntimeErrorException;

public class Exception06 {

	public static void main(String[] args) {
		// 메서드에서 상성된 배열 출력
		int start = 2, count = -1, size = 2;
		int start1 = 6, count1 = 5, size1 = 6;
		int arr[] = null;
		int arr1[] = new int[4];
		
		try {
			
			int arrResult[] = creatarr(size, start, count);
			for(int i=0; i<arrResult.length; i++) {
				System.out.print(arrResult[i]+" ");
			}
		
			putrand(arr, start, count);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
		System.out.println();
		System.out.println("----오류없는 코드-----");
		
		int arrResult2[] = creatarr(size1, start1, count1);
		for(int i=0; i<arrResult2.length; i++) {
			System.out.print(arrResult2[i]+" ");
		}
		System.out.println();
		System.out.println("------------");
		putrand(arrResult2, start1, count1);
		

	}
	
	//메서드 생성
	/* 기능 : size를 매개변수로 입력받아 size만큼의 길이를 가지는 배열을 생성하여
	 * 랜덤값을 채워 배열을 리턴
	 * 랜텀값의 범위는 매개변수 입력 start(시작값), count(개수) 
	 * - size가 0보다 작다면 예외발생
	 * - count개수가 0보다 작다면 예외발생 
	 */
	public static int[] creatarr(int size, int start, int count) throws RuntimeException {
		
		if(size < 0) {
			throw new RuntimeException("size는 0보다 작으면 안됩니다.");
		}
		if(count < 0) {
			throw new RuntimeException("count는 0보다 작으면 안됩니다.");
		}
		
		
		int arr[] = new int[size];
		for(int i =0;i<arr.length;i++) {
			 arr[i] = (int)(Math.random()*count)+start;
		}
		return arr;
		
	}
	
	//메서드 생성
	/* 기능 : 매개변수로 배열을 받아서 랜덤값을 채우는 메서드
	 * 랜덤값의 범위는 매개변수 입력 start(시작값), count(개수)
	 * - 배열이 null이면 예외발생
	 * - 배열의 길이가 0보다 작다면 예외발생
	 * 
	 */
	public static void putrand(int arr[],int start, int count) throws RuntimeException {
		
		if(arr == null) {
			throw new RuntimeException("배열은 null이되면 안됩니다.");
		}
		if(arr.length < 0) {
			throw new RuntimeException("배열의 길이가 0보다 작으면 안됩니다.");
		}
		
		
		for(int i =0; i<arr.length;i++) {
//			arr[i] = (int)(Math.random()*count)+start;
			System.out.print((arr[i] = (int)(Math.random()*count)+start)+" ");
		}		
		
	}

}
