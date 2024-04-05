package studentManager;

import java.util.Scanner;

public class StudentMain {

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
	 * -완-
	 */
	
	/* Program interface : StudentManager class의 운영메서드 정리
	 *  - 학생리스트 출력기능 void printStudent();
	 *  - 학생등록기능 void insertStudent(Scanner scan);
	 *  - 학생검색기능 void searchStudent(Scanner scan);
	 *  - 수강신청기능 void registerSubject(Scanner scan);
	 *  - 수강철회기능 void deleteSubject(Scanner scan);
	 * -완-
	 */
	
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
	public static void main(String[] args) {
		/* StudentMain class : 객체를 생성하고 화면에 출력하는 클래스
		 * -menu :
		 * 1.학생등록|2.학생리스트출력|3.학생검색(학생정보,수강정보)
		 * 4.수강신청|5.수강철회|6.종료
		 * 
		 * 
		 */
		
		// - Subject class : 하나의 수강과목정보를 저장하는 클래스
		 //		-과목코드, 과목명, 학점, 시수, 교수명, 학기, 시간표, 강의장

		
		Scanner scan = new Scanner(System.in);
		
		int menu = 0;
		StudentManager sm = new StudentManager();
		Student s = new Student();
		
		do { 
			System.out.println("---MENU---");
			System.out.println("1.학생등록|2.학생리스트출력|3.학생검색(학생정보,수강정보)");
			System.out.println("4.수강신청|5.수강철회|6.종료");
			menu = scan.nextInt();
			switch(menu) {
			case 1 :
				sm.insertStudent(scan);
				
				System.out.println("입력되었습니다.");
				
				break;
			case 2 :
				System.out.println("학생리스트출력");
				sm.printStudent();
				System.out.println("학생리스트출력이 끝났습니다.");
				break;
			case 3 :
				System.out.println("학생검색(학생정보,수강정보)");
				sm.searchStudent(scan);
				System.out.println("학생검색(학생정보,수강정보)가 끝났습니다.");
				break;
				
			case 4 :
				System.out.println("4.수강신청");
				sm.registerSubject(scan);
				System.out.println("완료되었습니다.");
				
				break;
			case 5 :
				System.out.println("5.수강철회");
				sm.deleteSubject(scan);
				System.out.println("완료되었습니다.");
				
				break;
			case 6 :
				
				System.out.println("6.종료");
				
				break;
				default :
					System.out.println("잘못된 메뉴입니다");
			}
		
		}while(menu!=6);
		
		System.out.println("프로그램이 종료되었습니다.");
		

		scan.close();
	}
}