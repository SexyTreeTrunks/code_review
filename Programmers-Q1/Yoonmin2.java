import java.util.Scanner;

public class GCDandLCM {
	
	//직관적인 최대공약수
	static	int gcd_basic(int a, int b) {
		//a > b ? a : b
		int big = 0;
		int small = 0;
		int gcd = 0;
		
		if(a > b) {
			big = a;
			small = b;
		}
		else if(a == b) {
			return a;
		}
		else {
			big = b;
			small = a;
		}
		
		for(int i = small; i > 0; i--) {
			if((big%i == 0) && (small%i == 0)) {
				gcd = i;
				break;
			}
		}
		
		return gcd;
	}
	

	//유클리드 호제법
	//GCD = (a,b) = (b,r)
	//r = a % b	
	int gcd_modulus(int u, int v){   
	    int t;    
	    while (v != 0){
	        t = u%v;
	        u = v;
	        v = t;
	    }
	    return u;
	}
	
	int gcd_minus(int u, int v){
	    int t;
	    while (u != 0){
	        if (u < v){
	            t = u; u = v; v = t;
	        }
	        u = u - v;
	    }
	    return v;
	}

	int gcd_recursion(int u, int v){
	    if (v == 0){
	        return u;
	    }
	    else{
	        return gcd_recursion(v, u%v);
	    }
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int result = gcd_basic(a, b);
		System.out.format("result: %d", result);
	}
	
}
