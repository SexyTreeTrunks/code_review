package code_review;

import java.util.Arrays;
import java.util.Scanner;

class CodeGround1 {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			sc.nextLine();
			sc.nextLine();
			Answer = 0;
			int count = 0;
			String inputs[] = sc.nextLine().split(" ");
			Arrays.sort(inputs);
			
			String last = inputs[0];
			for(String item:inputs) {
				if(!item.equals(last)){
					if(count % 2 == 1)
						Answer = Answer ^ Integer.parseInt(last);
					count = 0;
				}
				count++;
				last = item;
			}
			if(count % 2 == 1)
				Answer = Answer ^ Integer.parseInt(last);
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
	
}