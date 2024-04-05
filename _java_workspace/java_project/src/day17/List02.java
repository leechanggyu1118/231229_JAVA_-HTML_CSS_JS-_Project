package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class List02 {

	public static void main(String[] args) {
		/* 두 배열을 입력받아서 하나로 합치는 ArrayList 생성
		 * 정렬하여 출력
		 * 
		 */
		String arr1[] = new String[] {"a","c","f","b"};
		String arr2[] = new String[] {"d","g","h","k"};
		
		ArrayList<String> hap = new ArrayList<>();
		for(int i =0;i<arr1.length;i++) {
			hap.add(arr1[i]);			
		}
		
		for(int i =0;i<arr2.length;i++) {
			hap.add(arr2[i]);	
		}
		System.out.println(hap);
		
		Collections.sort(hap);
		System.out.println("---오름차순 정렬 후 ---");
		System.out.println(hap);
		
		hap.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				return o2.compareTo(o1);
			}
			
		});
		System.out.println("---내림차순 정렬 후 ---");
		System.out.println(hap);

	}

}
