package �⺻����1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2292 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 1;	//�����ϴ� 1�� ī��Ʈ�ؼ� �������⿡
		int range = 2;	//n == 1 ���ĺ��� ���
		
		if(n == 1) {
			System.out.println("1");
		}
		else {
			while(range <= n) {
				range = range + (6 * count);
				count++;
			}
			System.out.println(count);
		}
		
	}

}
