class Fibonacci {
	public long fibonacci(int num) {
		long answer = 0;
    long x = 1, y = 0;
    if(num == 0) answer = y;
    else if(num == 1) answer = x;
    else if(num >= 2){
    	for(int i = 2; i <= num; i++){
      	answer = x + y;
        y = x;
        x = answer;
      }
    }
  /*  if(num>=2)
    	answer = fibonacci(num-1) + fibonacci(num-2);
    else if(num == 1)
      answer = 1;
		*/
    return answer;
	}

  // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 3;
		System.out.println(c.fibonacci(testCase));
	}
}
