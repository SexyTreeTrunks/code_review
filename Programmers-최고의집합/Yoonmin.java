import java.util.Arrays; //테스트로 출력해 보기 위한 코드입니다.

public class BestSet {

    public int[] bestSet(int n, int s){
        int[] answer = new int[n];
        int div = s/n;
        for(int i = 0; i<n; i++) {
        	answer[i] = div;
        }
        int r = s%n;
        for(int i=n-1; r>0; r--) {
        	answer[i]++;
        	i--;
        }
        if(n>s) {
        	answer = new int[1];
        	answer[0] = -1;
        }
        return answer;
    }
    public static void main(String[] args) {
        BestSet c = new BestSet();
        //아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(Arrays.toString(c.bestSet(3,2)));
    }

}