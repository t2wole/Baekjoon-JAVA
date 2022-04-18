package ������ȹ��1;

import java.io.*;
import java.util.*;

public class n1904 {

	public static int[] dp = new int[1000001];
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 2;
		
		// -1�� �ʱ�ȭ
		for(int i = 3; i < dp.length; i++) {
			dp[i] = -1;
		}
		System.out.println(tile(n));
	}
	
	public static int tile(int n) {
		if(dp[n] == -1) {
			dp[n] = (tile(n-2) + tile(n-1)) % 15746;
		}
		return dp[n];
	}

}

