import java.util.Arrays;

class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
      int[] answer = new int[2];
			int number1, number2;
      int remain = 1;

      if(a>b){
        number1 = a;
      	number2 = b;
      }
      else{
        number1 = b;
        number2 = a;
      }
      while(remain>0){ // 유클리드 호제법
      	remain = number1%number2;
      	number1 = number2;
        number2 = remain;
      }
      answer[0] = number1;//최대공약수
      answer[1] = a*b/number1;//최소공배수
      
      return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
}
