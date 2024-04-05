package sale;

public class Order extends Sale{
	
	//order Class => sale을 상속 받아서 사용
	//order => (menu price) count total
	//주문 객체
	//주문을 하려면 (메뉴명, 가격), 수량, 합계(가격*수량)
	//(메뉴명, 가격) : 상속받은 객체의 값 super
	// 수량, 합계 : order만 가지고 있는 내 객체 => this
	
	private int count = 0;
	private int total = 0; //합계(가격*수량)

	public Order() {}
	public Order(String menu, int price, int count) {
//		super.setMenu(menu); //부모의 set 사용
//		super.setPrice(price);
		
		//부모 생성자 호출
		super(menu,price);
		this.count = count;
		this.total = price * count;
		
	}
	// 내가 만든것
	public Order(int count, int total) {
		super();
		this.count = count;
		this.total = total;
	}
	//

	//주문 내역 출력하는 메서드
	public void print() {
		System.out.print(super.getMenu()+":"+super.getPrice()+" / ");
		System.out.println(count+"개 주문 => 금액 : "+total);
	}

	@Override
	public String toString() {
		return super.toString()+" / 주문개수 : " + count + ", | 총 금액 :" + total;
	}



	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	

}
