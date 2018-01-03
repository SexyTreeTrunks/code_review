import java.util.Arrays;

class TryHelloWorld {
    public int[] gcdlcm(int a, int b) {
        int[] answer = new int[2];
      
      	int num_big, num_small;
      	if(a > b) {
          num_big = a;
          num_small = b;
        } else {
          num_big = b;
          num_small = a;
        }
      	
      	//작은 수가 최대공약수, 큰 수가 최소공배수일 경우 바로 리턴
      	if(num_big % num_small == 0) {
          answer[0] = num_small;
          answer[1] = num_big;
          return answer;
        }
      
      	//Euclidean algorithm
      	int remain = 1;
      	while(remain > 0) {
          remain = num_big % num_small;
          num_big = num_small;
          num_small = remain;
        }
      
      	answer[0] = num_big;
      	answer[1] = a * b / answer[0];

        return answer;
    }

    public static void main(String[] args) {
        TryHelloWorld c = new TryHelloWorld();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
}
