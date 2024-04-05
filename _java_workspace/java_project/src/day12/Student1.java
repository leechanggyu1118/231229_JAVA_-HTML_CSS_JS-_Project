package day12;

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
 *	- 학생의 수강정보를 추가하는 기능
 */
public class Student1 {

	public static void main(String[] args) {
		Student2 st = new Student2();
		st.setName("홍길동");
		st.setPhone("010-1111-1111");
		st.printInfo();
		st.printCompay();
		st.printCourse();
		
		Student2 st1 = new Student2("이일이","010-2222-2222","incheon");
		st1.printInfo();
		st1.printCompay();
		st1.insertCource("java", "5개월");
		st1.insertCource("html", "1개월");
		st1.printCourse();
		
		Student2 st2 = new Student2("김두이","010-3333-3333","seoul");
		st2.printInfo();
		st2.printCompay();
		st2.printCourse();
		st2.insertCource("java", "5개월");
		st2.insertCource("파이썬", "1개월");
		st2.printCourse();
	
		Student2 st3 = new Student2("박석이","010-3333-3333","incheon");
		st3.printInfo();
		st3.printCompay();
		st3.printCourse();
		st3.insertCource("java", "5개월");
		st3.insertCource("사무자동화", "3개월");
		st3.printCourse();
		
		Student2 st4 = new Student2("김넉이","010-3333-3333","seoul");
		st4.printInfo();
		st4.printCompay();
		st4.printCourse();
		st4.insertCource("검퓨터활용 1급", "1개월");
		st4.printCourse();
		
		Student2 st5 = new Student2("김오이","010-3333-3333","incheon");
		st5.printInfo();
		st5.printCompay();
		st5.printCourse();
		st5.insertCource("빅데이터", "5개월");
		st5.printCourse();
		
		Student2 st6 = new Student2("강육이","010-3333-3333","seoul");
		st6.printInfo();
		st6.printCompay();
		st6.printCourse();
		st6.insertCource("java", "5개월");
		st6.printCourse();
		
		Student2 st7 = new Student2("한칠이","010-3333-3333","seoul");
		st7.printInfo();
		st7.printCompay();
		st7.printCourse();
		st7.insertCource("java", "5개월");
		st7.printCourse();
		
		//5명 추가 총 8명 생성
		
		Student2[] std = new Student2[8];
		std[0] = st;
		std[1] = st1;
		std[2] = st2;
		std[3] = st3;
		std[4] = st4;
		std[5] = st5;
		std[6] = st6;
		std[7] = st7;
		
		System.out.println("----------------------------");
		String searchName = "박석이";
		// 박석이 학생의 학생정보, 학원 정보, 수강정보를 출력
		System.out.println(searchName+" 학생의 학생정보, 학원 정보, 수강정보");
		for(int i =0;i<std.length;i++) {
			if(std[i].getName().equals(searchName)) {
				std[i].printInfo();
				std[i].printCompay();
				std[i].printCourse();
			}
		}
		//인천지점의 학생들을 모두 검색하여 출력
		System.out.println("----------------------------");
		String searchBranch = "incheon";
		System.out.println(searchBranch+" 지점 학생정보");
		for(int i=0;i<std.length;i++) {
			if(std[i].getBranch()!=null) {
				if(std[i].getBranch().equals(searchBranch) ) {
					std[i].printInfo();
				}
				
			}
		}
		//java과목을 수강하는 학생들만 검색하여 학생정보/학원정보 출력
//		std[i].printInfo();
//		std[i].printCompay();
		System.out.println("----------------------------");
		String searchCourse = "java";
		System.out.println(searchCourse+"과목을 수강하는 학생정보/학원정보");
		int cnt = 0; //학생의 번지
		while(cnt < std.length) {
			for(int i=0; i<std[cnt].getCourse().length;i++) {
				if(std[cnt].getCourse()[i] != null) {
					if(searchCourse.equals(std[cnt].getCourse()[i])) {
						std[cnt].printCompay();
						std[cnt].printInfo();
						std[cnt].printCourse();
					}
				}
			}
			cnt++;
		}					
	}
}
class Student2{
	//멤버변수 선언
	private String name;
	private String birth;
	private String phone;
	private int age;
	private static final String COMPANY="EZEN"; //Final은 대문자로 변수명 처리
	private String branch;
	private String[] course = new String[5]; //수강과목
	private String[] period = new String[5]; // 기간
	private int cnt; // 배열의 index 처리용 번지
	
	//생성자
	public Student2() {}
	
	public Student2(String name, String phone, String branch) {
		this.name = name;
		this.phone = phone;
		this.branch = branch;
	}
	
	public Student2(String name, String birth, String phone, int age, String branch) {
		this(name,phone,branch); // 생성자 호출(생성자의 첫 라인에서만 호출 가능)
		this.birth = birth;
		this.age = age;
	}
	//메세드
	public void printInfo() { //학생의 기본정보 출력
		System.out.println("---학생정보--");
		System.out.println("이름:"+name+"("+age+"세"+birth+") / "+phone);
	}
	public void printCompay() {
		System.out.println("===학원정보===");
		System.out.println("학원명:"+COMPANY+" / "+branch+"지점");
	}
	
	//수강정보 출력
	public void printCourse() {
		//cnt까지만 출력=> 추가되지 않은 값은 출력x
			if(course.length == 0 || cnt ==0) { //등록한 과목이 없음
				System.out.println("수강과목이 없습니다.");
				return;
			}
			for(int i =0;i<cnt;i++) {
				System.out.println("과정:"+course[i]+"("+period[i]+")");
		}
	}
	
	//수강정보 등록
	//insertCourse()
	//매개변수 course, period 주고 => 배열에 주기
	public void insertCource(String course, String period) {
		//cnt = 0 => 아직 추가값이 없음.
		if(cnt >=5) {
			System.out.println("더이상 수강하실 수 없습니다.");
			return;
		}
		this.course[cnt] = course;
		this.period[cnt] = period;
		cnt++;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	public static String getCompany() {
		return COMPANY;
	}
	
}

