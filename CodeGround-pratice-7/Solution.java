package code_review;

import java.util.LinkedList;
import java.util.Scanner;

class Solution {
	static int Answer;

	public static void main(String args[]) throws Exception	{

		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			Answer = 0;
			int len = sc.nextInt();
			
			LinkedList<Integer> list = new LinkedList<Integer>();	
			for(int i =0; i < len; i++) 
				list.add(sc.nextInt());
					
			//3 3 3 1 3 3 3
			//2 1 4 6 2 2
			
			while(len > 2) {
				for(int i = 1; i < len-1; i++) {
					int join= Math.min(list.get(i-1), list.get(i+1));
					int me = list.get(i);
					list.pop();
					if(join < me)
						list.add(join);
					else
						list.add(me - 1);
				}
				list.pop(); list.pop();
				len = list.size();
				
				Answer++;
			}
			Answer++;
			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}