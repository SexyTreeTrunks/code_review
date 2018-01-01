class Fibonacci {

	public long fibonacci(int num) {
		if(num == 0)
      return 0;
    if(num == 1)
      return 1;
    
    long firstNum = 0;
  	long secondNum = 1;
    long answer = 0;
  
    for(int i = 2; i <= num; i++) {
      answer = firstNum + secondNum;
      firstNum = secondNum;
      secondNum = answer;
    }
    
		return answer;
	}

  // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 3;
		System.out.println(c.fibonacci(testCase));
	}
}