package code_review;

import java.util.Arrays;

class MinJeong {
  public int[] gcdlcm(int a, int b) {
      int[] answer = new int[2];
      answer[0] = a > b? getGCD(a,b):getGCD(b,a);
      answer[1] = a * b / answer[0];
      return answer;
  }
  private int getGCD(int a, int b) {
    if(b == 1)
      return 1;
    int reminder = a % b;
    if(reminder == 0)
      return b;
    else
      return getGCD(b, reminder);
  }
  
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
        MinJeong c = new MinJeong();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
        System.out.println(Arrays.toString(c.gcdlcm(1071, 1029)));//gcd=21
        System.out.println(Arrays.toString(c.gcdlcm(2047, 4095)));//�޸����Ҽ�
        System.out.println(Arrays.toString(c.gcdlcm(16383,24043)));//�Ҽ� 2��
        System.out.println(Arrays.toString(c.gcdlcm(373, 99877)));//�Ҽ� 2��
    }
   
}
