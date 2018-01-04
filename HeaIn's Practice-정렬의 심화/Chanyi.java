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
		// ���⿡ �ڵ带 ���ÿ�.
		// ��� ���´� System.out.println()�� ����Ͻÿ�.
		// "1 3 7 6 6" �̷� ���·� ���� ���̿��� ��ĭ�� �־� ����Ͻÿ�.
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
		// (1,1)(3,1)(6,2)(7,1) ���·� ����
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
		// Collections.reverse(list); // �ּ��� �������� ��� -> 66731�� ���
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