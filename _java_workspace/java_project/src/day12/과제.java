package day12;

public class 과제 {

	public static void main(String[] args) {
		/* - 학생 정보를 관리하기 위한 클래스
		 * - 학생 기본정보 : 이름, 생년월일, 전화번호, 나이
		 * -  학원 정보 : 학원명 ="EZEN"(final static), 지점
		 * - 수강 정보 : 수강과목, 기간(string으로)
		 * 		=> 여러 과목을 들을 수 있음 (여러과목 수강하기 위해서는 배열로 처리 5과목까지 가능)
		 * 
		 * 	ex) 홍길동 000101 010-1111-1111 25
		 *	EZEN(인천)
 		 *	자바 6개월, 파이썬 1개월, 빅데이터 3개월
 		 *
 		 *	- 학생기본정보를 출력하는 기능
  		 *	- 학원정보를 출력하는 기능
  		 *	- 수강정보를 출력하는 기능
 		 *	-학생의 수강정보를 추가하는 기능
		 */
		
		Student s = new Student("김일이","991118","01011111111","26","인천","빅데이터","1개월");
		s.pirntStudent();
		s.printSchool();
		s.printSubject();
		s.subjectInsert("디자인설계","3개월");
		s.subjectInsert("SQLD","2개월");
		s.subjectInsert("자바","6개월");
		s.subjectInsert("파이썬","3개월");
		s.subjectInsert("사무자동화","2개월");
		s.subjectInsert("정보처리","4개월");
		s.printSubject();
		

	}
	

}

// - 학생 정보를 관리하기 위한 클래스
class Student{
	
//  - 학생 기본정보 : 이름, 생년월일, 전화번호, 나이
	private String name;
	private String born;
	private String number;
	private String age;
//  - 학원 정보 : 학원명 ="EZEN"(final static), 지점
	private final static String SCHOOL = "EZEN";
	private String gigum;
//  - 수강 정보 : 수강과목, 기간(string으로)
//  	 => 여러 과목을 들을 수 있음 (여러과목 수강하기 위해서는 배열로 처리 5과목까지 가능)
	private String subject;
	private String period;
	
	private String subjectArr[] = new String[5];
	private int cnt = 0;
	
//  기본생성자
	public Student() {
		
	}
// 	ex) 홍길동 000101 010-1111-1111 25
// 		EZEN(인천)
// 		자바 6개월, 파이썬 1개월, 빅데이터 3개월
	
	
	
	
// 생성자 학생기본정보
	
public Student(String name, String born, String number, String age, String gigum, String subject, String period) {
		super();
		this.name = name;
		this.born = born;
		this.number = number;
		this.age = age;
		this.gigum = gigum;
		this.subject = subject;
		this.period = period;
	}



//	- 학생기본정보를 출력하는 기능
	public void pirntStudent() {
		System.out.println("이름 = "+name+" | 생년월일 = "+born+" | 전화번호 = "+number+" | 나이 = "+age);
	}
			


//  - 학원정보를 출력하는 기능
	public void printSchool() {
		System.out.println("학원명 = "+SCHOOL+"("+gigum+")");
	}
	
	
	
//  - 수강정보를 출력하는 기능
	public void printSubject() {
		subjectArr[0] = "("+this.subject+" "+this.period+")";
		System.out.println();
		System.out.print("수강과목 : ");
		for(int i = 0;i<=cnt;i++) {
			System.out.print(subjectArr[i]+" ");
		}
		
	}
	

// -학생의 수강정보를 추가하는 기능
	public void subjectInsert(String s, String p) {
		if(cnt == 4) {
			System.out.println("최대 수강 가능 과목은 5개입니다.");
		}else {
			if(subjectArr[0] != null) {
				cnt++;
			}
			subjectArr[cnt] = "("+s+" "+p+")";
			System.out.println();
			System.out.println(subjectArr[cnt]+" 과목을 추가하였습니다.");
		}
		
	}



// getter/setter/toString

	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getBorn() {
		return born;
	}




	public void setBorn(String born) {
		this.born = born;
	}




	public String getNumber() {
		return number;
	}




	public void setNumber(String number) {
		this.number = number;
	}




	public String getAge() {
		return age;
	}




	public void setAge(String age) {
		this.age = age;
	}




	public String getGigum() {
		return gigum;
	}




	public void setGigum(String gigum) {
		this.gigum = gigum;
	}




	public String getSubject() {
		return subject;
	}




	public void setSubject(String subject) {
		this.subject = subject;
	}




	public String getPeriod() {
		return period;
	}




	public void setPeriod(String period) {
		this.period = period;
	}




	public String[] getSubjectInsert() {
		return subjectArr;
	}




	public void setSubjectInsert(String[] subjectInsert) {
		this.subjectArr = subjectInsert;
	}




	public int getCnt() {
		return cnt;
	}




	public void setCnt(int cnt) {
		this.cnt = cnt;
	}




	public static String getSchool() {
		return SCHOOL;
	}




	public String[] getSubjectArr() {
		return subjectArr;
	}




	public void setSubjectArr(String[] subjectArr) {
		this.subjectArr = subjectArr;
	}
		
	
}
  

