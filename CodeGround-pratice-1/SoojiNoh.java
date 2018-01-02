package codeground;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


class TestCase{
	
	String[] num_str;
	ArrayList<Integer> num_count[] = new ArrayList[2];//num_count[0] : input_number, num_count[1] : times of appearance
	ArrayList<Integer> odd_count = new ArrayList<Integer>();
	int result = -1;
	
	public TestCase(int n, String nil, String str){
		num_str = new String[n];
		System.out.println(n);
		num_str = str.split("\\s+");
	}
	
	public void countNumbers(){
		
		int number, number_pos;
		num_count[0] = new ArrayList<Integer>();
		num_count[1] = new ArrayList<Integer>();
		
		for(int i = 0 ; i < num_str.length ; i++){
			number = Integer.parseInt(num_str[i]);
			if (num_count[0].contains(number)){
				number_pos = num_count[0].indexOf(number);
				num_count[1].set(number_pos, num_count[1].get(number_pos)+1);
			}
			else
				num_count[0].add(number);
				num_count[1].add(1);
		}
		
	}
	
	public void oddNumbers(){
		for(int i = 0 ; i < num_count.length ; i++){
			if (num_count[1].get(i)%2!=0){
				odd_count.add(num_count[0].get(i));
			}
		}
	}
	
	public void XOR(){
		if (result == -1) result=odd_count.get(0);
		for(int number : odd_count){
			System.out.println(result);
			result^=number;
		}
	}
	
	public void print(){
		System.out.println(Arrays.toString(num_str));
	}
}

public class XorSelect {
	
	static TestCase[] cases;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath =String.format("%ssample_input.txt",XorSelect.class.getResource("").getPath());
		File file = null;
		
		String str ;
		
		
		
		
		try
		{
			file = new File(filePath);// 파일 스트림 생성
			Scanner scan = new Scanner(file);
			

//			while (scan.hasNextLine()){
//				str = scan.nextLine();
//				System.out.println(": "+str);
//			}
			
			cases = new TestCase[scan.nextInt()];
			
			for(int i = 0; i < cases.length ; i++){
				cases[i] = new TestCase(scan.nextInt(),scan.nextLine(), scan.nextLine());
				cases[i].print();
				cases[i].countNumbers();
				cases[i].oddNumbers();
				cases[i].XOR();
				System.out.println(cases[i].result);
			}
			
			
            scan.close();
		
            
//			PrintWriter output = new PrintWriter("/Users/soojinoh/Desktop/workspace/Eclipse/Google_practice/src/out.txt");
//		
//			for(int n=1; n <= num; n++) {
//	            String data = "Case #"+n+": ";
//	            output.println(data+problem[n-1].result);
//	        }
//			
//			output.close();
			
			
		}
		catch (Exception e)
		{
			System.out.println("파일 입출력 에러!!" + e);
		}
	}

}



