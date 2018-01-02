import java.util.Scanner;

class Solution {
	static int Answer;
	
	public static void main(String args[]) throws Exception	{
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();		
		for(int test_case = 0; test_case < T; test_case++) {
			
			Answer = 0;
			int number = sc.nextInt();
			for(int n = 0; n < number; n++) {
				int input_number = sc.nextInt();
				Answer ^= input_number;
			}

			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}