

import java.util.Arrays;

class SoojiNoh {
    public int[] gcdlcm(int a, int b) {
      int[] answer = new int[2];

      int divider=2;
      int divider_record=1;
      int dividee_a=a;
      int dividee_b=b;
      
      //인수분해
      divider=2;
      do {
        if (dividee_a%divider==0 && dividee_b%divider==0){
          divider_record*=divider ;
          dividee_a/=divider;
          dividee_b/=divider;
          break;
        }
        divider++;
      } while (divider < dividee_a && divider < dividee_b);
      
      
      answer[0] = divider_record;
      answer[1] = divider_record*dividee_a*dividee_b;
      return answer;
    }

    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
}
