

import java.util.Arrays;

class SoojiNoh {
	int[][] sumMatrix(int[][] A, int[][] B) {
		int[][] answer = {{0, 0}, {0, 0}};

//     System.out.println(A);
//     for (int row=0 ; row<2 ; row++){
//       for (int col=0 ; col<2 ; col++){
//     		System.out.print(A[row][col]+" ");
//       }
//       System.out.println();
//     }
    
//     System.out.println(B);
//     for (int row=0 ; row<2 ; row++){
//       for (int col=0 ; col<2 ; col++){
//     		System.out.print(B[row][col]+" ");
//       }
//       System.out.println();
//     }
    
    for (int row=0 ; row<2 ; row++){
    	for (int column=0 ; column<2 ; column++){
      	answer[row][column] = A[row][column] + B[row][column];
        System.out.println(answer[row][column]+"="+A[row][column]+"+"+B[row][column]);
      }
    }
    
    // for (int row=0 ; row<2 ; row++){
    //   for (int col=0 ; col<2 ; col++){
    // System.out.print(answer[row][col]+" ");
    //   }
    //   System.out.println();
    // }
    
    System.out.println(Arrays.deepToString(answer));

		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		SumMatrix c = new SumMatrix();
		int[][] A = { { 1, 2 }, { 2, 3 } };
		int[][] B = { { 3, 4 }, { 5, 6 } };
		int[][] answer = c.sumMatrix(A, B);
		if (answer[0][0] == 4 && answer[0][1] == 6 && 
				answer[1][0] == 7 && answer[1][1] == 9) {
			System.out.println("맞았습니다. 제출을 눌러 보세요");
		} else {
			System.out.println("틀렸습니다. 수정하는게 좋겠어요");
		}
	}
}
