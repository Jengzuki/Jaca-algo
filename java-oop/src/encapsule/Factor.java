package encapsule;
/**
 * @file_name : Factor2.java
 * @author    : apfl1@naver.com
 * @date      : 2015. 9. 22.
 * @story     : 약수 알고리즘
 */
public class Factor {
	public int[] getFactor(int dest){
		int count = 0, arrCount = 0;
		for (int i = 1; i < dest+1; i++) {
			if (dest%i==0) {
				count++;
			}
		}
		int[] factors = new int[count];
		count=0;
		for (int i = 1; i < dest+1; i++) {
			if (dest%i==0) {
			factors[arrCount]=i;
			count++;
			}
		}
		return factors;

	}
}
