import java.util.Arrays;
import java.util.Scanner;

class Solution {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {

			Answer = 0;

			int people_number = sc.nextInt();
			int[] people = new int[people_number];
			
			for(int i = 0; i < people_number; i++) {
				people[i]= sc.nextInt();
			}
			
			Arrays.sort(people);
			
			int max_number = 0;
			int current_number = 0;
			for(int i = 0; i < people.length; i++) {
				current_number = people[i] + people_number - i;
				if(max_number < current_number) {
					max_number = current_number;
				}
			}
			
			for(int i = 0; i < people.length; i++) {
				int predict_num = people[i] + people_number;
				if(predict_num >= max_number) {
					Answer++;
				}
			}
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}