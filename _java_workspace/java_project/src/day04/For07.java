package day04;

public class For07 {

	public static void main(String[] args) {
		// 이중 For문
		/* for(int i =1; i <= 5; i++) {		i = 1	2	3	4	5
		 * 		for(int j = 1; j<=5; j++){	j = 1~5 1~5 1~5 1~5 1~5
		 * 			실행문; 5 5 5 5 5 => 25번 실행
		 * 		}
		 * }
		 */ 
		
		/* 별찍기 
		 * *****	i=1 j=5
		 * *****	i=2 j=5
		 * *****	i=3 j=5
		 * *****	i=4 j=5
		 * *****	i=5 j=5
		 * 
		 */
		for(int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println(); //한 줄 끝나면 줄바꿈
		}
		System.out.println("-------------");
		
		/* *		i=1, j=1
		 * **		i=2, j=2
		 * ***		i=3, j=3
		 * ****		i=4, j=4
		 * *****	i=5, j=5
		 * 
		 */
		for(int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("------------");
		
		/* *****	i=1 j=5 (1~5)
		 * ****		i=2 j=4 (1~4)
		 * ***		i=3 j=3 (1~3)
		 * **		i=4 j=2 (1~2)
		 * *		i=5 j=1 (1~1)
		 * 
		 */
		for(int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------");
		
		/*     * i=1, 공백=4, k=1
		 *    ** i=2, 공백=3, k=2
		 *   *** i=3, 공백=2, k=3
		 *  **** i=4, 공백=1, k=4
		 * ***** i=5, 공백=0, k=5       
		 */
		     
				 
		for(int i = 1; i <= 5; i++) {
			//공백
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			//별
			for(int k = 1; k <= i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------");
		
		/*     *	 i=1, 공백=4, k=1~1
		 *    ***	 i=2, 공백=3, k=1~3
		 *   *****   i=3, 공백=2, k=1~5
		 *  *******  i=4, 공백=1, k=1~7
		 * ********* i=5, 공백=0, k=1~9
		 */
		for(int i = 1; i <= 5; i++) {
			//공백
			for (int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
			}
			//별
			for(int k = 1; k <= i*2-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("-------");
		
		/* 1 2 3
		 * 4 5 6
		 * 7 8 9
		 * 3줄씩 3개 출력
		 */
		int cnt =0;
		for(int i=1; i<=3;i++) {
			for(int j =1; j<=3; j++) {
				cnt++;
				System.out.print(cnt+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
