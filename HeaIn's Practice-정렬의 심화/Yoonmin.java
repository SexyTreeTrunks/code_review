import java.util.HashMap;
import java.util.Iterator;

class Solution {
	public void sortFunction(int[] A) {
		int max_number = 0;
		HashMap<Integer, Integer> numSet = new HashMap<Integer, Integer>();
		for (int i = 0; i < A.length; i++) {
			if (!numSet.containsKey(A[i])) {
				numSet.put(A[i], 1);
			} else {
				int val = numSet.get(A[i]);
				numSet.replace(A[i], ++val);
				if (max_number < val) {
					max_number = val;
				}
			}
		}
		
		/*
		 * �ؽ����� ��� 
		 * System.out.println(numSet);
		 * ���� ���� ����. ������� �����͸� put�ϰ� �ʹٸ�, 
		 *  1) ����ó�� sort�� put�ϰų�
		 *  2) LinkedHashMap�� ����ϰų� 
		 *  3) TreeMap���.
		 */

		
		Iterator<Integer> iter = numSet.keySet().iterator();
		for (; max_number > 0; max_number--) {
			for (int i : numSet.keySet()) {
				// �ؽ��� ��� ���� �ڵ�
				// System.out.println(String.format("Ű: %d, ��: %s", i, numSet.get(i)));
				if (numSet.get(i) == max_number) {
					for(int j = max_number; j>0; j--) {
						System.out.format("%d ", i);
						//��..! for�� �� ��..!!! ������� �ڵ帮��!!						
					}
				}
			}
		}
		
		System.out.println();
		/*LinkedList numList = new LinkedList();
		int max_frequency = 0;
		Iterator<Integer> iter = numSet.keySet().iterator();
		for(int i: numSet.keySet()) {
			if(numSet.get(i) > max_frequency) {
				max_frequency = i;
			}
			else if(numSet.get(i) <= max_frequency) {
				
			}
		}*/
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] testCase = { 6, 6, 3, 7, 1 };
		s.sortFunction(testCase);
		int[] testCase2 = { 7, 3, 4, 1, 1, 1, 6, 6, 5, 5 };
		s.sortFunction(testCase2);
	}
}