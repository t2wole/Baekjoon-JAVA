package ���;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n10872 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int n = Integer.parseInt(br.readLine());
		
		int sum = 1; // ���� ���� ���� ���丮�� 0 -> 1��
		
		while(n != 0) {
			sum = sum * n;
			n--;
		}
		System.out.println(sum);
	}

}
