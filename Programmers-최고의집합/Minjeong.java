package code_review;

public class BestSet {

   	public int[] bestSet(int n, int s) {
		int[] answer = null;
		int q = s / n;
		if (q == 0 || n == 0) {
			answer = new int[1];
			answer[0] = -1;
			return answer;
		}
		answer = new int [n];
		int i;
		for (i = 0; s > q; i++) {
			answer[i] = q;
			s -= q;
		}
		while (s > 0) {
			answer[--i] += 1;
			s--;
		}
		return answer;
	}
}
