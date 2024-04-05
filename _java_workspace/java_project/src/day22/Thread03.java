package day22;

class JoinTest extends Thread{
	int start;
	int end;
	int total;
	
//	public JoinTest() {}
	
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for(int i = start; i<=end;i++) {
			this.total += i;
		}
	}
	
}

public class Thread03 {

	public static void main(String[] args) {
		// 1~50, 51~100까지의 합을 구하는 두개의 Thread를 생성
		// 그 결과를 확인
		
		//두개의 Thread가 실행되고 난 후
		//thread1 1~50까지의 합계 출력
		//thread2 51~100까지의 합계 출력
		//thread1+thread2의 합계 출력
		JoinTest th1 = new JoinTest(1,50);
		JoinTest th2 = new JoinTest(51,100);
		th1.start();
		th2.start();
		
		try {
			// 0.5초 기다렸다가 실행. 1초 = 1000
			th1.join();
			Thread.sleep(500);
			th2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("th1 total => "+ th1.total);
		System.out.println("th2 total => "+ th2.total);
		
		int lastTotal = th1.total+th2.total;
		System.out.println();
		System.out.println("th1+th2 => "+lastTotal);
			

	}

}
