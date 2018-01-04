import java.util.Arrays;
import java.util.Scanner;

class Solution {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			Answer = 0;
			int numberOfPeople = sc.nextInt();
			
			int[] score = new int[numberOfPeople];
			for(int i = 0; i < numberOfPeople; i++)
				score[i] = sc.nextInt();
			
			Arrays.sort(score);
			
			int max = 0;
			for(int i = 0; i < numberOfPeople; i++) {
				int nextScore = score[i] + numberOfPeople - i;
				if(nextScore > max)
					max = nextScore;
			}
			
			for(int i = 0; i < numberOfPeople; i++)
				if(score[i]+numberOfPeople >= max)
					Answer++;
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}