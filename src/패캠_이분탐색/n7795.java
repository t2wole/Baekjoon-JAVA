package ��ķ_�̺�Ž��;

import java.io.*;
import java.util.*;

public class n7795 {
	
	static Scanner sc = new Scanner(System.in);
	static StringBuilder sb = new StringBuilder();
	
	static int N, M;
	static int[] A, B;
	
	static void input() {
		N = sc.nextInt();
		M = sc.nextInt();
		A = new int[N + 1];
		B = new int[M + 1];
		
		for(int i = 1; i <= N; i++) {
			A[i] = sc.nextInt();
		}
		for(int i = 1; i <= M; i++) {
			B[i] = sc.nextInt();
		}
	}
	
	static int lower_bound(int[] A, int L, int R, int X) {
		// A[L...R] ���� X �̸��� �� �� ���� ������ �ε����� return �ϴ� �Լ�. ���ٸ� L - 1 �� return �Ѵ�
		int result = L - 1;
		
		while(L <= R) {
			int mid = (L + R) / 2;
			if(A[mid] < X) {
				result = mid;
				L = mid + 1;
			}
			else {
				R = mid - 1;
			}
		}
		return result;
	}
	
	static void pro() {
		Arrays.sort(B, 1, M + 1); 	// B �迭�� ���� �̺�Ž���� �� �����̴ϱ�, ����. ������ �ؾ� �ð� ���⵵�� �پ���	
		int answer = 0; 
		
		for(int i = 1; i <= N; i++) {
            // A[i] �� �������� ��, B ������ A[i]���� ���� �� �� ���� �ִ� �� count�ϱ�
			answer = answer + lower_bound(B, 1, M, A[i]);
		}
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		int TT = sc.nextInt();
        for (int tt = 1; tt <= TT; tt++) {
        	input();
        	pro();
        }
	}
}

