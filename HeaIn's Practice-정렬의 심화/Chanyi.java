import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class Solution {
	public void sortFunction(int[] A) {
		// 여기에 코드를 쓰시오.
		// 출력 형태는 System.out.println()을 사용하시오.
		// "1 3 7 6 6" 이런 형태로 숫자 사이에는 빈칸을 넣어 출력하시오.
		//Arrays.sort(A);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < A.length; i++) {
			if (!map.containsKey(A[i])) {
				map.put(A[i], 1);
			} else {
				int count = map.get(A[i]);
				map.put(A[i], count + 1);
			}
		}
		// (1,1)(3,1)(6,2)(7,1) 형태로 저장
		Iterator it = sortByValue(map).iterator();
		while (it.hasNext()) {
			int key = (int)it.next();
			int value = map.get(key);
			for(int i = 0; i<value;i++)
				System.out.print(key);
		}

	}

	public static List sortByValue(final Map map) {
		List<String> list = new ArrayList();
		list.addAll(map.keySet());

		Collections.sort(list, new Comparator() {
			public int compare(Object o1, Object o2) {
				Object v1 = map.get(o1);
				Object v2 = map.get(o2);

				return ((Comparable) v1).compareTo(v2);
			}
		});
		// Collections.reverse(list); // 주석시 오름차순 결과 -> 66731로 출력
	        return list;

	}

	public static void main(String[] args) {
		Solution s = new Solution();
		int[] testCase = { 6, 6, 3, 7, 1 };
		s.sortFunction(testCase);
		System.out.println();
		int[] testCase2 = { 7, 3, 4, 1, 1, 1, 6, 6, 5, 5 };
		s.sortFunction(testCase2);
	}
}