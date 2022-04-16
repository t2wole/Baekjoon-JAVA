package 동적계획법1;

import java.io.*;
import java.util.*;

public class n1003 {

	static int zero;
	static int one;
	static int zero_plus_one;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < T; i++) {
			int n = Integer.parseInt(br.readLine());
			fibo(n);
			sb.append(zero).append(' ').append(one).append('\n');
		}
		System.out.println(sb);
	}
	
	public static void fibo(int n) {	
		// 반드시 초기화 하기
		zero = 1;
		one = 0;
		zero_plus_one = 1;
		
		for(int i = 0; i < n; i++) {
			zero = one;
			one = zero_plus_one;
			zero_plus_one = zero + one;
		}
	}
}


