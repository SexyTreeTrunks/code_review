package code_review;

public class HarshadNumber {
	public boolean isHarshad(int num){
	    int digit_sum = 0;
	    String str_num = Integer.toString(num);
	    for(int i = 0; i < str_num.length(); i++)
	    	digit_sum += str_num.charAt(i) - '0';
	    
	    if(num % digit_sum == 0)
			return true;
	    else
	    	return false;
	}
	  
	public static void  main(String[] args){
		HarshadNumber sn = new HarshadNumber();
		System.out.println(sn.isHarshad(18));//T
		System.out.println(sn.isHarshad(10));//T
		System.out.println(sn.isHarshad(12));//T
		System.out.println(sn.isHarshad(11));//F
		System.out.println(sn.isHarshad(13));//F
	}
}
