package 패캠_이분탐색;

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
		// A[L...R] 에서 X 미만의 수 중 제일 오른쪽 인덱스를 return 하는 함수
        // 그런 게 없다면 L - 1 을 return 한다
		
		int result = L - 1;	// 만약 A[L...R] 중 X 이하의 수가 없다면 L - 1 을 return 한다.
		
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
        // B 배열에 대해 이분탐색을 할 예정이니까, 정렬을 해주자!
		// 정렬을 해야 시간 복잡도가 줄어든다
		Arrays.sort(B, 1, M + 1); 	// B를 1부터 M까지 정렬	
		
		int answer = 0; 
		
		for(int i = 1; i <= N; i++) {
            // A[i] 를 선택했을 때, B 에서는 A[i]보다 작은 게 몇 개나 있는 지 count하기
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

