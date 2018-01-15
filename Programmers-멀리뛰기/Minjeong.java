package code_review;

class JumpCase {
    public int jumpCase(int num) {
        int answer = 0;
        int a1= 1, a2=2;
        if(num == a1)
        	return a1;
        else if(num == a2)
        	return a2;
        else
        	for(int i = 3; i <= num; i++) {
        		answer = a1 + a2;
        		a1 = a2;
        		a2 = answer;
        	}
        return answer;
    }
}