package programmers;
import java.util.Arrays; //테스트로 출력해 보기 위한 코드입니다.

public class BestSet {

    public int[] bestSet(int n, int s){
      int[] answer = null;
      
      if (n>s) return new int[] {-1};
      answer = new int[n];
      Arrays.fill(answer,s/n);
      for (int i=s%n, j=answer.length-1; i>0 ; i--, j--){
        answer[j]+=1;
      }
      
      return answer;
    }
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
    }

}