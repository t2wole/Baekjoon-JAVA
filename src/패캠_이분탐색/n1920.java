package ÆÐÄ·_ÀÌºÐÅ½»ö;

import java.io.*;
import java.util.*;

public class n1920 {
	
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	
	static int N;
	static int[] A;
	
	static void input() {
		N = sc.nextInt();
		A = new int[N + 1];
		for(int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
	}
	
	static boolean binary(int[] A, int L, int R, int X) {
		while(L <= R) {
			int mid = (L + R) / 2;
			if(A[mid] == X) {
				return true;
			}
			if(A[mid] < X) {
				L = mid + 1;
			}
			else {
				R = mid - 1;
			}
		}
		return false;
	}
	
	static void pro() {
		int M = sc.nextInt();
		Arrays.sort(A, 1, N + 1);
		for(int i = 1; i <= M; i++) {
			int X = sc.nextInt();
			if(binary(A, 1, N, X)) sb.append(1).append('\n');
			else sb.append(0).append('\n');
		}
		System.out.println(sb);
	}
	
	public static void main(String[] args) {
		input();
		pro();
		
	}
}
