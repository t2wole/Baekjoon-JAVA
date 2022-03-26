package ���ڿ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class n10809 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[26];
		
		Arrays.fill(arr, -1); 	// ��� -1�� �ʱ�ȭ
		
		String S = br.readLine();
		
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			
			if(arr[ch - 'a'] == -1) {	//��簪�� -1�� �ʱ�ȭ���̴ϱ� 
				arr[ch - 'a'] = i;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
