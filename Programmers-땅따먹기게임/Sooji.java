package programmers;


class Hopscotch {
  	int[][] max;
    int hopscotch(int[][] board, int size) {
        int result = 0;
      	
        for(int i=1 ; i<board.length ; i++){
        	board[i][0] += Math.max(board[i-1][1], Math.max(board[i-1][2], board[i-1][3]));
        	board[i][1] += Math.max(board[i-1][0], Math.max(board[i-1][2], board[i-1][3]));
        	board[i][2] += Math.max(board[i-1][0], Math.max(board[i-1][1], board[i-1][3]));
        	board[i][3] += Math.max(board[i-1][0], Math.max(board[i-1][1], board[i-1][2]));
        }
        
        result = Math.max(board[size-1][0], Math.max(board[size-1][1], Math.max(board[size-1][2], board[size-1][3])));
      	
        // 함수를 완성하세요.

        return result;
    }
    public static int[] max(int n[]) {
    	int i;
        int max = n[0];

        for (i = 0; i < n.length; i++)
          if (n[i] > max) max = n[i];

        return new int[]{i, max};
      }

    public static void main(String[] args) {
        Hopscotch c = new Hopscotch();
        int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.hopscotch(test, 3));
    }

}