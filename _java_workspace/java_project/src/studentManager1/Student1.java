package studentManager1;

import java.util.Arrays;

public class Student1 {
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
	 * int => 정수형 숫자 => 연산이 필요한 자료
	 */
	
	private String stdNum;
	private String stdName;
	private String stdPhone;
	
	private Subject1[] subjectList = new Subject1[5];
	private int cnt; //subjectList 배열의 index 역할
	
	//생성자
	
	public Student1() {}
	public Student1(String stdNum, String stdName, String stdPhone) {
		this.stdNum = stdNum;
		this.stdName = stdName;
		this.stdPhone = stdPhone;
	}
	
//	 * 	-학생정보 출력 메서드(toString 이용가능)
	public void stdPrint() {
//		System.out.println("---학생정보---");
		System.out.println("학생명:"+stdName+"("+stdNum+") / "+stdPhone);
	}
	public void subPrint() {
		//Subject 클래스의 toString 호출
		if(cnt==0) {
			System.out.println("수강중인 과목이 없습니다.");
			return; //더 이상 내려가지않게 끊어주는 역할
		}
		//toString은 객체의 내용이 문자로 리턴 sysout(객체) => toString 호출
		for(int i =0;i<cnt;i++) {
			System.out.println(subjectList[i]); //toString 호출
		}
	}
//	 * 	-수강과목 추가 메서드 : 배열로 여러개 존재(for)
	//매개변수 : 수강과목 객체 Subject
	public void insertSubject(Subject1 sub) {
		// 배열이 다 찼다면... 배열을 늘려주기.
		// 배열은 길이를 정하면 변경 불가능.
		// 더 긴 길이의 배열을 생성하여 배열 복사 후 배열 바꾸기
		
//	 * 	-수강과목 출력 메서드
		if(cnt == subjectList.length) {
			Subject1[] tmp = new Subject1[subjectList.length+5];
			//배열복사
			System.arraycopy(subjectList, 0, tmp, 0, cnt);
			subjectList = tmp;
		}
		//subjectList 배열에 해당 객체 담기
		subjectList[cnt] = sub;
		cnt++;
	}
	
//	 * 	-수강과목 삭제 메서드
	public void deleteSubject(String subName) {
		// 수강과목 배열에서 subName을 검색하여 삭제
		int index = -1;
		if(subName == null) {
			return;
		}
		for(int i =0;i<cnt; i++) {
			if(subjectList[i].getSubName().equals(subName)) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("찾는 과목이 없습니다.");
			return;
		}
		//삭제 : 찾은 위치부터 뒷번지를 앞번지로 옮기는 작업 
		for(int i =index; i<cnt-1;i++) {
			subjectList[i] = subjectList[i+1];
		}
		// 끝번지는 null
		subjectList[cnt-1]=null;
		//한 과목 삭제 과목 개수가 줄어듦
		cnt--;
		
	}
	
	
	
	
	
	
	
	public String getStdNum() {
		return stdNum;
	}
	public void setStdNum(String stdNum) {
		this.stdNum = stdNum;
	}
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdPhone() {
		return stdPhone;
	}
	public void setStdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}
	public Subject1[] getSubjectList() {
		return subjectList;
	}
	public void setSubjectList(Subject1[] subjectList) {
		this.subjectList = subjectList;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "Student1 [stdNum=" + stdNum + ", stdName=" + stdName + ", stdPhone=" + stdPhone + ", subjectList="
				+ Arrays.toString(subjectList) + ", cnt=" + cnt + "]";
	}
	

}
