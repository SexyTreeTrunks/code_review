package code_review;

class Caesar {
	String caesar(String s, int n) {
		String result = "";
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			if(c!=' ')
				result+=encode(c, n);
			else
				result+=" ";
		}
		return result;
	}

	private char encode(char c, int n) {
		boolean isUpper = (c < 'a')? true:false;
		char encoded_char = (char) (c + n);
		if(isUpper)
			while(encoded_char > 'Z')
				encoded_char -= 26;
		else
			while(encoded_char > 'z')
				encoded_char -= 26;
		return encoded_char;
	}


}