package day19;

import java.util.ArrayList;
import java.util.Scanner;

public class SaleManager {
	//제네릭 클래스 처리
	private ArrayList<Sale<String, Integer>> menu = new ArrayList<>();
	private ArrayList<Sale<String, Integer>> order = new ArrayList<>();
	
	public void add(Scanner scan) {
		// 제품 추가
		System.out.println("제품을 추가해주세요");
		String product = scan.next();
		System.out.println("가격을 입력해주세요");
		int price = scan.nextInt();
		Sale<String, Integer> s = new Sale<String, Integer>(product,price);
		this.menu.add(s);
		System.out.println("제품을 추가하였습니다.");
	}

	public void menuPrint(Scanner scan) {
		// 제품리스트보기
		System.out.println("---제품리스트---");
		for(Sale<String, Integer> tmp : menu) {
			System.out.println(tmp);
		}
		
	}

	public void orderPick(Scanner scan) {
		// 입력받는 값은 제품명, 수량
		// 제품명 가격*수량 (지불금액)을 order 추가
		//햄버거 5 => 햄버거 25000
		System.out.println("선택할 제품을 입력해주세요");
		String pick = scan.next();
		System.out.println("구매할 수량을 입력해주세요");
		int cnt = scan.nextInt();
		for(int i =0;i<menu.size();i++) {	
			if(menu.get(i).getMenu().equals(pick)) {
				
				int index = orderSearch(pick);				
				int allprice = menu.get(i).getPrice()*cnt;
				
				Sale<String, Integer> s = new Sale<String, Integer>(pick,allprice);
				
				
				if(index != -1) { //order에 같은 제품이 있다면..?
					int price = order.get(index).getPrice();
					order.get(index).setPrice(price+allprice);
					return;
				}
				
				order.add(s);
				
				System.out.println("제품을 선택하였습니다.");
				return;
				
			}
		}
		System.out.println("제품이 존재하지 않습니다.");
		
		
	}
	
	public int orderSearch(String name) {
		//name = 주문메뉴
		int index = -1;
		for(int i =0; i<order.size();i++) {
			if(order.get(i).getMenu().equals(name)) {
				index = i;
				return index;
			}
		}
		return index;
		
	}

	public void orderPrint() {
		// 주문내역 출력 
		//총 지불금액 출력
		int sum = 0;
		System.out.println("---선택한 제품 리스트---");
		for(Sale<String, Integer> tmp : order) {
			System.out.println(tmp);
		}
		for(int i =0; i<order.size();i++) {
			int allprice = order.get(i).getPrice();
			sum += allprice;
		}	
		System.out.println("총 지불금액 : "+sum);
	}
	

}
