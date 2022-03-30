package 브루트포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2231 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());	//분해합
		
		int result = 0;
		
		for(int i = 0; i < n; i++) {
			int number = i;		// 생성자
			int sum = 0;		// 각 자릿수의 합
			
			while(number != 0) {	
				sum += number % 10;
				number /= 10;
			}
			
			if(sum + i == n) {	// 생성자와 분해합이 같으면
				result = i;
				break;
			}
		}
		System.out.println(result); 
		
	}

}
