
import java.util.Arrays;
import java.util.Scanner;

class Solution {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			 Answer = 0;

			int course_num = sc.nextInt();
			int study_num = sc.nextInt();
			int score[] = new int[course_num];
			for(int i =0; i < course_num; i++) {
				score[i] = sc.nextInt();
				//System.out.println(score[i]);
			}
			Arrays.sort(score);
			for(int i=score.length-1; i >= (course_num - study_num); i--) {
				Answer += score[i];
			}			

			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}