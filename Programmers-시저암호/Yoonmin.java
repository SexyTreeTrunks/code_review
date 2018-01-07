import java.util.Arrays;

class Caesar {
	String caesar(String s, int n) {
		String[] str = s.split("");
		StringBuffer result = new StringBuffer();
		
		//'A'-'Z' = (65-90) 'a' - 'z' = (97-122)
		for(int i = 0; i < str.length; i++) {
			int boundaryLow = 0;
			int boundaryHigh = 0;
			boolean isBigletter = false;
			
			if(str[i].charAt(0)==' ') {
				result.append(str[i]);
				continue;
			}
			
			int alphabet = str[i].charAt(0);
			
			//mapping (0-25)
			if(alphabet >= 97) {
				isBigletter = true;
				alphabet -= 97;
			}
			else {
				alphabet -=65;
				isBigletter = false;
			}
			
			alphabet += n;
			if(alphabet > 25) {
				while(alphabet > 25) {
					alphabet -= 26;
				}
			}else if(alphabet < 0) {
				while(alphabet < 0) {
					alphabet += 26;
				}
			}

			alphabet = (isBigletter)? alphabet+97: alphabet+65;
			
			char newChar = (char)alphabet;
			result.append(Character.toString(newChar));
		}
		return result.toString();
	}

	public static void main(String[] args) {
		Caesar c = new Caesar();
		System.out.println("s는 'c B z', n은 65인 경우: " + c.caesar("c B z", 5));
	}
}
