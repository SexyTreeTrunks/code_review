class Fibonacci {
    public long fibonacci(int num) {
        long answer = 1, ansMin1 = 0, temp = 0;
    if (num == 0)
      return 0;
    if (num == 1)
      return 1;
    else{
      //시간복잡도 너무 커서 실패한 코드!!!
      //return fibonacci(num-1) + fibonacci(num-2);
        for (int i=1;i<num;i++){
        temp = answer;
        answer += ansMin1;
        ansMin1 = temp;
      }
      return answer;
    }
    }

  // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        Fibonacci c = new Fibonacci();
        int testCase = 3;
        System.out.println(c.fibonacci(testCase));
    }
}
