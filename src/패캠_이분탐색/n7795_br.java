package ÆÐÄ·_ÀÌºÐÅ½»ö;

import java.io.*;
import java.util.*;

public class n7795_br {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int tt = 0; tt < T; tt++) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			int[] A = new int[N];
			int[] B = new int[M];
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < N; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}
			
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < M; i++) {
				B[i] = Integer.parseInt(st.nextToken());
			}
			
			Arrays.sort(B);
			
			int result = 0;
			
			for(int i = 0; i < N; i++) {
				for(int j = M - 1; j >= 0; j--) {
					if(A[i] > B[j]) {
						result += j + 1;
						break;
					}
				}
			}
			sb.append(result).append('\n');	
		}
		System.out.println(sb);
	}

}
