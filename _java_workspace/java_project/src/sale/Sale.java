package sale;

public class Sale {
	
	private String menu;
	private int price;
	
	public Sale() {}

	public Sale(String menu, int price) {
		super();
		this.menu = menu;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "메뉴 : " + menu + " | 가격 : " + price ;
	}
	

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	


}
