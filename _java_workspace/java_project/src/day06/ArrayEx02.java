package day06;

public class ArrayEx02 {

	public static void main(String[] args) {
		/* 1~50까지의 랜덤 수를 10개 생성하여 배열에 저장 출력
		 * 오름차순 정렬 후 출력
		 * 
		 */
		
		int arr[] = new int[10];
		System.out.print("배열 : ");
		for(int i = 0; i<arr.length;i++) {
			int rand = (int)(Math.random()*50)+1;
			arr[i] += rand;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("----정렬 후 배열----");
		
		for(int i =0; i<arr.length-1;i++) {
			for(int j = i+1; j<arr.length;j++) {
				if(arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
			
			}
		System.out.print("배열 : ");
		for(int a : arr) {
			System.out.print(a+" ");
		}
			
		}

	}


