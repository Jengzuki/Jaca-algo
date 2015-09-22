package encapsule;

import java.util.Scanner;

import been.Money3;

public class Test {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Money3 money = new Money3();
		System.out.println("금액을 입력하세요");
		int input = scanner.nextInt();
		String[] results = money.countMoney(input); //파라미터 = 매개변수
		for (int i = 0; i < results.length; i++) {
			 System.out.println(results[i]);
		}
	}
}
