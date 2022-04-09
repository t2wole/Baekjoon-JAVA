package ���Ʈ����;

import java.io.*;
import java.util.*;

public class n1018 {

	public static boolean[][] arr;
	public static int min = 64;
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			String str = br.readLine();
			
			for(int j = 0; j < m; j++) {
				if(str.charAt(j) == 'W') {
					arr[i][j] = true;	// w�϶��� true
				}
				else {
					arr[i][j] = false;
				}
			}
		}
		
		int row = n - 7;
		int col = m - 7;
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				find(i, j);
			}
		}
		System.out.println(min);
	}
		
	public static void find(int x, int y) {
		int end_x = x + 8;
		int end_y = y + 8;
		int count = 0;
		
		boolean TF = arr[x][y];	// ù ��° ĭ�� ��
		
		for(int i = x; i < end_x; i++) {
			for(int j = y; j < end_y; j++) {
				
				if(arr[i][j] != TF) {	//�ùٸ� ���� �ƴҰ�� count 1�߰�
					count++;
				}
				// �� ĭ ���� ���� �ٲ�ϱ� true�� false��, false�� true��
				TF = !TF;
			}
			TF = !TF;
		}
		// ù ��° ĭ���� ��ĥ �� �ּ��� ������ count ��� �ϸ�(8 * 8 = 64)
		// ��ĥ �� ����( 64 - count) �� �ּڰ� 
		count = Math.min(count, 64 - count);
		min = Math.min(min, count);
	}
}













