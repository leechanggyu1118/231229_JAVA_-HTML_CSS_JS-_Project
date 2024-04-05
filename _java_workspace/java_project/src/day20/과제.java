package day20;

import java.util.ArrayList;
import java.util.Comparator;

public class 과제 {

	public static void main(String[] args) {
		/* 스트림으로 출력
		 * 여행사 상품이 있습니다.
		 * 여행 비용은 15세 이상은 100만원, 그 미만은 50만으로 계산
		 * 고객 3명이 패키지 여행을 떠난다고 했을 경우
		 * 1. 비용계산 => 출력, 2.고객명단 검색 => 출력
		 * 고객 클래스를 생성하고,ArrayList로 고객관리
		 * 
		 * 예시) 고객정보 -> 고객명단
		 * 이름:이순신, 나이:40, 비용:100
		 * 이름:신사임당, 나이:35, 비용:100
		 * 이름:홍길동, 나이:10, 비용:50
		 * 총 여행 경비 : 250
		 * 
		 * 20대 이상 고객명단 => 이름순으로 정렬
		 * 이름:신사임당, 나이:35, 비용:100
		 * 이름:이순신, 나이:40, 비용:100
		 * 
		 */
		ArrayList<CustomerList> list = new ArrayList<CustomerList>();
		list.add(new CustomerList("이순신", 40));
		list.add(new CustomerList("신사당", 35));
		list.add(new CustomerList("이춘향", 10));
		list.add(new CustomerList("이몽룡", 14));
		list.add(new CustomerList("김두박", 40));
		
		System.out.println("---고객명단---");
		list.stream().forEach(n-> System.out.println(n));
		
		System.out.println("---총 비용계산---");
		int TotalSum = list.stream()
		.mapToInt(n->n.getPrice())
		.sum();
		System.out.println("총 여행경비 : "+TotalSum);
		
		System.out.println("---20대 이상 고객명단---");
		list.stream()
		.filter(n->n.getCustomerAge()>=20)
		.sorted(Comparator.comparing(CustomerList::getCustomerName)) // :: = 이용하겠다 라는 뜻
		.forEach(a->System.out.println(a));
		
	}


}

class CustomerList{
	private String customerName;
	private int customerAge;
	private int price;
	
	public CustomerList() {}

	public CustomerList(String customerName, int customerAge) {
		this.customerName = customerName;
		this.customerAge = customerAge;
		this.price = (customerAge>=15)? 100:50;
	}
	

	@Override
	public String toString() {
		return "이름 : " + customerName + " | 나이 : " + customerAge + " | 비용 : " + price+" 만원" ;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerAge() {
		return customerAge;
	}

	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
