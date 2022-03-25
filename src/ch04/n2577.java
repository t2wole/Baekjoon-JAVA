package ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2577 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a =Integer.parseInt(br.readLine());
		int b =Integer.parseInt(br.readLine());
		int c =Integer.parseInt(br.readLine());
	
		int[] arr = new int[10];
		int result = a * b * c;
		
		while(result > 0) {
			arr[result % 10]++;
			result /= 10;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
