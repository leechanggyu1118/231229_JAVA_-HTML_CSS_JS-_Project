package sale;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	
	private ArrayList<Sale> menu = new ArrayList<Sale>();
	private ArrayList<Order> order = new ArrayList<Order>();
	
	//기본메뉴 구성
	public void addMenu() {
		menu.add(new Sale("햄버거",5000));
		menu.add(new Sale("피자",15000));
		menu.add(new Sale("콜라",3000));
		menu.add(new Sale("베이컨",100));
		menu.add(new Sale("치즈",500));
	}
	

	public void add(Scanner scan) { //1.메뉴추가
		System.out.println("메뉴이름을 입력해주세요.");
		String menuName = scan.next();
		System.out.println("메뉴가격을 입력해주세요.");
		int menuPrice = scan.nextInt();
		Sale s = new Sale(menuName,menuPrice);
		this.menu.add(s);
		System.out.println("메뉴가 추가되었습니다!");
		
	}

	public void menuDelete(Scanner scan) { //2.메뉴삭제
		System.out.println("삭제할 메뉴 이름을 입력해주세요.");
		String deleteMenu = scan.next();
		for(int i =0; i<menu.size();i++) {
			if(menu.get(i).getMenu().equals(deleteMenu)) {
				menu.remove(menu.get(i));
				System.out.println("메뉴를 삭제하였습니다!");
				return;
			}
			
		}
		System.out.println("삭제할 메뉴가 존재하지 않습니다.");
		
	}

	public void priceModify(Scanner scan) { //3.메뉴수정(가격수정)
		System.out.println("수정할 메뉴 이름을 입력해주세요.");
		String modifyMenu = scan.next();
		for(int i = 0;i<menu.size();i++) {
			if(menu.get(i).getMenu().equals(modifyMenu)) {
				menu.remove(menu.get(i));
				System.out.println("---메뉴 수정을 시작합니다.---");
				System.out.println("메뉴이름을 입력해주세요");
				modifyMenu = scan.next();
				System.out.println("가격을 입력해주세요");
				int modifyPrice = scan.nextInt();
				Sale s = new Sale(modifyMenu, modifyPrice);
				menu.add(s);
				System.out.println("메뉴수정이 완료되었습니다!");
				return;
			}
		}
		System.out.println("수정할 메뉴가 존재하지 않습니다.");
		
	}

	public void printMenu(Scanner scan) { //4.메뉴보기(전체 메뉴 출력)
		System.out.println("----------메뉴판----------");
		for(Sale menuList : menu) {
			System.out.println(menuList);
		}
		System.out.println("-------------------------");
	}
	
	//order의 값이 있는지 확인
	public int orderSearch(String menu) {
		int index = -1;
		for(int i =0; i<order.size();i++) {
			if(order.get(i).getMenu().equals(menu)) {
				index = i;
				return index;
			}
		}
		return index; //해당 메뉴가 없다면 -1리턴
	}

	public void orderPick(Scanner scan) { //5.주문
		//메뉴와 수량을 입력받아 order 객체를 생성 후 orderList에 추가
		//price는 menueList에서 가져와야 함.
		System.out.println("주문할 메뉴를 입력해주세요.");
		String orderPick = scan.next();
		System.out.println("주문할 갯수를 입력해주세요.");		
		int orderCount = scan.nextInt();
		for(int i =0;i< menu.size();i++) {
			if(menu.get(i).getMenu().equals(orderPick)) {
				
				int price = menu.get(i).getPrice(); //내가 주문한 메뉴의 가격
				//order의 데이터가 없다면 비교자체가 불가
				
				//주문한 같은 메뉴가 없으면 -1 / 있으면 해당 번지
				int index = orderSearch(orderPick);
				if(index != -1) { //해당 메뉴가 있다면...
					//기존 값에서 count + / total +
					int cnt = order.get(index).getCount(); //기존 주문 수량
					int tot = order.get(index).getTotal();//기존 주문 금액
					order.get(index).setCount(orderCount+cnt);
					order.get(index).setTotal(tot+(price*orderCount));
					System.out.println("주문이 완료되었습니다.");
					return;
				}
				
				Order o = new Order(orderPick, price, orderCount);
				order.add(o);
				System.out.println("주문이 완료되었습니다.");				
				return;
			}
			
			
		}
		System.out.println("주문할 메뉴가 존재하지 않습니다.");
	}

	public void orderPickPrint(Scanner scan) { //6.주문 메뉴 출력(영수증)	
		int sum =0;
		
		System.out.println("---------------영수증---------------");
		for(Order o : order) {
			
			System.out.println(o);
//			System.out.println();
			sum+=o.getTotal();
		}
		System.out.println("총 지불금액 :"+sum);
		System.out.println("----- 이용해주셔서 감사합니다!  -----");
			
	}

}
