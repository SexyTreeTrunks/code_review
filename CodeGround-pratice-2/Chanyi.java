/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
*/
import java.util.Arrays;
import java.util.Scanner;

/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class Solution {
	static int Answer;

	public static void main(String args[]) throws Exception	{
		/*
		   The method below means that the program will read from input.txt, instead of standard(keyboard) input.
		   To test your program, you may save input data in input.txt file,
		   and call below method to read from the file when using nextInt() method.
		   You may remove the comment symbols(//) in the below statement and use it.
		   But before submission, you must remove the freopen function or rewrite comment symbols(//).
		 */		

		/*
		   Make new scanner from standard input System.in, and read data.
		 */
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {

			Answer = 1;
			
		    /////////////////////////////////////////////////////////////////////////////////////////////
		    int member = sc.nextInt();
		    int[] score = new int[member];
		    int max = 0;
		    for(int i = 0; i < member ; i++){
		        score[i] = sc.nextInt();
		    }
		    Arrays.sort(score);
		    for(int i = 0; i < member; i++){
		        if(score[i]+member-i > max) max = score[i]+member-i;
		        //이걸 하는 이유는 예를 들어 수가 5 7 8이라 했을 때, 5가 3을 받고 8이 1을 받더라도 7이 2를 가저가게 된다면 5는 우숭할 수 없다.
		    }
		    for(int i = 0; i < member-1; i++){
		        if(score[i]+member >= max)
		            Answer++;
		    }
			/////////////////////////////////////////////////////////////////////////////////////////////


			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}