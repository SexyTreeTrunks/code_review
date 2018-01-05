package code_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Solution {
	public static void sortFunction(int input[]) {
		HashMap<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
		for(int item:input) {
			if(hashmap.containsKey(item))
				hashmap.put(item, hashmap.get(item) + 1);
			else
				hashmap.put(item, 1);
		}
		Iterator it = sortHash(hashmap).iterator();
		while(it.hasNext()) {
			int key = (int) it.next();
			int value = hashmap.get(key);
			while(value-- > 0)
				System.out.print(key+ " ");
		}
		System.out.println();
	}
	private static List sortHash(final Map map) {
		List<String> list = new ArrayList();
        list.addAll(map.keySet());
        Collections.sort(list, new Comparator() {
            public int compare(Object o1,Object o2) {
                Object v1 = map.get(o1);
                Object v2 = map.get(o2);
                return ((Comparable) v2).compareTo(v1) * (-1);   	
            }
        });
		return list;
	}

	public static void main(String[] args) {
	    Solution s = new Solution();
	    int[] testCase = {6,6,3,7,1};
	    s.sortFunction(testCase);
	    int[] testCase2 = {7,3,4,1,1,1,6,6,5,5};
	    s.sortFunction(testCase2);
	}
}
/*
2,8,5,5,4

2,4,8,5,5

2,4,5,8
1,1,2,1

2,8,5,4,3,2,2,7,6,5,8,5,2,
3,4,7,8,8,5,5,5,2,2,2,2

1. value기준으로 정렬.
2. value equel --> key기준 정렬.
3. 정렬순으로 arr에 value값 만큼 넣음.

1. 출력할 value 저장할 변수(v)지정. 1부터 시작
2. value가 v인 key값 차례대로 pop
3. 
 */