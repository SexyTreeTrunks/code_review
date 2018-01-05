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
		 * 해쉬맵의 출력 
		 * System.out.println(numSet);
		 * 순서 보장 안함. 순서대로 데이터를 put하고 싶다면, 
		 *  1) 현재처럼 sort후 put하거나
		 *  2) LinkedHashMap을 사용하거나 
		 *  3) TreeMap사용.
		 */

		
		Iterator<Integer> iter = numSet.keySet().iterator();
		for (; max_number > 0; max_number--) {
			for (int i : numSet.keySet()) {
				// 해쉬맵 사용 예제 코드
				// System.out.println(String.format("키: %d, 값: %s", i, numSet.get(i)));
				if (numSet.get(i) == max_number) {
					for(int j = max_number; j>0; j--) {
						System.out.format("%d ", i);
						//힉..! for문 세 개..!!! 도와줘요 코드리뷰!!						
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