package ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n10818 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int count = 0;
		int[] arr = new int[n];
		
		while(st.hasMoreTokens()) {	//StringTokenizer에 토큰이 남았다면 true, 아니면 false			
			arr[count] = Integer.parseInt(st.nextToken());
			count++;
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[n-1]);

	}

}
