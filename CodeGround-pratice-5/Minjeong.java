package code_review;

import java.util.Scanner;

public class CodeGround5 {
	/*
	 * --�丣���� ������--
	 * p�� �Ҽ��̰� a�� �����϶�, a^p = a (mod p) �̴�.
	 * �̰� �������̳ĸ� a^p % p = 1 % p �̶�°���.
	 * �� ���� �� �����غ���,,
	 * a^(p-2) % p = 1/a % p
	 * a^(p-2)*b % p = b/a % p
	 * -------�ϴ� ������� ���� �츮�� ���Ϸ����ϴ� ������ nCr�� ����. �긦 ���丮������� �Ẹ��
	 * nCr = n! / (n-r)!r!
	 * n! = A���ϰ�, (n-r)!r!= B���ϸ�,
	 * nCr % p = A/B % p
	 * 		   = B^(p-2)*A % p
	 * 		   = (B^(p-2) % p * A % p) % p
	 * 		   = (B^((p-2)/2) % p * B^((p-2)/2) % p ....
	 * �̷��� �������� �ٲٰ� �ŵ����� �й��Ģ �̿��Ҽ�����!
	 * �׸��� ���⿡ ���丮�� ���� �̸� ����ؼ� �迭�� �����س����� ���ð��� �� ���ϼ�����!
	 */
	static long Answer;
	static long fact[] = new long [2000003];
	final static long constant = 1000000007;
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));
		fact[0] = 1;
		for(int i = 1; i < 2000003; i++)
			fact[i] = fact[i-1] * i % constant;

		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
		    int input_N = sc.nextInt();
		    int input_M = sc.nextInt();
			int n = input_N + input_M + 2;
			int r = input_N + 1;
			Answer = 0;
			/*
			Answer = 1;
			for(int i = 1; i <= r; i++) {
			    Answer = Answer / i;
			    Answer *= n--;
			    Answer %= constant;
			}
			Answer = (Answer - 1) % constant;
			�̷��� Ǯ������� ū m,n���� Ŭ�� time complexity�� ������ & ���� ū���� ���� �������� ���������� �ؾ� �ϹǷ� ���ϵ� ŭ.
			�ϴ� output�� ū �Ҽ�(constant)�� �������ӿ� �ָ�����.
			��ⷯ ������ �������� ���ؼ� �й��Ģ�� �����̾ȵ�.
			�丣���� �������� �̿��ϸ� ������������ ��ⷯ������ ���������� ��ⷯ�������� �ٲܼ����� 
			*/
			long deno = (fact[r] * fact[n-r]) % constant;
			Answer = (fact[n] * getExpo(deno,constant-2) -1) % constant;
			
			System.out.println("Case #"+(test_case+1));
			System.out.println(Answer);
		}
		
	}
	
	private static long getExpo(long n, long p) {
		if(p == 0)
			return 1;
		else if(p == 1)
			return n;
		else {
			long tmp = getExpo(n,p/2);
			if(p % 2 == 0)
				return (tmp*tmp) % constant;
			else
				return ((tmp*tmp)%constant * n) % constant;
			// a*b*c % p
			// ((a*b) %p * c % p) %p
			// ((a*b)%p *c)%p
			// ((a%p * b%p)%p *c) %p
		}
		
	}
	
}
