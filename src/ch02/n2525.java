package ch02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n2525 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		
		int h = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int c = Integer.parseInt(br.readLine());

		h += c / 60;
		m += c % 60;

		if(m >= 60) {
			h += 1;
			m -= 60;
		}
		
		if(h >= 24) {
			h -= 24;
		}
		
		System.out.println(h + " " + m);
	}
}
