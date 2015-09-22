package been;

import java.util.Scanner;

/**
 * @file_name : Money.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 21.
 * @story     : 금액을 입력하면 화폐단위별로 분류시키는 문제
 */
public class Money3 {

	public String[] countMoney(int money) {
		int[] moneyUnit = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		int[] moneys = new int[moneyUnit.length];
		String[] results = new String[moneyUnit.length];
		for (int i = 0; i < moneyUnit.length; i++) {
			moneys[i] = money / moneyUnit[i]; 
			money = money % moneyUnit[i]; 
			results[i]=moneyUnit[i]+"원: "+moneys[i];
		}		
		return results;
		
	}
}

