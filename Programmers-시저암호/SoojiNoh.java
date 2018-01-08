class SoojiNoh {
  	String alphabets_big = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  	String alphabets_small = "abcdefghijklmnopqrstuvwxyz";
  
	String sooji(String s, int n) {
		String result = "";
		System.out.println("s: "+s);
		System.out.println("n: "+n);
		// 함수를 완성하세요.
		
		
		for (int i=0 ; i<s.length() ; i++){
			char alpha = s.charAt(i);
      if (alpha==' ')
        result+=' ';
      else if((int)alpha<97)
      {
        int alpha_cal = (int)alphabets_big.indexOf(alpha)+n;
        while(alpha_cal>alphabets_big.length()-1){
          alpha_cal-=alphabets_big.length();
        }
        result+=alphabets_big.charAt(alpha_cal);
      }
      else{
        int alpha_cal = (int)alphabets_small.indexOf(alpha)+n;
        while(alpha_cal>alphabets_small.length()-1){
          alpha_cal-=alphabets_small.length();
        }
        result+=alphabets_small.charAt(alpha_cal);
      }
		}

		return result;
	}

	public static void main(String[] args) {
		SoojiNoh c = new SoojiNoh();
		System.out.println("s는 'a B z', n은 4인 경우: " + c.sooji("a B z", 4));
	}
}
