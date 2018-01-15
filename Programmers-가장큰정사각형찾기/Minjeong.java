package code_review;

public class BigSquare {
	    public int findLargestSquare(char [][]board)
	    {
	        int answer = 0;
	        int answer_board[][]=new int[board.length][board[0].length];
	        for(int i=1;i<board.length;i++){
	        	for(int j=1;j<board[0].length;j++){
	        		if(board[i-1][j-1]=='O'&&board[i-1][j]=='0'
	        				&&board[i][j-1]=='O'&&board[i][j]=='0')
	        			answer_board[i][j] = answer_board[i-1][j-1] + answer_board[i-1][j]
	        								+ answer_board[i][j-1] +answer_board[i][j]+1;
	        		if(answer_board[i][j] > answer)
	        			answer = answer_board[i][j];
	        	}
	        }
	        
	        return answer*answer;
	    }
	    public static void main(String[] args)
	    {
	        BigSquare test = new BigSquare();
					char [][]board ={
					{'X','O','O','O','X'},
					{'X','O','O','O','O'},
					{'X','X','O','O','O'},
					{'X','X','O','O','O'},
					{'X','X','X','X','X'}};

	        System.out.println(test.findLargestSquare(board));
	    }
}
