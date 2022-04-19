package ДЉРћЧе;

import java.io.*;
import java.util.*;

public class n2559 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());	
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int result = -(Integer.MAX_VALUE);
		
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i <= n - k; i++) {
			int sum = 0;
			for(int j = i; j < i + k; j++) {
				sum += arr[j];
			}
			result = Math.max(result, sum);
			
		}
		System.out.println(result);
	}
}
