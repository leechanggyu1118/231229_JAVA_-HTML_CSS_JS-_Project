package studentManager;

import java.util.Scanner;


public class StudentManager implements Program {
	
	/* StudentManager class : 실제 객체들을 운영하는 클래스 implements 인터페이스 program
	 * 
	 */
	
	/* StudentMain class : 객체를 생성하고 화면에 출력하는 클래스
	 * -menu :
	 * 1.학생등록|2.학생리스트출력|3.학생검색(학생정보,수강정보)
	 * 4.수강신청|5.수강철회|6.종료
	 * 
	 * 
	 */
	
	//학생의 배열을 멤버변수로 추가
	Student[] starr = new Student[5];
	//index처리 변수
	private int stdCnt;
	
	Subject[] sb = new Subject[5];
	public void addSubject() {
		Subject sb1 = new Subject("자바","박둘이","103호");
		Subject sb2 = new Subject("파이썬","서삼이","104호");
		Subject sb3 = new Subject("디자인설계","황넷이","105호");
		Subject sb4 = new Subject("사무자동화","서문오이","106호");
		Subject sb5 = new Subject("정보처리","오이","107호");
		sb[0]=sb1;
		sb[1]=sb2;
		sb[2]=sb3;
		sb[3]=sb4;
		sb[4]=sb5;	
	}
	
	public void printSubjectList() { //학생 과목리스트 출력
		for(int i =0;i<sb.length;i++) {
			System.out.println(sb[i]);			
		}
	}
	
	@Override
	public void printStudent() { //학생리스트 출력
		System.out.println("----------학생리스트----------");	
		for(int i =0;i<stdCnt;i++) {
			starr[i].printStudent();			
		}
	}

	@Override
	public void insertStudent(Scanner scan) { //학생등록기능 완료
		System.out.println("이름을 입력해주세요");
		String stName = scan.next();
		System.out.println("나이를 입력해주세요");
		int stage = scan.nextInt();
		System.out.println("전화번호를 입력해주세요");
		String stPhone = scan.next();
		
		Student st = new Student(stName,stage,stPhone);
		
		//배열이 다 찼을 경우 배열복사
		if(stdCnt == starr.length) {
			Student[] tmp = new Student[starr.length+5];
			System.arraycopy(starr, 0, tmp, 0, stdCnt);
			starr = tmp;
		}
		starr[stdCnt] = st;
		stdCnt++;
		
	}

	@Override
	public void searchStudent(Scanner scan) { //학생검색기능 학생정보,수강정보 완료
		System.out.println("검색할 학생이름을 입력해주세요");
		String searchName = scan.next();
		
		//배열탐색
		for(int i=0;i<stdCnt;i++) {
			if(searchName.equals(starr[i].getStudentName())) {
				starr[i].printStudent();
				starr[i].printSubject();
				return;
			}
		}
		System.out.println("검색한 이름이 없습니다.");
		
		
	}

	@Override
	public void registerSubject(Scanner scan) {//수강신청기능
		System.out.println("수강신청할 학생의 이름을 입력하세요");
		String name = scan.next();
		int index = -1; // 학생의 번지를 저장하기 위한 변수
		
		for(int i=0;i<stdCnt;i++) {
			if(name.equals(starr[i].getStudentName())) {
				index = i;
				break;			
			}
		}		
		if(index == -1){
			System.out.println("학생의 정보가 없습니다.");
			return;
		}
		System.out.println("수강신청할 과목을 입력하세요");
		String sbName = scan.next();
		
		Subject sb = new Subject(sbName); //?
		
		starr[index].insertSubject(sb); //Student 클래스의 과목추가 메서드를 호출
		
			
	}
	
	
	@Override
	public void deleteSubject(Scanner scan) {//수강철회기능
		System.out.println("수강철회할 학생이름을 입력해주세요");
		String name = scan.next();
		int index = -1; // 학생의 번지를 저장하기 위한 변수
		
		for(int i=0;i<stdCnt;i++) {
			if(name.equals(starr[i].getStudentName())) {
				index = i;
				break;			
			}
		}		
		if(index == -1){
			System.out.println("학생의 정보가 없습니다.");
			return;
		}
		System.out.println("수강철회할 과목을 입력하세요");
		String sbName = scan.next();
		//해당 학생의 수강철회 메서드 호출
		starr[index].delete(sbName);
		
	}
}