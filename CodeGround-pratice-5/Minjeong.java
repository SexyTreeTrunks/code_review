package code_review;

import java.util.Scanner;

public class CodeGround5 {
	/*
	 * --페르마의 소정리--
	 * p가 소수이고 a가 정수일때, a^p = a (mod p) 이다.
	 * 이게 무슨말이냐면 a^p % p = 1 % p 이라는것임.
	 * 이 식을 좀 변형해보면,,
	 * a^(p-2) % p = 1/a % p
	 * a^(p-2)*b % p = b/a % p
	 * -------일단 여기까지 보고 우리가 구하려고하는 조합인 nCr를 보자. 얘를 팩토리얼식으로 써보면
	 * nCr = n! / (n-r)!r!
	 * n! = A라하고, (n-r)!r!= B라하면,
	 * nCr % p = A/B % p
	 * 		   = B^(p-2)*A % p
	 * 		   = (B^(p-2) % p * A % p) % p
	 * 		   = (B^((p-2)/2) % p * B^((p-2)/2) % p ....
	 * 이러케 곱셈으로 바꾸고 거듭제곱 분배법칙 이용할수있음!
	 * 그리고 여기에 펙토리얼 값을 미리 계산해서 배열에 저장해놓으면 계산시간을 더 줄일수있음!
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
			이렇게 풀었을경우 큰 m,n값이 클때 time complexity가 높아짐 & 점점 큰수에 대해 나눗셈과 곱셈연산을 해야 하므로 부하도 큼.
			일단 output이 큰 소수(constant)의 나머지임에 주목하자.
			모듈러 연산은 나눗셈에 대해선 분배법칙이 성립이안됨.
			페르마의 소정리를 이용하면 나눗셈에대한 모듈러연산을 곱셈에대한 모듈러연산으로 바꿀수있음 
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
