import java.util.Arrays; //�׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.

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
        //�Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
        System.out.println(Arrays.toString(c.bestSet(3,2)));
    }

}