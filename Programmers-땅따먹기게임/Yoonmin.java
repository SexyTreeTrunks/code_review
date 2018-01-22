import java.util.Arrays;
import java.util.Collections;

class Hopscotch {
	int hopscotch(int[][] board, int size) {
		int result = 0;
		int sum_score;
		for (int i = 1; i < size; i++) {
			for (int j = 0; j < 4; j++) {
				sum_score = 0;
				for (int k = 0; k < 4; k++) {
					if (j != k) {
						sum_score = (sum_score > board[i - 1][k]) ? sum_score : board[i - 1][k];
					}
				}
				board[i][j] += sum_score;
			}
		}
		for (int i = 0; i < 4; i++) {
			result = (board[size - 1][i] > result) ? board[size - 1][i] : result;
		}
		return result;
	}

	public static void main(String[] args) {
		Hopscotch c = new Hopscotch();
//		 int[][] test = new int[10][4];
//		 for (int i = 0; i < 10; i++) {
//		 for (int j = 0; j < 4; j++) {
//		 test[i][j] = (int) (Math.random() * 45) + 1;
//		 }
//		 }
//		 for (int i = 0; i < test.length; i++) {
//		 for (int j = 0; j < test[i].length; j++) {
//		 System.out.print(test[i][j] + " ");
//		 }
//		 System.out.println("");
//		 }

		int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
		System.out.println(c.hopscotch(test, 10));
	}

}