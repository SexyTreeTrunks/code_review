package codeground;

import java.util.*;
/*
You should use the statndard input/output

in order to receive a score properly.

Do not use file input and output

Please be very careful. 
*/
/*
   As the name of the class should be Solution , using Solution.java as the filename is recommended.
   In any case, you can execute your program by running 'java Solution' command.
 */
class GoodNumber {
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

			// Answer = 0;
			/////////////////////////////////////////////////////////////////////////////////////////////
			int size = sc.nextInt();
			
			int[] input = new int[size];
			for(int i=0 ; i<size ; i++){
				input[i] = sc.nextInt();
			}
			
			boolean[] composedNum = new boolean[40001]; //composedNum는 배열 내 존재하는 앞에 존재하는 두 수의 합으로 이루어진 숫자들의 존재여부 flag
//			Arrays.sort(input);
			
		System.out.println(Arrays.toString(input));
//			System.out.println("array["+i+"]:"+input[i]);		
		
			for(int num=0 ; num<input.length-1; num++){
				boolean found=false;
				for(int elem=0 ; elem<num&&!found; elem++){
					if(composedNum[input[num]-input[elem]+20000]==true) //만약 좋은숫자후보(num)가 그 이전 숫자(elem)와의 차가 배열 composedNum 존재(True)한다면 좋은 숫자가 맞다.
						found=true;
				}
				for(int elem=0 ; elem<=num ; elem++)
					composedNum[input[num]+input[elem]+20000]=true; //주어진 index의 새로운 좋은숫후보로 composedNum를 업데이트 한다.
				if(found==true) {
					Answer++;
				}
			}
			/////////////////////////////////////////////////////////////////////////////////////////////


			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
}
