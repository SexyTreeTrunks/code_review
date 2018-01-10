import java.nio.ByteBuffer;

class TryHelloWorld
{
    public int nextBigNumber(int n)
    {
        int bit_count = Integer.bitCount(n);
        int numOfone = 0;
        
        while(numOfone != bit_count) {
        	n++;
        	numOfone = Integer.bitCount(n);
        }
        return n;
    }
    public static void main(String[] args)
    {
        TryHelloWorld test = new TryHelloWorld();
        int n = 78;
        System.out.println(test.nextBigNumber(n));
    }
}