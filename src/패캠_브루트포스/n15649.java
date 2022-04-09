package ��ķ_���Ʈ����;
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
	
	
	// ���� M ���� ���� ��   => ���ǿ� �´� Ž���� �� ���� ������ ��!
    // ���� M ���� ���� ���� => k ��°���� M��° ���Ҹ� ���ǿ� �°� ���� ��� ����� �õ��Ѵ�.
	static void rec_func(int k) {
		if(k == M + 1) {	// 1 ~ M ��°�� ��� �����
			for(int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
			sb.append('\n');
		}
		else {
			for(int cand = 1; cand <= N; cand++) {
				if(used[cand] == 1) continue;
				
				// k ��°�� cand �� �� �� ������	
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
