package day13;

import java.util.Arrays;
import java.util.Scanner;

// Product 클래스 생성 : 상품을 등록하는 클래스
// 상품명, 가격을 멤버변수로 생성
// 상품추가 메서드
// 상품출력 메서드 (toString으로 생성가능)

// Product 클래스 생성 : 상품을 등록하는 클래스
class Product {
	
// 상품명, 가격을 멤버변수로 생성
	private String productName;
	private String productPrice;
	private String productArr[] = new String[] {};
	private int cnt;
	
	public Product() {}
	public Product(String productName, String productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;	
	}
// 상품추가 메서드
		public void productInsert(String productName, String productPrice) {
		this.productName = productName;
		this.productPrice = productPrice;
	}

	
// 상품출력 메서드 (toString으로 생성가능)
		public void printProduct() {
			 System.out.println("상품이름:"+productName+" 상품가격:"+productPrice);
		}

	
	
	@Override
	public String toString() {
		return "Product [productName=" + productName + ", productPrice=" + productPrice +   "]";
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String[] getProductArr() {
		return productArr;
	}
	public void setProductArr(String[] productArr) {
		this.productArr = productArr;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	
	
	
}

public class 과제 {

	public static void main(String[] args) {
		//상품을 10개 등록 가능한 배열 생성
		//스캐너를 이용하여 상품을 등록받기
		// 등록한 상품 출력
		
		
		int cnt = 0;
//		Product p = new Product();
		//상품을 10개 등록 가능한 배열 생성
		Product arr[] = new Product[10];
		//스캐너를 이용하여 상품을 등록받기
		Scanner scan = new Scanner(System.in);
		do {
			
			System.out.println("제품이름을 입력해주세요");
			String product = scan.next();
			System.out.println("제품가격을 입력해주세요");
			String price = scan.next();
			Product p = new Product();
			p.productInsert(product,price);
				arr[cnt] = p;
			
			System.out.println((cnt+1)+"번째 상품을 추가하였습니다.");
			cnt++;
	
			
		}while(cnt !=10);
		System.out.println("--------------------------------");
		System.out.println("10개의 상품 등록을 완료하였습니다.");
		System.out.println("---등록된 상품 목록---");
		
		// 등록한 상품 출력
		for(int i =0;i<cnt;i++) {
			 System.out.println(arr[i]);
		 }
		
		
		scan.close();

		

	}

}
