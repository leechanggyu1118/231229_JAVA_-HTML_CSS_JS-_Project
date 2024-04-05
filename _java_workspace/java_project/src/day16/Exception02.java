package day16;

public class Exception02 {

	public static void main(String[] args) {
		// ArithmeticException : 0으로 나누었을 때 발생하는 Exception
		// 하단에서 만든 메서드 실행.
		//예외처리
		try { //예외가 발생할 수 있는 구문 작성
			cal(3, 0, '+');
			cal(3, 0, '-');
			cal(3, 0, '/');
			cal(3, 0, '@');
			cal(3, 0, '*');
			
			
		}catch (Exception e) { //예외처리작성
//			System.out.println("0으로 나누면 안됩니다.");	
			System.out.println(e.getMessage()); //메세지 String을 출력
			e.printStackTrace();
		}
		cal(3, 0, '+');
		cal(3, 0, '*');
		cal(3, 1, '%');
		
		
	}
	//예외 발생시키기 : throw new 발생 시킬 수 있음.
	//throw : 예외 떠넘기기
	//예외를 발생시키게 되면 메서드 선언부 끝 부분에 throw를 적고, 발생할 수 있는
	//예외를 반드시 적어저야 함.
	//throws는 RuntimeException만 예외적으로 생략가능.
	
	//기능 : 두 수를 입력받고, 연산자를 입력받아 4칙연산의 결과를 리턴하는 메서드
	// 매개변수 : int num1, int num2, char op
	
	public static void cal(int num1, int num2, char op) throws RuntimeException{ //예외 생략 가능
		double a = 0;
		//연산자가 / % 인경우 num2가 0이면 예외 발생시키기
		if(op == '/' || op == '%') {
			//예외 미리 발생시키기.
			if(num2 == 0)  {
				throw new RuntimeException("num2"+"는 0이되면 안됩니다.");				
			}
			
		}
		
		switch (op) {
		case '+' : a = num1+num2; System.out.println(num1+" + "+num2+" = "+a); break;
		case '-' : a = num1-num2; System.out.println(num1+" - "+num2+" = "+a); break;
		case '*' : a = num1*num2; System.out.println(num1+" * "+num2+" = "+a); break;
		case '/' : a = num1/num2; System.out.println(num1+" / "+num2+" = "+a); break;
		case '%' : a = num1%num2; System.out.println(num1+" % "+num2+" = "+a); break;
		default: 
			throw new RuntimeException(op+"는 산술연산자가 아닙니다.");
		}
		
	}
	
}
