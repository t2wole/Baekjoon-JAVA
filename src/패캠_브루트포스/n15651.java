package ��ķ_���Ʈ����;

import java.util.Scanner;

public class n15651 {
	static StringBuilder sb = new StringBuilder();
	
	static void input() {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		M = sc.nextInt();
		selected = new int[M + 1];
	}
	
	static int N, M;
	static int[] selected;
	
	// ���� M ���� ���� ��   => ���ǿ� �´� Ž���� �� ���� ������ ��!
    // ���� M ���� ���� ���� => k ��°���� M��° ���Ҹ� ���ǿ� �°� ���� ��� ����� �õ��Ѵ�.
	static void rec_func(int k) {
		if(k == M + 1) {	// ��� ������� �ǹ�
			for(int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
			sb.append('\n');
		}
		else {
			for(int cand = 1; cand <= N; cand++) {
				// k��°�� cand�� �� �� �ִٸ�
				selected[k] = cand;
				
				// k+1 ������ M������ ä���ִ� �Լ� ȣ��
				rec_func(k+1);
				selected[k] = 0;
				
			}
		}
	}

	public static void main(String[] args) {
		input();
		
		rec_func(1);	// k�� 1����
		System.out.println(sb.toString());
	}
}
