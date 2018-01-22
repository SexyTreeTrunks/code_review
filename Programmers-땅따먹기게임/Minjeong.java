package code_review;

public class Hopscotch {
	int hopscotch(int[][] board, int size) {
        int result = 0;
        int max;
        int post_step = -1;
        int max_step = 0;
        for(int i = 0; i < board.length; i++) {
        	max = 0;
        	for(int j = 0; j < board[0].length; j++) {
        		if(j == post_step)
        			continue;
        		if(board[i][j] > max) {
        			max = board[i][j];
        			max_step = j;
        		}
        	}
        	post_step = max_step;
        	result += max;
        }
        return result;
    }
	/*
	 * 3 5 2 1
	 * 5 8 7 6
	 * 4 3 1 2
	 * 
	 * 
	 */
}
