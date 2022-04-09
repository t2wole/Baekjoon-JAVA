package 브루트포스;

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
					arr[i][j] = true;	// w일때는 true
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
		
		boolean TF = arr[x][y];	// 첫 번째 칸의 색
		
		for(int i = x; i < end_x; i++) {
			for(int j = y; j < end_y; j++) {
				
				//올바른 색이 아닐경우 count 1중가
				if(arr[i][j] != TF) {
					count++;
				}
				// 한 칸 마다 색이 바뀌니까
				// true면 false로, false면 true로
				TF = !TF;
			}
			TF = !TF;
		}
		/* 첫 번째 칸부터 색칠 할 최소의 개수는 count 라고 하면(8 * 8 = 64)
		 * 색칠 할 개수( 64 - count) 중 최솟값
		 */
		count = Math.min(count, 64 - count);
		min = Math.min(min, count);
	}
}













