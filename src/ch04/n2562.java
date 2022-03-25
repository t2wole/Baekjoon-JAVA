package ch04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2562 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int index = 0;
		int max = 0;
		
		for(int i = 0; i < 9; i++) {
			int n = Integer.parseInt(br.readLine());
			
			if(n > max) {
				max = n;
				index = i + 1;	
			}		
		}
		
		System.out.println(max);
		System.out.println(index);

	}

}
	