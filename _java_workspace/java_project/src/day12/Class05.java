package day12;


public class Class05 {

	/* 객체를 생성 시 값을 초기화 하는 방법
	 * - 기본값, 명시적 초기값, 초기화 블럭, 생성자
	 * 1. 기본값 : 기본적으로 지정되는 값 int => 0, String => null
	 * 2. 명시적 초기값 : 멤버변수를 선언함과 동시에 값을 지정하는 방법
	 * 		private String name = "홍길동";
	 * 3. 초기화 블럭 : {	} 멤버변수를 초기화
	 * 4. 생성자 : 객체를 생성할 때 초기화 해서 생성
	 * 
	 * 초기값의 우선순위
	 * 기본값 -> 명시적 초기값 -> 초기화 블럭 -> 생성자
	 */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EzenStudent e = new EzenStudent("인천","이창규","01011111111","빅데이터 프론트엔드 백엔드");
		e.print();
		//toString()메서드가 없으면 객체의 주소가 출력
		//toString()메서드가 있으면 toString()이 출력
		System.out.println(e.toString());
		System.out.println(e); //e.toString() 같은 의미
		
		EzenStudent e1 = new EzenStudent("강남","영이", "01055555555", "빅데이터 프론트엔드 백엔드");
		System.out.println(e1);
		
		EzenStudent e2 = new EzenStudent();
		System.out.println(e2);
		
		//학생 5명 생성
		EzenStudent e3 = new EzenStudent("인천","일이","0104441111","디자인설계");
		EzenStudent e4 = new EzenStudent("부천","두이","0104442222","디자인설계");
		EzenStudent e5 = new EzenStudent("안산","석이","0104443333","디자인설계");
		EzenStudent e6 = new EzenStudent("인천","넉이","0104445555","디자인설계");
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		System.out.println(e6);
		
		//학생정보를 담을 배열을 생성
		EzenStudent studentArr[] = new EzenStudent[7];
		studentArr[0]=e;
		studentArr[1]=e1;
		studentArr[2]=e2;
		studentArr[3]=e3;
		studentArr[4]=e4;
		studentArr[5]=e5;
		studentArr[6]=e6;
		
		//영이의 서치네임을 찾아서 그룹
		String searchName = "넉이";
		System.out.println("--"+searchName+"학생이 듣고 있는 과목 정보--");
		for(int i=0;i<studentArr.length;i++) {
			if(studentArr[i].getStudentName().equals(searchName)) {
				System.out.println(studentArr[i].getSubject());
			}
		}
		
		//영이가 빅데이터를 들을려고 했는데 디자인설계로 변경 => 순이 정보를 출력
		String modify = "넉이";
		System.out.println("--"+searchName+"학생 과목 변경 후 정보--");
		for(int i=0;i<studentArr.length;i++) {
			if(studentArr[i].getStudentName().equals(modify)) {
				studentArr[i].setSubject("빅데이터");
				System.out.println(studentArr[i]);
			}
		}
		
		// 과목을 듣고 있는 학생 명단 출력 만약 학생이 없으면 명단이 없습니다. 출력
		String subject = "빵";
		int cnt = 0;
		System.out.println("---"+subject+" 과목을 듣고 있는 학생 명단---");
		for(int i=0;i<studentArr.length;i++) {
			if(studentArr[i].getSubject().equals(subject)) {
				System.out.println(studentArr[i]);
				cnt++;
				} 
			}
		if(cnt ==0) {
			System.out.println("명단이 없습니다.");
			}
		
		
		
		}
		
	

}

class EzenStudent{
	//학생 정보를 생성하는 클래스
	private String gigum="incheon"; // 명시적 초기값
	private String studentName;
	private String number;
	private String subject;
	
	//기본 생성자
	public EzenStudent(){
		
	}
	
	
	
	//생성자
//	public EzenStudent(String studentName, String number, String subject){
////		this.studentName = studentName;
////		this.number = number;
////		this.subject = subject;
//		
//		// 자동으로 만드는 것 마우스 오른쪽 > sourse > general constructor using filed
//		
//	}
	
	public EzenStudent(String gigum,String studentName, String number, String subject) {
		//super(); // 내 부모 클래스의 생성자 호출
		this.gigum = gigum;
		this.studentName = studentName;
		this.number = number;
		this.subject = subject;
	}
	
	{
		//초기화 블럭 영역
		gigum = "인천";
		subject = "미정";
		studentName = "미상";
		number = "000";
	}
	
	//toString 자동으로 만들기 :print메서드와 비슷한 일을 함. 리턴 값 수정가능!
	@Override
	public String toString() {
		return "EzenStudent [gigum=" + gigum + ", studentName=" + studentName + ", number=" + number + ", subject="
				+ subject + "]";
	}
	
	
	
	
	
	//print()
	public void print(){
		System.out.println("학생이름 : "+studentName+" | 전화번호 : "+number+" | 과목 : "+subject);
	}

	//getter setter
	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
}
