import java.util.Arrays;
import java.util.Scanner;

class Solution {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			Answer = 0;
			int num = sc.nextInt();
			int subjectToStudy = sc.nextInt();
			int[] array = new int[num];
			for(int i = 0; i < num; i++)
				array[i] = sc.nextInt();
			Arrays.sort(array);
			
			for(int i = num-1; i >= num-subjectToStudy; i--) {
				System.out.println(i);
				Answer += array[i];
			}

			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}