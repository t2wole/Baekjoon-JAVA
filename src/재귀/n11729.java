package ���;

import java.io.*;
import java.util.*;

public class n11729 {

	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		sb.append((int)(Math.pow(2, n) - 1)).append('\n');
		
		hanoi(n, 1, 2, 3);
		System.out.println(sb);
	}
	
	//	n : ������ ����
	//	start : �����
	//	mid : �ű�� ���� �̵��ؾ� �ϴ� ���
	//	to : ������
	
	public static void hanoi(int n, int start, int mid, int to) {
		
		// �̵��� ������ ���� �Ѱ����
		if(n == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		
		// A -> C�� �ű�ٰ� ������ ��,
		// STEP 1 : N-1���� A���� B�� �̵� (= start ������ N-1���� ������ mid �������� �ű��.)
		hanoi(n - 1, start, to, mid);
		    
		// STEP 2 : 1���� A���� C�� �̵� (= start ������ N��° ������ to�������� �ű��.)
		sb.append(start + " " + to + "\n");
		    
		// STEP 3 : N-1���� B���� C�� �̵� (= mid ������ N-1���� ������ to �������� �ű��.)
		hanoi(n - 1, mid, start, to);
	}

}











