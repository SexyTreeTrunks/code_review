import java.util.Arrays;

class Hopscotch {
    int hopscotch(int[][] board, int size) {
      for(int i=1;i<size;i++) {
            board[i][0] += board[i-1][1] > board[i-1][2] ? (board[i-1][1] > board[i-1][3] ? board[i-1][1] : board[i-1][3]) : board[i-1][2] > board[i-1][3] ? board[i-1][2] : board[i-1][3];
            board[i][1] += board[i-1][0] > board[i-1][2] ? (board[i-1][0] > board[i-1][3] ? board[i-1][0] : board[i-1][3]) : board[i-1][2] > board[i-1][3] ? board[i-1][2] : board[i-1][3];
            board[i][2] += board[i-1][0] > board[i-1][1] ? (board[i-1][0] > board[i-1][3] ? board[i-1][0] : board[i-1][3]) : board[i-1][1] > board[i-1][3] ? board[i-1][1] : board[i-1][3];
            board[i][3] += board[i-1][0] > board[i-1][1] ? (board[i-1][0] > board[i-1][2] ? board[i-1][0] : board[i-1][2]) : board[i-1][1] > board[i-1][2] ? board[i-1][1] : board[i-1][2];
        }
        Arrays.sort(board[size-1]);
        return board[size-1][3];
    }

    public static void main(String[] args) {
        Hopscotch c = new Hopscotch();
        int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 8 }, { 4, 3, 2, 1 } };
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("답:"+c.hopscotch(test, 3));
      
      //[[8, 3, 7, 6], [3, 7, 5, 9], [2, 8, 10, 10], [5, 3, 10, 4], [1, 3, 7, 10], [1, 7, 4, 4], [4, 6, 9, 7], [1, 9, 10, 5], [1, 5, 8, 2], [4, 6, 1, 7]] expected:<85> but was:82    
    int[][] test2 = {{8, 3, 7, 6}, {3, 7, 5, 9}, {2, 8, 10, 10}, {5, 3, 10, 4}, {1, 3, 7, 10}, {1, 7, 4, 4}, {4, 6, 9, 7}, {1, 9, 10, 5}, {1, 5, 8, 2}, {4, 6, 1, 7}};

  System.out.println("답:"+c.hopscotch(test2, 10));
    }
}