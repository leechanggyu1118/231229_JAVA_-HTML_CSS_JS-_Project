package day06;

public class String01 {

	public static void main(String[] args) {
		/* String 클래스 = 문자열을 다루기 위한 클래스 => 참조변수
		 * String str = new String();
		 * String str = "홍길동"; // 일반 자료형처럼 이용가능.
		 * 
		 */
		String str = "홍길동!!!!!!!!";
		System.out.println(str);
		String str1 = new String();
		System.out.println(str1);
		
		//length : 전체 글자의 길이 (총 글자수)
		System.out.println("---length---");
		System.out.println(str.length());
		
		//charAt(index) : index번지에 있는 문자열을 반환
		System.out.println("---charAt(intdex)---");
		System.out.println(str.charAt(0));
		
		//subString : 문자열을 추출
		System.out.println("---subString---");
		System.out.println(str.substring(0,2)); // 0번지부터 2번지까지 추출(2번지는 포함x)
		System.out.println(str.substring(1)); // 1번지부터 끝까지
		
		//str.compareTo(str1) : str과 str1을 비교하여 사전순으로 앞이면 -1, 같으면 0 ,뒤면 1
		System.out.println("---compareTo---");
		System.out.println("banana".compareTo("apple"));
		System.out.println("a".compareTo("g"));
		
		//concat : 이어붙이기(+연산자와 같은 의미)
		System.out.println("---concat---");
		System.out.println("Hello".concat("java"));
		System.out.println("Hello"+"java");
		
		//equals : 두문자열이 같은지 비교 (대소문자 구분) 같으면 true, 다르면 false
		//문자는 ==로 비교가 안됨.
		//참조변수는 ==로 비교하게 되면 주소가 같은지 확인
		System.out.println("---equlas---");
		System.out.println("abc".equals("def"));
		System.out.println("abc".equals("abc"));
		
		//indexOf : 문자의 위치(index)를 찾아주는 기능, 찾는 문자가 없으면 -1을 리턴
		//lastIndexOF : 문자의 위치를 뒤에서부터 찾아주는 기능
		System.out.println("---indexof---");
		System.out.println(str.indexOf("동")); //홍길동!!!!!!!!
		System.out.println(str.indexOf("!")); //홍길동!!!!!!!!
		System.out.println(str.lastIndexOf("!")); //홍길동!!!!!!!!
		System.out.println(str.indexOf("$")); //홍길동!!!!!!!!
		
		//이메일에서 id를 추출
		String email = "leechanggyu1118@naver.com";
		System.out.println(email.substring(0,email.indexOf("@")));
		
		//contains : 해당 문자를 포함하는지 체크
		String file = "이것이자바다.java";
		System.out.println(file.contains("java")); //true / false
		
	}

}
