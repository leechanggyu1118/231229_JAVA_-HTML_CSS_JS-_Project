package std;
//1

import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

// 멤버변수는 private 설정 / 메서드 public
// 클래스 명은 대문자로 시작, 변수명, 메서드명은 소문자로 시작
// 변수명, 메서드명에 단어가 많아지면 다음 시작단이 대문자 (카멜케이스 기법)
// indent : 들여쓰기 잘 맞추기

public class Student {
	//멤버변수 : 이름, 나이, 전화번호, map(과목,점수), 합계, 평균
	//생성자, 메서드, getter/setter, 출력메서드
	//메서드 - 출력메서드 (학생정보, 과목점수(성적표), 합계, 평균)
	//메서드 - map(과목,점수) 데이터를 추가메서드
	//메서드 - map(과목,점수) 데이터를 삭제메서드
	private String name;
	private int age;
	private String phone;
	private HashMap<String, Integer> map = new HashMap<String, Integer>();
	private int sum;
	private double avg;
	
	public Student() {}

	public Student(String name, int age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "학생이름 : " + name + " | 나이 : " + age + " | 전화번호 : " + phone + " | (과목=점수) : " + map + " | 합계 : " + sum
				+ " | 평균 : " + avg ;
	}
	
	// map(과목,점수) 데이터 추가 메서드
	public void addMap(String a , Integer b){
		//HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put(a, b);
		//return map;
	}
	
	// map(과목,점수) 데이터 삭제 메서드
	public void delMap(Scanner scan){
		System.out.println("삭제할 과목을 입력해주세요.");
		String delete = scan.next();
		if(delete == null) {
			System.out.println("삭제할 과목이 없습니다.");
		}else {
			map.remove(delete);
			System.out.println("삭제했습니다.");
		}
		
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, avg, map, name, phone, sum);
	}

	@Override //boolean을 수정하여 이용할 수 도 있다.
	public boolean equals(Object obj) {
		if (this == obj) //주소가 내 객체의 주소와 같다면 true
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) //클래스 정보가 다르다면 false
			return false;
		Student other = (Student) obj;
		return age == other.age && Double.doubleToLongBits(avg) == Double.doubleToLongBits(other.avg)
				&& Objects.equals(map, other.map) && Objects.equals(name, other.name)
				&& Objects.equals(phone, other.phone) && sum == other.sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public HashMap<String, Integer> getMap() {
		return map;
	}

	public void setMap(HashMap<String, Integer> map) {
		this.map = map;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}	

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}
