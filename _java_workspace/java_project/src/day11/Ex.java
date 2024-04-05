package day11;


public class Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Card c = new Card();
//		c.setNum(10);
//		c.setShape('♥');
//		
//		c.setShape('♣');
//		c.setShape('%');
//		c.print();
		
		CardPack cp = new CardPack(); //52장의 카드가 모두 생성됨.
		System.out.println();
		cp.shuffle();
		
		int cnt=0;
		for(int i = 0; i<4; i++) {
			for(int j =0; j<13; j++) {				
				cp.getPack()[cnt].print();
				//cp.getPack() : CardPack 클래스안에 있는 pack[]
				//cp.getPack()[cnt] : pack[0] => Card (멤버변수, 메서드)
				cnt++;
			}
			System.out.println();
		}
		
		
		System.out.println("-----------");
		System.out.println("딜러가 카드를 나누고 있습니다.");
		Card player1 = cp.pick();
		Card player2 = cp.pick();
		System.out.println("player1 Card open");
		player1.print();
		System.out.println();
		System.out.println("player2 Card open");
		player2.print();
		

	}

}
