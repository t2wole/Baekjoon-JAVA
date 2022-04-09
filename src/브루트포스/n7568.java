package 브루트포스;
import java.util.*;
import java.io.*;

public class n7568 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[N][2];
		
		String[] str;
		
		for(int i = 0; i < N; i++) {
			str = br.readLine().split(" ");
			arr[i][0] = Integer.parseInt(str[0]);	// [i][0] : 몸무게
			arr[i][1] = Integer.parseInt(str[1]);	// [i][1] : 키
		}
		
		for(int i = 0; i < N; i++) {
			int rank = 1;
			
			for(int j = 0; j < N; j++) {
				if(i == j) continue;
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
			sb.append(rank).append(' ');
		}
		System.out.println(sb);
	}
}

