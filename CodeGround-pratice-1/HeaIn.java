import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;

class Solution {
	static int Answer = -1;

	public static void main(String args[]) throws Exception	{
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		HashMap<Integer, Integer> inputMap = new HashMap<Integer, Integer>();
		
		for(int test_case = 0; test_case < T; test_case++) {
			int numberOfInput = sc.nextInt();
			for(int i = 0; i < numberOfInput; i++) {
				int number = sc.nextInt();
				if(!inputMap.containsKey(number))
					inputMap.put(number, 1);
				else {
					int numberOfKeyCalled = inputMap.get(number);
					inputMap.put(number, ++numberOfKeyCalled);
				}
			}
			
			Iterator iterator = inputMap.entrySet().iterator();
			while(iterator.hasNext()) {
				Entry entry = (Entry) iterator.next();
				if((int)entry.getValue() % 2 == 1) {
					if(Answer == -1)
						Answer = (int)entry.getKey();
					else
						Answer = Answer ^ (int)entry.getKey();
				}
			}

			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
			
			Answer = -1;
			inputMap.clear();
		}
	}
}