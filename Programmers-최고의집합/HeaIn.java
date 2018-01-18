import java.util.Arrays; //테스트로 출력해 보기 위한 코드입니다.

public class BestSet {

    public int[] bestSet(int n, int s){
      int[] answer = new int[n];
      if(s < n)
        return new int[]{-1};
      
      for(int i = 0; i < n; i++)
        answer[i] = s / n;
      
      int remain = s % n;
      for(int i = 0; i < remain; i++) {
            answer[n-1-i]++;
      }

        return answer;
    }
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
    }

}