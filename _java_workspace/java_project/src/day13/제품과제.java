package day13;

import java.util.Scanner;

class Product1{
	private String name;
	private int price;
	
	public Product1() {}
	public Product1(String name, int price) {
		this.name = name;
		this.price = price;
	}
	// 상품추가 메서드
			public void product1Insert(String name,int price) {
				this.name = name;
				this.price = price;
			
		}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "name :" + name + ", price : " + price + "";
	}
	
	
	
}

public class 제품과제 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Product1[] menu = new Product1[10]; //Product 클래스를 담을 수 있는 배열 10칸을 준비
		int cnt = 0;
		
		//상품을 등록하시겠습니까(y/n)? y => 등록 / n =>그만
		//n을 누르면 등록한 상품 출력
		
		do {
			System.out.println("상품을 등록하시겠습니까? (y or n)");
			String a = scan.next();
			if(a.equals("n")) {
				break;
			}
			if(a.equals("y")) {
				
			System.out.println("상품명을 입력해주세요");
			String name = scan.next();
			System.out.println("상품의 가격을 입력해주세요");
			int price = scan.nextInt();
			Product1 p = new Product1();
			p.product1Insert(name, price);
			menu[cnt] = p;
					
			System.out.println(p.toString());
			cnt++;

			}else {
				System.out.println("다시입력해주세요");
			}
			
		}while(cnt !=10);
		System.out.println("상품등록이 끝났습니다.");
		
		for(int i =0; i<cnt;i++) {
			System.out.println((i+1)+"."+menu[i]);
		}
		
//		Product1 p = new Product1("pizza",15000);
//		menu[cnt] = p;
//		cnt++;
//		Product1 p1 = new Product1();
//		p1.product1Insert("음료", 2000);
//		menu[cnt] = p1;
//		cnt++;
//		
//		for(int i =0;i<cnt;i++) {
//			System.out.println(menu[i]);
//		}
	
		scan.close();
	}

}
