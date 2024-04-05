package sale;

import java.util.Scanner;

public class SaleMain {

	public static void main(String[] args) {
		/* menu
		 * 1.메뉴추가|2.메뉴삭제|3.메뉴수정(가격수정)
		 * 4.메뉴보기(전체 메뉴 출력)|5.주문|6.주문 메뉴 출력(영수증)
		 * 7.종료
		 */
		// 주문클래스는 메뉴클래스를 상속
		
		Scanner scan = new Scanner(System.in);
		SaleManager sm = new SaleManager();
		sm.addMenu();
		
		int menu = 0;
		
		do {
			System.out.println("---------- 판매프로그램  ----------");
			System.out.println("1.메뉴추가|2.메뉴삭제|3.메뉴수정(가격수정)");
			System.out.println("4.메뉴보기(전체 메뉴 출력)|5.주문|6.주문 메뉴 출력(영수증)");
			System.out.println("7.종료");
			System.out.println("메뉴를 입력해주세요");
			menu = scan.nextInt();
			
			switch (menu) {
			case 1:	sm.add(scan);break;
			case 2:	sm.menuDelete(scan);break;
			case 3:	sm.priceModify(scan);break;
			case 4:	sm.printMenu(scan);	break;
			case 5:	sm.orderPick(scan);	break;
			
			case 6:	sm.orderPickPrint(scan);	break;
			case 7:	
				break;

			default:
				System.out.println("잘못된 메뉴입니다.");
				break;
			}
		}while(menu != 7);
		
		System.out.println("프로그램을 종료합니다.");
		
		
		
		
		
		
		
		
		
		
		scan.close();

		
		
		
	}
	
	
	

}
