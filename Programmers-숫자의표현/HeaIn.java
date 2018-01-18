import java.util.Arrays; //�׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.

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
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(Arrays.toString(c.bestSet(3,13)));
    }

}