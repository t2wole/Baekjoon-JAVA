package ���ڿ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1316 {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	
	public static void main(String[] args) throws IOException {
				
		int n = Integer.parseInt(br.readLine());
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			if(check()) {	// check() == true �� ����.
				count++;
			}
		}
		System.out.println(count);
	}
	
	public static boolean check() throws IOException {
		boolean[] check = new boolean[26];
		int prev = 0;					// ��������
		String str = br.readLine();
		
		for(int i = 0; i < str.length(); i++) {
			int now = str.charAt(i);	// ���繮��
			
			if(prev != now) {
				
				// �ش� ���ڰ� ó�� ������ ���(false ���)
				if(!check[now - 'a']) {
					check[now - 'a'] = true;
					prev = now;
				}
				
				// �ش� ���ڰ� �������� ���Դٸ�
				else {
					return false;
				}
			}
		}
		return true;
	}
}
