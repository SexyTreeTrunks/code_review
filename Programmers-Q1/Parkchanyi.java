import java.util.Arrays;

class SoojiNoh{
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
      while(remain>0){ // ��Ŭ���� ȣ����
      	remain = number1%number2;
      	number1 = number2;
        number2 = remain;
      }
      answer[0] = number1;//�ִ�����
      answer[1] = a*b/number1;//�ּҰ����
      
      return answer;
    }

    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
}
