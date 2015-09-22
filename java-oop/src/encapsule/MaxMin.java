package encapsule;

import java.util.Scanner;

/**
 * @file_name : MaxMin.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 22.
 * @story     : 최고점, 최저점 구하기
 */
public class MaxMin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] avgs = new int[5];
		int max = 0, min = 100;
		System.out.println("학생들 평균 점수를 입력하시면 최고점, 최저점이 출력됩니다.");
		System.out.println("단, 정원은 다섯명입니다.");
		System.out.println("평균 점수를 입력해주세요.");
		for (int i = 0; i < avgs.length; i++) {
			
			avgs[i] = scanner.nextInt();
			if (max < avgs[i]) {
				max = avgs[i];
			}else if (avgs[i] > min) {
				min = avgs[i];
			} 
		}
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);
	}

}
