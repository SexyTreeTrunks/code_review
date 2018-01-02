class Fibonacci {
	public long fibonacci(int num) {
		//F(n) = F(n-1) + F(n-2)
		long answer = 0;		
		
		if (num == 1) {
			answer = 1;
		}
		
		else if (num > 1) {
			long prepreNum = answer;
			long preNum = 1;
			
			for (int i = 1; i < num; i++) {
				answer = preNum + prepreNum;
				prepreNum = preNum;
				preNum = answer;
			}
		}
		
		return answer;
	}

	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 7;
		for(int i=0; i<=testCase; i++) {
		System.out.println(c.fibonacci(i));
		}
	}
}
