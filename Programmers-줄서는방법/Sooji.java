import java.util.*;

class LineCombination {
	public int[] setAlign(int length, long k) {
		int[] answer = new int[length];
		
		List<Integer> storage = new LinkedList<Integer>();
		for (int i=1 ; i<=length ; i++) storage.add(i);
		
		long divider, index, rem = k;
		for(int i=0; i<length-2 ; i++){
			divider = 1;
			int len = length;
			for(int j=1 ; j<length-i ; j++){
				divider*=j;
			}
			if (rem%divider==0){
				index = rem/divider-1;
				rem=rem%divider+divider;
			} else {
				index = rem/divider;
				rem=rem%divider;
			}
			answer[i] = storage.get((int) index);
			storage.remove((int)index);
		}
		answer[length-2] = storage.get((int) (rem-1));
		storage.remove((int)rem-1);
		answer[length-1] = storage.get((0));
		
		return answer;

	}
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		LineCombination lc = new LineCombination();
		System.out.println(Arrays.toString(lc.setAlign(3, 5)));
	}
}
