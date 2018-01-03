import java.util.Arrays;

public class GCMexample {		
	int[] GCM(int a, int b) {
		int[] answer = new int[2];
		answer[1] = a *b;
		int temp;
		while(b!=0) {
			temp = a % b;
			a = b;
			b = temp;
		}
		answer[0] = a;
		answer[1] = answer[1]/a;
		return answer;
	}
	
	public static void main(String[] args) {
		GCMexample c = new GCMexample();
		System.out.println(Arrays.toString(c.GCM(3, 12)));
	}
}