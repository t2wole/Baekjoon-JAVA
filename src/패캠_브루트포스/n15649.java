package 패캠_브루트포스;
import java.io.*;
import java.util.*;

public class n15649 {
	static StringBuilder sb = new StringBuilder();
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		selected = new int[M + 1];
		used = new int[N + 1];
	}
	
	static int N, M;
	static int[] selected, used;
	
	
	// 만약 M 개를 전부 고름   => 조건에 맞는 탐색을 한 가지 성공한 것!
    // 아직 M 개를 고르지 않음 => k 번째부터 M번째 원소를 조건에 맞게 고르는 모든 방법을 시도한다.
	static void rec_func(int k) {
		if(k == M + 1) {	// 1 ~ M 번째를 모두 골랐음
			for(int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
			sb.append('\n');
		}
		else {
			for(int cand = 1; cand <= N; cand++) {
				if(used[cand] == 1) continue;
				
				// k 번째에 cand 가 올 수 있으면	
				selected[k] = cand; used[cand] = 1;
				
				rec_func(k+1);
				
				selected[k] = 0; 	used[cand] = 0;
			}
		}
	}
	
	public static void main(String[] args) {
		input();
		
		rec_func(1);
		System.out.println(sb.toString());
	}
}
