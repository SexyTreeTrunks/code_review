package code_review;

import java.util.Scanner;
//next 고정 array로말고 linked list나 treeset으로 짜기
//symbol길이가 3 이상일 경우 고려해서 알고리즘 짜보기
class Solution {

	static int Answer;
	static Node root = new Node();
	
	public static void initSymbolSet() {
		String set[] = {"Co", "Ni", "Cu", "Zn", "Ga", "Ge", "As", "Se", "Br", "Kr", "Rb", "Sr",
				   "Y","Zr", "Nb", "Mo", "Tc", "Ru", "Rh", "Pd", "Ag", "Cd", "In", "Sn", "Sb",
				   "Te", "I", "Xe", "Cs", "Ba", "Hf", "Ta", "W", "Re", "Os", "Ir", "Pt", "Au",
				   "Hg", "Tl", "Pb", "Bi", "Po", "At", "Rn", "Fr", "Ra", "Rf", "Db", "Sg",
				   "Bh", "Hs", "Mt", "Ds", "Rg", "Cn", "Fl", "Lv", "La", "Ce", "Pr", "Nd",
				   "Pm", "Sm", "Eu", "Gd", "Tb", "Dy", "Ho", "Er", "Tm", "Yb", "Lu", "Ac",
				   "Th", "Pa", "U", "Np", "Pu", "Am", "Cm", "Bk", "Cf", "Es", "Fm", "Md",
				   "No", "Lr" };
		for(int i =0; i< set.length; i++) {
			String str = set[i].toLowerCase();
			int value = str.charAt(0) - 'a';
			if(root.next[value] == null)
				root.next[value] = new Node();
			if(str.length() > 1) {
				Node cur = root.next[value];
				int next_value = str.charAt(1) - 'a';
				cur.next[next_value] = new Node();
				cur.isOutput = true;
			}
		}
		//최대 2level이므로 bfs사용 안함
		for(int i =0; i < root.next.length; i++) {
			Node cur_n = root.next[i];
			if(cur_n != null) {
				cur_n.failure_link = root;
				for(int j =0; j < cur_n.next.length; j++) {
					if(cur_n.next[j] != null) {
						if(root.next[j] != null) {
							cur_n.failure_link = root.next[j];
							cur_n.isOutput = false;
							root.next[j].isOutput = true;
						} else
							cur_n.failure_link = root;
					}
				}
			}
		}
	}
	
	public static void main(String args[]) throws Exception	{
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new FileInputStream("input.txt"));
		initSymbolSet();
		
		int T = sc.nextInt();
		for(int test_case = 0; test_case < T; test_case++) {
			Answer = 0;
			String word = sc.next();
			Node cur = root;
			int i;
			for(i =0; i < word.length(); i++) {
				int value = word.charAt(i) - 'a';
				if(cur.next[value] != null) {
					cur = cur.next[value];
				}else {
					if(!cur.isOutput || cur == root)
						break;
					cur = cur.failure_link;
				}
			}
			// Print the answer to standard output(screen).
			System.out.println("Case #"+(test_case+1));
			if(i == word.length())
				System.out.println("YES");
			else
				System.out.println("NO");
			//System.out.println(result);
		}
	}
}

class Node {
	Node next[] = new Node[26];
	Node failure_link = null;
	int value = 0;
	boolean isOutput = false;
}