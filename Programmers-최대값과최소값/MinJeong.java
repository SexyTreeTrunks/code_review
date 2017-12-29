package code_review;

class Fibonacci {
	public long fibonacci(int num) {
		long answer = 0;
		long fibo1 = 1, fibo2=1;
		for(int i = 2;i < num; i++) {
			answer = fibo1 + fibo2;
			fibo1 = fibo2;
			fibo2 = answer;
		}
		return answer;
	}
/*
  // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		Fibonacci c = new Fibonacci();
		//int testCase = 3;
		System.out.println(c.fibonacci(3));
		System.out.println(c.fibonacci(4));
		System.out.println(c.fibonacci(30));
		System.out.println(c.fibonacci(50));
		
	}
	*/
}