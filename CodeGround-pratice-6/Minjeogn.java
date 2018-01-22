package code_review;

import java.util.Arrays;
import java.util.Scanner;

public class CodeGround6 {
	static int Answer;
	static int maze[][];
	static int cur_row, cur_col;
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			Answer = 1;
			int N = sc.nextInt();
			int step_n = sc.nextInt();
			//sc.nextLine();
			String steps = sc.next();
			cur_row = cur_col = 0;
			maze = new int[N][N];
			initialMaze(N);

			for(int i = 0; i < step_n; i++) {
				char step = steps.charAt(i);
				Answer += visit(step);
			}
			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
	}
	private static int visit(char step) {
		switch(step) {
		case 'U':
			cur_row = (cur_row - 1 < 0)? cur_row:cur_row-1;
			break;
		case 'D':
			cur_row = (cur_row + 1 == maze.length)? cur_row:cur_row+1;
			break;
		case 'L':
			cur_col = (cur_col - 1 < 0)? cur_col:cur_col-1;
			break;
		case 'R':
			cur_col = (cur_col + 1 == maze.length)? cur_col:cur_col+1;
		}
		return maze[cur_row][cur_col];
	}
	private static void initialMaze(int n) {
		int count = 1;
		for(int i = 0; i < n; i++) {
			int j = 0, k = i;
			while(k >= 0) {
				if(i % 2 == 0)
					maze[k][j] = count++;
				else
					maze[j][k] = count++;
				j++; k--;					
			}
		}
		count = n*n;
		for(int i = n-1; i > 0; i--) {
			int j = n - 1, k = i;
			while(k < n) {
				if((n-1-i) % 2 == 0)
					maze[k][j] = count--;
				else
					maze[j][k] = count--;				
				j--; k++;
			}
		}		
	}
	/*
	 * 0,0
	 * 
	 * 0,1 
	 * 1,0
	 * 
	 * 2,0 
	 * 1,1 
	 * 0,2
	 * 
	 * 0,3
	 * 1,2 
	 * 2,1 
	 * 3,0 
	 */
	/*
	 * 5,5
	 * 
	 * 5,4
	 * 4,5
	 * 
	 * 3,5
	 * 4,4
	 * 5,3
	 * 
	 * 5,2
	 * 4,3
	 * 3,4
	 * 2,5
	 * 
	 * 1,5
	 * 2,4
	 * 3,3
	 * 4,2
	 * 5,1
	 */

}
