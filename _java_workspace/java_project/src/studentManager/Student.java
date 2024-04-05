package studentManager;
import java.util.Arrays;

public class Student {
	private int studentSchoolNum;
	private String studentName;
	private int studentAge;
	private String studentPhoneNum;
	private String studentAddress;
	private String studentSubject;
	
	private Subject subjectArr[] = new Subject[5];
	private int cnt;
	
	public int getCnt() {
		return cnt;
	}




	public void setCnt(int cnt) {
		this.cnt = cnt;
	}




	public Student() {}

	
	

	public Student(String studentName, int studentAge, String studentPhoneNum) {
		super();
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentPhoneNum = studentPhoneNum;
	}

	public Subject[] getSubjectArr() {
		return subjectArr;
	}


	public void setSubjectArr(Subject[] subjectArr) {
		this.subjectArr = subjectArr;
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
	
	//-학생정보 출력 메서드
	public void printStudent() {
		System.out.println("---학생정보출력---");
		System.out.println("학생명: "+studentName+"나이: "+studentAge+"전화번호"+studentPhoneNum);
	}
	
	// -수강과목 출력 메서드
	public void printSubject() {
		if(cnt==0) {
			System.out.println("수강중인 과목이 없습니다. 다시 확인해 주세요.");
			return;
		}
		for(int i =0;i<cnt;i++) {
			System.out.println(subjectArr[i]);
		}
		
	}
	
	 //수강과목 추가 메서드
	public void insertSubject(Subject sub) {
		if(cnt == subjectArr.length) {
			//배열 자동 늘리기
			Subject[] tmp = new Subject[subjectArr.length+5];
			//배열복사
			System.arraycopy(subjectArr, 0, tmp, 0, cnt);
			subjectArr=tmp;			
		}
		subjectArr[cnt]=sub;
		cnt++;		
	}
	
	//수강과목 삭제 메서드
	public void delete(String subName) {
		//수강과목 배열에서 subName을 검색하여 삭제
		int index = -1;
		if(subName == null) {
			return;
		}
		for(int i=0;i<cnt;i++) {
			if(subjectArr[i].getSubjectName().equals(subName)) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("찾는 과목이 없습니다.");
			return;
		}
		//삭제 : 찾은 위치부터 뒷번지를 앞번지로 옮긴다.
		 for(int i=index;i<cnt-1;i++) {
			 subjectArr[i] = subjectArr[i+1];
		 }
		//끝번지는 null이 되어야함
		 subjectArr[cnt-1]=null;
		 //한 과목 삭제 과목 개수가 줄어듬
		 cnt--;
		 
		
	}
	

	public int getStudentSchoolNum() {
		return studentSchoolNum;
	}



	public void setStudentSchoolNum(int studentSchoolNum) {
		this.studentSchoolNum = studentSchoolNum;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public int getStudentAge() {
		return studentAge;
	}



	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}



	



	public String getStudentPhoneNum() {
		return studentPhoneNum;
	}




	public void setStudentPhoneNum(String studentPhoneNum) {
		this.studentPhoneNum = studentPhoneNum;
	}




	public String getStudentAddress() {
		return studentAddress;
	}



	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}



	public String getStudentSubject() {
		return studentSubject;
	}



	public void setStudentSubject(String studentSubject) {
		this.studentSubject = studentSubject;
	}


}