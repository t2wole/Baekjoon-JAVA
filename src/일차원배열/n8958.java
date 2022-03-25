package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n8958 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		String[] arr = new String[T];
		
		for(int i = 0; i < T; i++) {
			arr[i] = br.readLine();
		}
		
		for(int i = 0; i < T; i++) {			
			int sum = 0;	// 합
			int count = 0;	// 연속된 횟수
			
			for(int j = 0; j < arr[i].length(); j++) {
				if(arr[i].charAt(j) == 'O') {
					count++;
				}
				else { 
					count = 0;
				}
				sum += count;
			}	
			sb.append(sum).append("\n");
		}	
		System.out.print(sb);
	}
}
