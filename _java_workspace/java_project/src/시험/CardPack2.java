package 시험;

public class CardPack2 {
	
	private Card2[] cardPack2 = new Card2[52];
	private int cnt = 0;

	public CardPack2() {		
		char shape = '♥';
		for(int i = 1; i<=4; i++) {
			
		switch(i){
			case 1: shape = '♥'; break;
			case 2: shape = '◆'; break;
			case 3: shape = '♣'; break;
			case 4: shape = '♠'; break;
		}
			for(int j = 1; j<=13;j++) {
				Card2 c = new Card2();
				c.setShape(shape);
				c.setNum(j);
				cardPack2[cnt] = c;
				cnt++;	
			}
		}
		
	}	
	
	public static void main(String[] args) {
		CardPack2 cp2 = new CardPack2();
		int cnt = 0;
		for(int i =0; i<4; i++) {
			for(int j = 0; j<13;j++) {
				cp2.getCardPack2()[cnt].printCard();
				cnt++;
			}
			System.out.println();
		}		
		
	}	
	
	public Card2[] getCardPack2() {
		return cardPack2;
	}

	public void setCardPack2(Card2[] cardPack2) {
		this.cardPack2 = cardPack2;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

}
