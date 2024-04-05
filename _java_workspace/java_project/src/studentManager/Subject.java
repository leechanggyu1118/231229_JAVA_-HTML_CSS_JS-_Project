package studentManager;

public class Subject {
	private String subjectCode;
	private String subjectName;
	private int subjectScore;
	private int subjectTime;
	private String subjectProfessorName;
	private int semester;
	private String subjectSchedule;
	private String subjectPlace;
	
	//생성자
	public Subject() {}
	
	// 과목명, 교수명, 장소
	public Subject(String subjectName, String subjectProfessorName, String subjectPlace) {
		super();
		this.subjectName = subjectName;
		this.subjectProfessorName = subjectProfessorName;
		this.subjectPlace = subjectPlace;
	}
	
	//과목명
	public Subject(String subjectName) {
		super();
		this.subjectName = subjectName;
	}

	/* 학생/수강관리 프로그램
	 * - Subject class : 하나의 수강과목정보를 저장하는 클래스
	 * 		-과목코드, 과목명, 학점, 시수, 교수명, 학기, 시간표, 강의장
	 * 
	 * 
	 * -Student class : 한 학생의 정보를 저장하는 클래스
	 * -학번, 이름, 나이, 전화번호, 주소, 수강과목s
	 * -멤버변수, 생성자, getter/setter, toString
	 * -멤버변수에 학생이 듣고자하는 과목을 저장 Subject[]
	 * 메서드
	 * 	-학생정보 출력 메서드
	 * 	-수강과목 추가 메서드,
	 * 	-수강과목 삭제 메서드
	 * 	-수강과목 출력 메서드
	 * 
	 */
	

	@Override
	public String toString() {
		return  " 과목명: " + subjectName + ", 교수명:" + subjectProfessorName + ", 장소:" + subjectPlace + "]";
	}



	
	public String getSubjectCode() {
		return subjectCode;
	}



	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}



	public String getSubjectName() {
		return subjectName;
	}



	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}



	public int getSubjectScore() {
		return subjectScore;
	}



	public void setSubjectScore(int subjectScore) {
		this.subjectScore = subjectScore;
	}



	public int getSubjectTime() {
		return subjectTime;
	}



	public void setSubjectTime(int subjectTime) {
		this.subjectTime = subjectTime;
	}



	public String getSubjectProfessorName() {
		return subjectProfessorName;
	}



	public void setSubjectProfessorName(String subjectProfessorName) {
		this.subjectProfessorName = subjectProfessorName;
	}



	public int getSemester() {
		return semester;
	}



	public void setSemester(int semester) {
		this.semester = semester;
	}



	public String getSubjectSchedule() {
		return subjectSchedule;
	}



	public void setSubjectSchedule(String subjectSchedule) {
		this.subjectSchedule = subjectSchedule;
	}



	public String getSubjectPlace() {
		return subjectPlace;
	}



	public void setSubjectPlace(String subjectPlace) {
		this.subjectPlace = subjectPlace;
	}

}