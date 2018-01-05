package Etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Solution{
	HashMap<Integer, Integer> numbersMap = new HashMap<Integer, Integer>();
	
	public void sortFunction(int[] A){
		System.out.println(Arrays.toString(A));
		
		for (int a : A){
			if(numbersMap.containsKey(a)) numbersMap.put(a, numbersMap.get(a)+1);
			else numbersMap.put(a, 1);
		}
		
		numbersMap = numbersMap.entrySet().stream()
				.sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
				(oldValue, newValue) -> oldValue, LinkedHashMap::new));		
		

		Iterator<Integer> keys = numbersMap.keySet().iterator();
        while( keys.hasNext() ){
            Integer key = keys.next();
            for (int i=0 ; i<numbersMap.get(key) ; i++)
            	System.out.print(key+" ");
        }
        System.out.println();
	}

}

public class SortCount {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("input");
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numbers = new ArrayList();
		
//		int[] array = Arrays.stream(scan.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();;
//
//		Solution sol = new Solution();
//		sol.sortFunction(array);
		
		
	    Solution s1 = new Solution();
	    int[] testCase = {6,6,3,7,1};
	    s1.sortFunction(testCase);
	    Solution s2 = new Solution();
	    int[] testCase2 = {7,3,4,1,1,1,6,6,5,5};
	    s2.sortFunction(testCase2);
	}

}
