package encapsule;

import java.util.Scanner;

/**
 * @file_name : Factor.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 22.
 * @story     : 약수 알고리즘
 */
public class Factor3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Factor2 factor2 = new Factor2();
		System.out.println("약수 입력");
		int dest = scanner.nextInt();
		int[] temp = factor2.getFactor(dest);
		for (int i = 0; i < temp.length; i++) {
			System.out.println(temp[i]+"\n");
		}
	}
}

