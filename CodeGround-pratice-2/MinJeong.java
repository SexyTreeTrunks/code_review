package code_review;

import java.util.Arrays;
import java.util.Scanner;

public class CodeGround2 {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			Answer = 0;
			int num = sc.nextInt();
			int scores[] = new int[num];
			int max = 0;
			for(int i = 0; i < num; i++)
				scores[i] = sc.nextInt();
			Arrays.sort(scores);
			
			for(int i = 0; i < num; i++) {
				int final_score = scores[i] + (num - i);
				if(final_score > max)
					max = final_score;
			}
			for(int i = 0; i < num; i++) {
				if(max <= scores[i] + num)
					Answer++;
			}

			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}
