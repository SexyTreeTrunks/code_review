package code_review;

import java.util.ArrayList;
import java.util.Arrays;

class LineCombination {
	long fac[] = new long[1000000];
	ArrayList<Integer> nums = new ArrayList();
	LineCombination() {
		fac[1] = 1;
	}

	public int[] setAlign(int n, long k) {
		int[] answer = new int[n];
		int len = n, i;
		for(i=0; i<len;i++)
			nums.add(i+1);
		for(i =0; i < len-1; i++) {
			int idx = Math.round((k-1) / getFact(n -1));
			answer[i] = nums.remove((int)idx);
			k = k - idx* fac[n-1];
			n--;
		}
		answer[i] = nums.remove(0);
		return answer;
	}
	
	public long getFact(int n) {
		if(fac[n]!=0)
			return fac[n];
		else { 
			fac[n] = n * getFact(n-1);
			return fac[n];
		}
	}
	
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		LineCombination lc = new LineCombination();
		System.out.println(Arrays.toString(lc.setAlign(3, 5)));
		System.out.println(Arrays.toString(lc.setAlign(4, 16)));
		System.out.println(Arrays.toString(lc.setAlign(2, 2)));
		System.out.println(Arrays.toString(lc.setAlign(1, 1)));
	}
}
