package day11;

public class Class04 {

	public static void main(String[] args) {
		/* TV 클래스 생성
		 * 멤버변수 : brand , power, cha, vol
		 * 메서드 : 
		 * power()
		 * power가 켜지면 "TV가 켜졌습니다." 꺼지면 "TV가 꺼졌습니다.
		 * 
		 * chUp() : 1씩 증가 ch은 20까지 있음. 20이 넘어가면 다시 0번으로 순환구조
		 * 
		 * chDown() : 1씩 감소 Up처럼 순환구조
		 * 
		 * volUp() / volDown() : 1씩증가 / 1씩감소 
		 * vol은 10까지 있음. 10이 넘으면 계속 10, 0이면 음소거
		 * 
		 * getter / setter
		 */
		
		Tv t  = new Tv(0);
		t.print();
		t.volDown();
		t.power();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volUp();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.volDown();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chUp();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.chDown();
		t.power();
		t.power();
		t.print();
		
		
		
	}

}

class Tv{
	//멤버변수
	//brand , power, cha, vol
	private final String BRAND = "LG"; //final은 변경할 수 없는 값을 지정
	private boolean power;
	private int cha;
	private int vol;
	
	//생성자
	public Tv() {} //기본생성자 -생성자를 여러개 만드려면 기본생성자를 무조건 만들어야한다.
	public Tv(int cha) {
		this.cha = cha;
		this.vol= 5; //vol을 5로 고정
	}
	
	
	//print()
	public void print() {
		System.out.println("브랜드 : "+BRAND+" | 채널 : "+cha+" | 볼륨 : "+vol);
	}
	
	
	
	//TV의 정보를 출력하는 메서드
	// power() 
	//power가 켜지면 "TV가 켜졌습니다." 꺼지면 "TV가 꺼졌습니다.
	public void power() {
		power = !power;
		if(power == true) {
			System.out.println("TV가 켜졌습니다.");
		}else if(power == false) {
			System.out.println("TV가 꺼졌습니다.");
		}
	}
	
	//chUp()
	//1씩 증가 ch은 20까지 있음. 20이 넘어가면 다시 0번으로 순환구조
	public void chUp() {
		if(power == true) {
			cha++;
			if(cha>20) {
				cha = 0;
			}
			System.out.println("채널 : "+cha+"번");
			
		}else {
			System.out.println("TV가 꺼져있습니다.");
		}
	}
	
	//chDown()
	//1씩 감소 Up처럼 순환구조
	public void chDown() {
		if(power == true) {
			cha--;
			if(cha<0) {
				cha = 20;
			}
			System.out.println("채널 : "+cha+"번");
		}else {
			System.out.println("TV가 꺼져있습니다.");
		}
	}
	
	//volUp()
	//volUp() / volDown() : 1씩증가 / 1씩감소
	//vol은 10까지 있음. 10이 넘으면 계속 10, 0이면 음소거
	public void volUp() {
		if(power == true) {
			vol++;
			if(vol >=10) {
				vol = 10;
			}
			System.out.println("음량 : "+vol);
		}else {
			System.out.println("TV가 꺼져있습니다.");
		}
	}
	
	//volDown()
	//volUp() / volDown() : 1씩증가 / 1씩감소
    //vol은 10까지 있음. 10이 넘으면 계속 10, 0이면 음소거
	public void volDown() {
		if(power == true) {
			if(vol <= 0) {
				System.out.println("음소거");
			}else {
				vol--;
				System.out.println("음량 : "+vol);	
			}
		}else {
			System.out.println("TV가 꺼져있습니다.");
		}
	}
	// getter/setter
	
	public String getBrand() {
		return BRAND;
	}
//	public void setBrand(String brand) { //FINAL은 setter을 만들 수 없다.
//		this.BRNAD = brand;
//	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCha() {
		return cha;
	}
	public void setCha(int cha) {
		this.cha = cha;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	
	

}
