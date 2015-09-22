package encapsule;

import java.util.Scanner;

import been.Money3;

public class MoneySub {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] avgs = new int[5];
		System.out.println("학생들 평균 점수를 입력하시면 최고점, 최저점이 출력됩니다.");
		System.out.println("단, 정원은 다섯명입니다.");
		System.out.println("평균 점수를 입력해주세요.");
		for (int i = 0; i < avgs.length; i++) {
			avgs[i] = scanner.nextInt();
		
		}
		MaxMin2 maxmin2 = new MaxMin2();
		System.out.println(maxmin2.getMaxMin(avgs));
	}

}

