package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1316 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	public static void main(String[] args) throws IOException {
				
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			if(check()) {	// check() == true 와 같다.
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;					// 이전문자
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);	// 현재문자
			
			if(prev != now) {
				
				// 해당 문자가 처음 나오는 경우(false 경우)
				if(!check[now - 'a']) {
					check[now - 'a'] = true;
					prev = now;
				}
				
				// 해당 문자가 이전에도 나왔다면
				else {
					return false;
				}
			}
		}
		return true;
	}
}
