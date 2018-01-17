package programmers;

class JumpCase {

    public int jumpCase(int num) {
    	int answer = 0;
      
      for (int i=num ; i>=num/2 ; i--){
        answer+=composition(i,num-i);
      }
      
      return answer;
      
    }
  
  	public long composition(int n, int m){
			//nCm = numerator / divisor
      long numerator=1, divisor=1;
      for(int i=0, j=n; i<m ; i++, j--){
        numerator *= j;
      }

      for(int i=m ; i>0 ; i--){
       divisor *= i;
      }
      return numerator/divisor;
    }


    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 4;
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.jumpCase(testCase));
    }
}
