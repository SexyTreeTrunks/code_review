package programmers;

class Fibonacci {
	public long fibonacci(int num) {
		long answer = 0;
		long pprev, prev;
	    if (num == 0) return 0;
	    else if(num == 1) return 1;
	    else{
	      pprev=0;
	      prev=1;
	      answer =1;
	      for (int i = 2 ; i < num ; i++) {
	      	pprev = prev;
	      	prev = answer;
	      	answer=pprev+prev;
	      }  
	    }
	    
	    return answer;
    
// //Recursive Version//
//		if (num == 0)
//			return 0;
//		else if (num == 1)
//			return 1;
//		else 
//			return fibonacci(num-1) + fibonacci(num-2);
////////////////////////

	}

  // 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		int testCase = 6;
		System.out.println(c.fibonacci(testCase));
	}
}
