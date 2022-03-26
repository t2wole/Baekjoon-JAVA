package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n10809 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		
		Arrays.fill(arr, -1); 	// 모두 -1로 초기화
		
		String S = br.readLine();
		
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			
			if(arr[ch - 'a'] == -1) {	//모든값이 -1로 초기화중이니까 
				arr[ch - 'a'] = i;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
