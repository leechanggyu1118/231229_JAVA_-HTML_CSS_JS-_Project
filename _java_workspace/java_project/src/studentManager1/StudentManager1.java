package studentManager1;

import java.util.Scanner;

public class StudentManager1 implements Program1{
	
	//학생의 배열을 멤버변수로 추가
	private Student1[] studentList = new Student1[5];
	
	//index처리 변수
	private int stdCnt;
	

	@Override
	public void printStudent() {
		System.out.println("---------전체 학생 정보");
		for(int i =0; i<stdCnt;i++) {
			studentList[i].stdPrint(); //학생정보 출력
		}
		
	}

	@Override
	public void insertStudent(Scanner scan) {
		// 1명의 학생정보를 입력받아서 객체를 생성한 후 studentList에 추가
		System.out.println("학번>");
		String stdNum = scan.next();
		System.out.println("이름>");
		String name = scan.next();
		System.out.println("전화번호>");
		String phone = scan.next();
		
		//입력받은 값을 객체로 생성 (Student)
		Student1 s = new Student1(stdNum, name, phone);
		
		//배열이 다 찼을 경우 배열복사
		if(stdCnt == studentList.length) {
			Student1[] tmp = new Student1[studentList.length+5];
			System.arraycopy(studentList, 0, tmp, 0, stdCnt);
			studentList = tmp;
		}
		studentList[stdCnt] = s;
		stdCnt++;
	}

	@Override
	public void searchStudent(Scanner scan) {
		// 검색할 학생이름을 입력받아 배열에서 탐색 후 있다면
		//학생정보 + 수강정보 출력
		System.out.println("검색할 학생명 >");
		String searchName = scan.next();
		
		//배열 탐색
		for(int i =0; i<stdCnt;i++) {
			if(searchName.equals(studentList[i].getStdName())) {
				studentList[i].stdPrint();
				studentList[i].subPrint();
				return;
				
			}
		}
		System.out.println("검색한 이름이 없습니다.");
		
	}

	@Override
	public void registerSubject(Scanner scan) {
		// 누가 무슨과목을 추가할지 설정
		// 수강신청할 학생이름을 입력받아 
		System.out.println("수강신청 학생명>");
		String name = scan.next();
		int index = -1; // 학생의 번지를 저장하기위한 번수
		//학생의 위치를 탐색 후
		for(int i =0;i<stdCnt;i++) {
			if(name.equals(studentList[i].getStdName())) {
				index = i;
				break;
			}
		}
		//학생이 없다면...
		if(index == -1) {
			System.out.println("학생정보가 없습니다.");
			return;
		}
		// 그 학생의 배열에 수강과목을 추가
		// 수강과목의 객체를 생성
		System.out.println("수강신청 과목>");
		String sName = scan.next();
		Subject1 s = new Subject1(sName);
		// Student클래스(수강신청을 한 학생)의 insertSubject호출 (해당 배열에 추가)
		studentList[index].insertSubject(s);
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 누가 무슨과목을 삭제할지 설정
				// 수강신청할 학생이름을 입력받아 
				System.out.println("수강철회 학생명>");
				String name = scan.next();
				int index = -1; // 학생의 번지를 저장하기위한 번수
				//학생의 위치를 탐색 후
				for(int i =0;i<stdCnt;i++) {
					if(name.equals(studentList[i].getStdName())) {
						index = i;
						break;
					}
				}
				//학생이 없다면...
				if(index == -1) {
					System.out.println("학생정보가 없습니다.");
					return;
				}
				// 그 학생의 배열에 수강과목을 추가
				// 수강과목의 객체를 생성
				System.out.println("수강철회 과목>");
				String sName = scan.next();
				
				//해당 학생의 수강삭제 메서드 호출
				studentList[index].deleteSubject(sName);
		
	}

}
