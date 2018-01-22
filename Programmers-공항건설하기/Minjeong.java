package code_review;

public class CityBuilder {
    public int chooseCity(int n,int [][]city)
    {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        int dist_sum = 0;
        for(int i = 0;i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		int dist = (city[i][0] - city[j][0]) * city[j][1];
        		dist_sum += (dist < 0)? dist*(-1):dist;
        	}
        	if(dist_sum < min) {
        		answer = city[i][0];
        		min = dist_sum;
        	}else if(dist_sum == min) {
        		if(answer > city[i][0])
        			answer = city[i][0];
        	}
        }
        return answer;
    }
}
