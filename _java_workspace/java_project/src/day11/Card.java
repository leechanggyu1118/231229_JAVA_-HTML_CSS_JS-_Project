package day11;


/* 1장의 카드를 생성하기위한 클래스
 * - 숫자 : 1~10,j(11),q(12),k(13)
 * - 모양 : ♥,◆,♣,♠
 * - 한장의 카드를 출력하는 기능 print() => ♥1
 * ex) ◆12 => ◆Q, ♠13 =>♠K, %2 => ♥2 //없는모양 입력하면 하트
 */
/* 클래스의 구성
 * - 멤버변수 : 모양(shape), 숫자(num) => private => getter/setter 생성
 * - 메서드 : print()
 * - 생성자 : 기본 생성자만 생성 => ♥1
 * 
 */
public class Card {
	// 멤버변수
	private int num;
	private char shape;
	
	//생성자
	public Card() {
		this.num = 1;
		this.shape='♥';
	}

	//print() 메서드
	public void print() {
		System.out.print(shape);
		if(num == 11) {
			System.out.print("J ");
		}else if(num ==12) {
			System.out.print("Q ");
		}else if(num ==13) {
			System.out.print("K ");
		}else {
			System.out.print(num+" ");
			
		}
	}
	
	
	//getter,setter
	public int getNum() {
		return num;
	}
	
	//외부의 값(매개변수)으로 내부 변수(멤버변수)를 변경할 때 사용하는 메서드
	public void setNum(int num) {
		//1~13까지만 내 숫자, 그 외는 1로 설정
		if(num>0 && num<14) {
			this.num = num;
		}else {
			num = 1;
		}
	
	}
	
	
	public char getShape() {
		return shape;
	}
	
	public void setShape(char shape) {
		//- 모양 : ♥,◆,♣,♠ 아닌 나머지 모양은 ♥
		if((shape == '♥')||(shape == '◆')||(shape == '♣')||(shape == '♠')) {
			
			this.shape = shape;
		}else {
			this.shape = '♥';
			
		}
	} 
	
	public void setShape2(char shape) {
		//- 모양 : ♥,◆,♣,♠ 아닌 나머지 모양은 ♥
		switch(shape) {
		case '♥': case'◆': case'♣': case '♠':
			this.shape = shape;
			break;
			default:
				this.shape = '♥';
		}
			
		
			
		
	} 
	

}
