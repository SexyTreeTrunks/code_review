class JumpCase {

    public int jumpCase(int num) {
        int answer = 0;
      
        int first = 0;	//f(n-2)
        int second = 1;	//f(n-1)
        for(int i = 1; i <= num; i++) {
            answer = first + second;
            first = second;
            second = answer;
        }
        return answer;
    }

    public static void main(String[] args) {
        JumpCase c = new JumpCase();
        int testCase = 4;
        System.out.println(c.jumpCase(testCase));
      	//(1) -> 1
        System.out.println("1老 锭 : " + c.jumpCase(1));
      	//(1,1),(2) -> 2
        System.out.println("2老 锭 : " + c.jumpCase(2));
      	//(1,1,1),(1,2),(2,1) -> 3
        System.out.println("3老 锭 : " + c.jumpCase(3));
      	//(1,1,1,1)(1,1,2)(1,2,1)(2,1,1)(2,2) -> 5
        System.out.println("4老 锭 : " + c.jumpCase(4));
        //(1,1,1,1,1)(1,1,1,2)(1,1,2,1)(1,2,1,1)(2,1,1,1)(1,2,2)(2,1,2)(2,2,1) -> 8
        System.out.println("5老 锭 : " + c.jumpCase(5));
    }
}