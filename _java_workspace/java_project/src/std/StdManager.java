package std;
//3

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StdManager implements StdProgram {
	//학생 리스트 생성 후 Program 메서드 구현
	
	//private Student s = new Student();
	private ArrayList<Student> stList = new ArrayList<Student>();

	@Override
	public void printStd() { //학생정보출력 완
		for(int i =0;i<stList.size();i++) {
			int sum = 0;
			Iterator<String> it = stList.get(i).getMap().keySet().iterator();
			while(it.hasNext()) {
				String key = it.next();
				sum += stList.get(i).getMap().get(key);
			}
			stList.get(i).setSum(sum);
			stList.get(i).setAvg((double)sum/stList.get(i).getMap().size());

			
			System.out.println(stList.get(i));
		}
	}

	@Override
	public void addStd(Scanner scan) { //학생추가 완
		System.out.println("추가할 학생의 이름을 입력해주세요.");
		String a = scan.next();
		System.out.println("추가할 학생의 나이을 입력해주세요.");
		int b = scan.nextInt();
		System.out.println("추가할 학생의 전화번호를 입력하세요");
		String c = scan.next();
		Student s = new Student(a, b, c);
		stList.add(s);
		System.out.println("학생추가가 완료되었습니다.");		
	}

	@Override
	public void modStd(Scanner scan) { //학생정보수정 완
		System.out.println("수정할 학생의 이름을 입력해주세요");
		String a = scan.next();
		for(int i =0;i<stList.size();i++) {
			if(!stList.get(i).getName().equals(a)) {
				System.out.println("수정할 학생의 이름이 존재하지 않습니다.");	
			}else {
				System.out.println("수정할 학생의 이름을 변경해주세요.");
				String rename = scan.next();
				stList.get(i).setName(rename);
				
				System.out.println("수정할 학생의 나이를 변경해주세요.");
				int reage = scan.nextInt();
				stList.get(i).setAge(reage);
				
				System.out.println("수정할 학생의 전화번호를 변경해주세요.");
				String rephone = scan.next();
				stList.get(i).setPhone(rephone);
				
				System.out.println("학생정보 수정이 완료되었습니다.");
				return;
			}
			
			
		}
		
		
	}

	@Override
	public void delStd(Scanner scan) { //학생삭제 완
		System.out.println("삭제할 학생의 이름을 입력해주세요");
		String a = scan.next();
		for(int i =0; i<stList.size();i++) {
			if(!stList.get(i).getName().equals(a)) {
				System.out.println("삭제할 학생이 존재하지 않습니다.");
			}else {
				stList.remove(i);
				System.out.println("학생의 정보가 삭제되었습니다.");
				return;
			}
			
		}
		
		
		
	}

	@Override
	public void searchStd(Scanner scan) { //학생검색 완
		System.out.println("검색할 학생의 이름을 입력해주세요");
		String a = scan.next();
		for(int i =0;i<stList.size();i++) {
			if(!stList.get(i).getName().equals(a)) {
				System.out.println("검색할 학생이 존재하지 않습니다.");
			}else {
				System.out.println(stList.get(i));
				System.out.println("학생검색을 완료하였습니다.");
			}
		}
		
	}

	@Override
	public void addSub(Scanner scan) { //점수 추가 완
		System.out.println("점수를 추가할 학생의 이름을 입력해주세요");
		String a = scan.next();
		for(int i=0;i<stList.size();i++) {
			if(!stList.get(i).getName().equals(a)) {
				System.out.println("점수를 추가할 학생이 존재하지 않습니다.");
			}else {
				System.out.println("추가할 과목이름을 입력해주세요.");
				String addsub = scan.next();
				System.out.println("추가할 과목의 점수를 입력해주세요.");
				int addscore = scan.nextInt();
				stList.get(i).addMap(addsub, addscore);
				System.out.println("과목,점수가 등록되었습니다.");
				return;
			}
		}
		
	}

	@Override
	public void modSub(Scanner scan) { //점수 수정
		System.out.println("점수를 수정할 학생의 이름을 입력해주세요");
		String a = scan.next();
		for(int i =0; i<stList.size();i++) {
			if(!stList.get(i).getName().equals(a)) {
				System.out.println("점수를 수정할 학생이 존재하지 않습니다.");			
			}else {
				System.out.println("점수를 수정할 과목을 입력해주세요");
				String sub = scan.next();
				if(stList.get(i).getMap().containsKey(sub)) {
					System.out.println("수정할 점수를 입력해주세요");
					int rescore = scan.nextInt();
					stList.get(i).getMap().put(sub, rescore);	
					return;
				}
				System.out.println("수정할 과목이 존재하지 않습니다.");
			}
		}
		
		
	}

	@Override
	public void delSub(Scanner scan) { //점수 삭제
		System.out.println("점수를 삭제할 학생의 이름을 입력해주세요");
		String a = scan.next();
		for(int i =0;i<stList.size();i++) {
			if(stList.get(i).getName().equals(a)) {
				stList.get(i).delMap(scan);
				return;
			}else {
				System.out.println("점수를 삭제할 학생이 존재하지 않습니다.");
				
			}
		}
		
		
	}
	
}
