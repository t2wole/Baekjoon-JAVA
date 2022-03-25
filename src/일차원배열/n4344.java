package 일차원배열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n4344 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		int c = Integer.parseInt(br.readLine());		
		StringTokenizer st;
		
		for(int i = 0; i < c; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int n = Integer.parseInt(st.nextToken());
			int[] arr = new int[n];
			
			double sum = 0;
			
			for(int j = 0; j < n; j++) {
				int result = Integer.parseInt(st.nextToken());
				arr[j] = result;
				sum += result;
			}
			
			double avg = sum / n;
			double count = 0;	//평균이상 인원수
			
			for(int j = 0; j < n; j++) {
				if(arr[j] > avg) {
					count++;
				}
			}			
			System.out.printf("%.3f%%\n", count/n * 100);
		}
	}
}
