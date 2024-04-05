package day21;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class File05 {

	public static void main(String[] args) throws IOException {
		// test.txt파일을 읽어들여 map에 저장하여 
		// 명단, 합게, 평균을 출력
		// txt에서 읽어들이는 값은 모두 String
		// 계산을 위해서는 int 자료형으로 변환이 필요
		// Integer.parseInt(); String -> int로 변환
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		BufferedReader br =
				new BufferedReader(new FileReader("test.txt"));
		while(true) {
			String line = br.readLine();
			if(line == null) {
				break;
			}
			String name = line.substring(0, line.indexOf(" "));
			String score = line.substring(line.indexOf(" ")+1);
			
			int score1 = Integer.parseInt(score);
			map.put(name, score1);
		}
		System.out.println("---명단---");
		for (String tmp : map.keySet()) {
			System.out.println(tmp+" : "+map.get(tmp)+"점");
		}
		
		System.out.println("---합계---");
		int sum = 0;
		for(String tmp : map.keySet()) {
			sum += map.get(tmp);
		}
		System.out.println(sum+"점");
		
		System.out.println("---평균---");
		double avg = 0;
		avg = (double)sum/map.size();
		System.out.println(avg+"점");
		
		//br 끊기
		if(br != null) {//객체가 생성되었다면 끊기
			br.close();
		}
			

	}

}
