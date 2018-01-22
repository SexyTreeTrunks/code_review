package programmers;

class ChooseCity
{
  int[][] city;
  
  public int chooseCity(int n, int [][]city)
  {
    int answer = 0;
	this.city = city;
	int min=getDistance(city[0][0]);

    for(int i=0 ; i<city.length ; i++){
//    	System.out.println(getDistance(city[0][0]));
      if (getDistance(city[i][0])<min) answer=i+1;
    }
    
    

    return answer+1;
    }
  
  public int getDistance(int pos){
	int distance = 0;
	for(int i=0 ; i<city.length ; i++){
//		System.out.println("city["+i+"][0]"+city[i][0]);
//		System.out.println("city["+i+"][1]"+city[i][1]);
//		System.out.println("pos-city["+i+"][0])"+(pos-city[i][0]));
    	distance+=Math.abs(pos-city[i][0])*city[i][1];
//    	System.out.println("distance++??"+distance);
    }
	return distance;
  }

  public static void main(String[] args)
  {
      ChooseCity test = new ChooseCity();
      int tn = 3;
      int [][]tcity = {{1,5},{2,2},{3,3}};
      System.out.println(test.chooseCity(tn,tcity));
  }
}
