package code_review;

import java.util.Arrays;
import java.util.Scanner;

public class CodeGround3 {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			Answer = 0;
			int sub_num = sc.nextInt();
			int max = sc.nextInt();
			int subjects[] = new int[sub_num];
			for(int i = 0; i < sub_num; i++)
				subjects[i] = sc.nextInt();
			
			Arrays.sort(subjects);
			for(int i = 1; i <= max; i++) {
				Answer += subjects[sub_num - i];
				System.out.println(subjects[sub_num - i]);
			}
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}
