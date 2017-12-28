package code_review;

import java.util.Arrays;

class SumMatrix {
	int[][] sumMatrix(int[][] A, int[][] B) {
		int row_len = A.length;
		int col_len = A[0].length;
		int[][] answer = new int[row_len][col_len];
		for (int i = 0; i < row_len; i++) 
			for (int j = 0; j < col_len; j++) 
				answer[i][j] = A[i][j] + B[i][j];
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		SumMatrix c = new SumMatrix();
		int[][] A = { { 1, 1, 1 }, { 2, 2, 2 } };
		int[][] B = { { 1, 1, 1 }, { 2, 2, 2 } };
		int[][] answer = c.sumMatrix(A, B);
		System.out.println(Arrays.toString(answer[0]));
		System.out.println(Arrays.toString(answer[1]));
	}
	
}