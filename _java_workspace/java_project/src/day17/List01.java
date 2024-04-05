package day17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class List01 {

	public static void main(String[] args) {
		/* 하루 일과를 저장하는 list를 생성
		 * 출력 for / 향상된 for / iterator 출력
		 * import 단축키 ctrl+shift+o
		 * 
		 */
		ArrayList<String> daylist = new ArrayList<String>();
		daylist.add("아침밥 먹기");
		daylist.add("점심밥 먹기");
		daylist.add("저녁밥 먹기");
		daylist.add("간식 먹기");
		daylist.add("공부하기");
		System.out.println("---출력 for---");
		for(int i=0; i<daylist.size();i++) {
			System.out.println(daylist.get(i));
		}
		
		System.out.println("---향상된 for---");
		for(String a : daylist) {
			System.out.println(a);
		}
		
		System.out.println("---iterator 출력---");
		Iterator<String> it = daylist.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.print(tmp+" ");
		}
		
		System.out.println();
		//정렬
		Collections.sort(daylist);
		System.out.println(daylist);
		
		daylist.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// 숫자는(크다/작다를 이용) -/+의 값이 출력
				// 문자는 compareTo 메서드를 활용하여 정렬
				//o1.compareTo(o2) : 오름차순
				return o2.compareTo(o1); // 내림차순
			}
		});

	}

}
