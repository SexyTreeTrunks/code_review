public class Expressions {

	public int expressions(int num) {
		int answer = 0; int sum;
		for(int i=1; i<=num; i++) {
			sum = 0;
			for(int j=i; sum <= num; j++) {
				sum += j;
				if(sum == num) answer++;
			}
		}
		return answer;
	}

	public static void main(String args[]) {
		Expressions expressions = new Expressions();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(expressions.expressions(15));
	}
}