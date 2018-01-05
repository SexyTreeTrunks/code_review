import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Solution {

    public void sortFunction(int[] A) {
        Arrays.sort(A);
		List<Number> result = new ArrayList<Number>();
		int frequency = 1;
		
		for (int i = 0; i < A.length; i++) {
			if (i != A.length - 1) {
				if (A[i + 1] == A[i])
					frequency++;
				else {
					Number temp = new Number();
					temp.val = A[i];
					temp.frequency = frequency;
					result.add(temp);
					frequency = 1;
				}
			} else {
				Number temp = new Number();
				temp.val = A[i];
				temp.frequency = frequency;
				result.add(temp);
			}
		}

		Collections.sort(result, new Ascending());
		
		for(int i = 0; i < result.size(); i++) {
			for(int j = 0; j < result.get(i).frequency; j++)
				System.out.print(result.get(i).val + " ");
		}
		System.out.println();
    }

    public class Number {
		int val;
		int frequency;
	};

    public class Ascending implements Comparator<Number> {
		@Override
		public int compare(Number arg0, Number arg1) {
			return arg0.frequency < arg1.frequency ? -1 : arg0.frequency > arg1.frequency ? 1 : 0;
		}
	}

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] testCase = {6,6,3,7,1};
        s.sortFunction(testCase);
        int[] testCase2 = {7,3,4,1,1,1,6,6,5,5};
        s.sortFunction(testCase2);
    }
}