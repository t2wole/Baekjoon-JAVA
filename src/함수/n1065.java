package �Լ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1065 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(ap(Integer.parseInt(br.readLine())));
	}
	
	public static int ap(int num) {
		int count = 0; // �Ѽ��� ����
		
		if(num < 100) {
			return num;	// 100���� ���� ���� ��� �Ѽ���
		}
		
		else {
			count = 99;	// 100 ~ 999 �߿��� count�� 1 ~ 99�� 99�� �ʱ�ȭ
			if(num == 1000) { //1000 �̻��� ����ó��
				num = 999;
			}
			
			for(int i = 100; i <= num; i++) {
				int hun = i / 100; 			//���� �ڸ���
				int ten = (i / 10) % 10;	//���� �ڸ���
				int one = i % 10;			//���� �ڸ���
				
				if((hun - ten) == (ten - one)) {
					count++;
				}
			}		
		}
		return count;	
	}
}
