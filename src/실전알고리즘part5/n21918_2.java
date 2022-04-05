package 실전알고리즘part5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n21918_2 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		StringTokenizer st; 
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[4001];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int j = 0; j < m; j++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			if(a == 1) {
				arr[b] = c;
			}
			else if(a == 2) {
				for(int i = b; i <= c; i++) {
					if(arr[i] == 0) arr[i] = 1;
					else arr[i] = 0;
				}
			}
			else if(a == 3) {
				for(int i = b; i <= c; i++) {
					arr[i] = 0;
				}
			}
			else if(a == 4) {
				for(int i = b; i <= c; i++) {
					arr[i] = 1;
				}
			}
		}
		for(int i = 1; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}

}
