package encapsule;
/**
 * @file_name : Factor2.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 22.
 * @story     : 약수 알고리즘
 */
public class Factor2 {
	public int[] getFactor(int dest){
		int count = 0, arrCount = 0;
		for (int i = 1; i < dest+1; i++) {
			if (dest%i==0) {
				count++;
			}
		}
		int[] factors = new int[count];
		for (int i = 1; i < dest+1; i++) {
			if (dest%i==0) {
			factors[arrCount]=i;
			arrCount++;
			}
		}
		return factors;
/**
 * 19 : 만약 dest가 6이면 count 는 4일 것이고, 
 * 20 : count가 가진 4라는 값은 19번 라인에서 임무를 수행하고 사라져야함.
 * 		그런데 20번 라인에서 int 변수가 필요해져서 재사용함.
 * 23 : 최초 카운트는 0부터 시작하여 
 * 32 : 약수의 갯수만큼만 생성될 것임.
 */
	}
}
