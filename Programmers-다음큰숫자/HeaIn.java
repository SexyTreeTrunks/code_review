class TryHelloWorld {
    public int nextBigNumber(int n) {
        int answer = n + 1;
        int bitNum = Integer.bitCount(n);	
        while(bitNum != Integer.bitCount(answer))
            answer++;
      
        return answer;
    }
    public static void main(String[] args) {
        TryHelloWorld test = new TryHelloWorld();
        int n = 78;
        System.out.println(test.nextBigNumber(n));
    }
}