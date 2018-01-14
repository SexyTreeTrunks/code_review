class TryHelloWorld
{
    public int findLargestSquare(char [][]board)
    {
        int answer = 0;
        int[][] temp = new int[board.length][board[0].length];
        
        for(int i = 0; i < board.length; i++) {
        	for(int j = 0; j < board[0].length; j++) {
        		if(board[i][j] == 'X')
        			temp[i][j] = 0;
        		else
        			temp[i][j] = 1;
        	}
        }
        int max = 0;
		for (int i = 1; i < temp.length; i++) {
			for (int j = 1; j < temp[0].length; j++) {
				if (temp[i][j] == 1) {
					temp[i][j] = getMin(temp[i][j - 1], temp[i - 1][j], temp[i - 1][j - 1]) + 1;
					max = max > temp[i][j] ? max : temp[i][j];
				}
			}
		}    
        answer = max * max;
        return answer;
    }
    
    public int getMin(int a, int b, int c) {
    	a = a < b ? a : b;
    	return a < c ? a : c;
    }
    
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
		char [][]board ={
				{'X','O','O','O','X'},
				{'X','O','O','O','O'},
				{'X','X','O','O','O'},
				{'X','X','O','O','O'},
				{'X','X','X','X','X'}};

		System.out.println(test.findLargestSquare(board));
	}
}