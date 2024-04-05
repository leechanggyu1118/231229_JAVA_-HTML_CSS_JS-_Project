package std;

import java.util.Scanner;

//2
public class StdMain {

	public static void main(String[] args) {
		// 메뉴구성
		/* 1.학생추가 | 2.학생리스트 | 3.학생검색
		 * 4.학생수정 | 5.학생삭제
		 * 6. 점수추가 | 7.점수수정 | 8.점수삭제 |9.종료
		 */
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		StdManager sm = new StdManager();	
		do {
			System.out.println("-----학생관리프로그램-----");
			System.out.println("1.학생추가 | 2.학생리스트 | 3.학생검색");
			System.out.println("4.학생수정 | 5.학생삭제 | 6.점수추가");
			System.out.println("7.점수수정 | 8.점수삭제 |9.종료");
			System.out.println("메뉴를 선택해주세요.");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1: sm.addStd(scan); break;
			case 2: sm.printStd(); break;
			case 3: sm.searchStd(scan); break;
			case 4: sm.modStd(scan); break;
			case 5: sm.delStd(scan); break;
			case 6: sm.addSub(scan); break;
			case 7: sm.modSub(scan); break;
			case 8: sm.delSub(scan); break;
			case 9: System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴값입니다.");
				break;
			}
			
		}while(menu != 9);
		System.out.println("포로그램이 종료되었습니다.");

		scan.close();
	}

}
