class Collatz {
    public int collatz(int num) {
        int answer = 0;
        long number = (long) num;
        while (number != 1) {
            number = (number % 2 == 0)? number /2: number * 3 + 1;
            answer++;
            if(answer>=500) {
            	return -1;
            }
            //System.out.print(num + "("+ answer+ ")" + "->");
        }
        return answer;
    }


    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
        Collatz c = new Collatz();
        int ex = 7;
        System.out.println(c.collatz(ex));
    }
}