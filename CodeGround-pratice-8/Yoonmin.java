import java.util.Scanner;

class Example {
	static String Answer;
	static String input_str;
	static String sub_str;

	static String[] elements = { "ac", "ag", "al", "am", "ar", "as", "at", "au", "ba", "be", "bh", "bi", "bk", "br",
			"ca", "cd", "ce", "cf", "cl", "cm", "cn", "co", "cr", "cs", "cu", "db", "ds", "dy", "er", "es", "eu", "fe",
			"fl", "fm", "fr", "ga", "gd", "ge", "he", "hf", "hg", "ho", "hs", "in", "ir", "kr", "la", "li", "lr", "lu",
			"lv", "md", "mg", "mn", "mo", "mt", "na", "nb", "nd", "ne", "ni", "no", "np", "os", "pa", "pb", "pd", "pm",
			"po", "pr", "pt", "pu", "ra", "rb", "re", "rf", "rg", "rh", "rn", "ru", "sb", "sc", "se", "sg", "si", "sm",
			"sn", "sr", "ta", "tb", "tc", "te", "th", "ti", "tl", "tm", "xe", "yb", "zn", "zr" };

	// static String[] single_elements = { "i", "o", "n", "s", "u", "c", "h", "p",
	// "y", "b", "f", "k", "v", "w" };
	static String single_elements = "ionsuchpybfkvw";

	static String[] element_a = { "ac", "ag", "al", "am", "ar", "as", "at", "au" };
	static String[] element_c = { "ca", "cd", "ce", "cf", "cl", "cm", "cn", "co", "cr", "cs", "cu" };
	static String[] element_n = { "na", "nb", "nd", "ne", "ni", "no", "np" };
	static String[] element_p = { "pa", "pb", "pd", "pm", "po", "pr", "pt", "pu" };
	static String[] element_r = { "ra", "rb", "re", "rf", "rg", "rh", "rn", "ru" };
	static String[] element_s = { "sb", "sc", "se", "sg", "si", "sm", "sn", "sr" };
	static String[] element_t = { "ta", "tb", "tc", "te", "th", "ti", "tl", "tm" };
	static String[] element_extra = { "ba", "be", "bh", "bi", "bk", "br", "db", "ds", "dy", "er", "es", "eu", "fe",
			"fl", "fm", "fr", "ga", "gd", "ge", "he", "hf", "hg", "ho", "hs", "in", "ir", "kr", "la", "li", "lr", "lu",
			"lv", "md", "mg", "mn", "mo", "mt", "os", "xe", "yb", "zn", "zr" };

	public static void main(String args[]) throws Exception {

		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int test_case = 0; test_case < T; test_case++) {

			Answer = "YES";
			input_str = sc.next();
			String[] in_str = input_str.split("");
			int str_len = in_str.length;

			Boolean[] found = new Boolean[str_len];
			StringBuffer sb = new StringBuffer();

			for (int i = 0; i < str_len; i++) {
				if (single_elements.contains(in_str[i]))
					found[i] = true;
				else
					found[i] = false;
			}

			int index;
			boolean exist = false;
			for (int i = 0; i < str_len; i++) {
				sb.setLength(0);
				sb.append(in_str[i]);

				// while(!found[i]) {
				//
				// }

				index = i;
				if (!found[i] && i!=0) {
					sb.insert(0, in_str[--index]);
					exist = checkout(sb.toString());
				} else if (index < str_len-1) {
					sb.append(in_str[++index]);
					exist = checkout(sb.toString());
				}
				found[i] = (exist)? true: false;
				//System.out.println(sb);
			}

			for(int k=0; k<str_len; k++) {
				if(found[k]== false) {Answer = "NO"; break;}
			}
			// Arrays.sort(elements);
			// for (int i = 0; i < elements.length; i++) {
			// System.out.print("\"" + elements[i].toLowerCase() + "\",");
			// }
			// System.out.println();

			// for(int i = 0; i<elements.length; i++) {
			// String str = elements[i];
			// if(str.contains("j") || str.contains("q") || str.contains("J") ||
			// str.contains("Q")) {
			// System.out.println("**"+ str);}
			// else{System.out.print(i);}
			// }

			System.out.println("Case #" + (test_case + 1));
			System.out.println(Answer);
		}
	}
	
	static boolean checkout(String str) {
		for(int i=0; i<elements.length; i++) {
			if(elements[i] == str) return true;
		}
		return false;
	}
}