package code_review;

import java.util.Arrays;

public class NoOvertime {
	public int noOvertime(int no, int[] works) {
		int result = 0;
		int last_idx = works.length - 1;
		while(no > 0) {
			Arrays.sort(works);
			works[last_idx]--;
			no--;
		}
		for(int i = 0; i < works.length; i++)
			result += works[i] * works[i];
		
		return result;
	}
}
