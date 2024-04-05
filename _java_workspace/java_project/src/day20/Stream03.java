package day20;

import java.util.ArrayList;

public class Stream03 {

	public static void main(String[] args) {
		// Student 클래스로 리스트 구성
		// add로 5명 추가
		ArrayList<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student("하나",87));
		studentList.add(new Student("두울",78));
		studentList.add(new Student("세엣",68));
		studentList.add(new Student("네엣",98));
		studentList.add(new Student("다섯",66));
		
		//스트림을 이용하여 콘솔에 출력 ex) 홍길동 : 98
		studentList.stream()
		.forEach(a -> System.out.println(a));
		System.out.println("-----------");
		
		studentList.stream()
		.forEach(n->{
			String name = n.getName();
			int score = n.getScore();
			System.out.println(name+":"+score);		
		});
		
		System.out.println("-----점수합계----");
		//list의 점수 합계 / 전체 인원 수 출력		
			int sum = studentList.stream().mapToInt(n->n.getScore())
					.sum();
			System.out.println("점수 합계 : "+sum);
		
		
		long a =studentList.stream()
		.count();
		System.out.println("총 인원 : "+a);
		

	}

}
