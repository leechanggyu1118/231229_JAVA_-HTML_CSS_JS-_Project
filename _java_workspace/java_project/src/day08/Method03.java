package day08;

public class Method03 {

	public static void main(String[] args) {
		
	gugu(3);

	}
	
	// 정수 (1~9 중 하나)에 해당하는 구구단이 출력
	// 매개변수 : 2
	// 리턴타입 : void 출력 :=> 리턴이 없음.
	public static void gugu(int num1) {		
		 if(num1>=1 && num1<=9) {
			 for(int i = 1; i<=9;i++) {
				 System.out.println(num1+" X "+i+" = "+(num1 * i)); 
			 } 
		 }
				 

	}
	
}
