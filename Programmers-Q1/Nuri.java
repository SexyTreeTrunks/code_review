import java.util.Arrays;

class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
        int i;
        int bigger = 0;
        //큰 수 구하기
        if(a<b)
          bigger = b;
        else
          bigger = a;
        //최소공배수 구하는 부분
        for (i=bigger;i<=a*b;i++){
          if (i%a ==0 && i%b==0){
            answer[1] = i;
            break;
          }
        }
        //최대공약수 구하는 부분
        answer[0] = a*b/answer[1];
        return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
}
