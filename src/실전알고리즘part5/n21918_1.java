package �����˰���part5;

import java.util.Scanner;

public class n21918_1 {

	public static int n, m;
	
	public static int[] arr = new int[4001];
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		// ���� �迭 �ʱ�ȭ
		for(int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// �� ��ɾ �Է� ������ ó��
		for(int j = 0; j < m; j++) {
			int a, b, c;
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			oper(a, b, c);
		}
		
		// ���� �迭 ���
		for(int i = 1; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void oper(int a, int b, int c) {
		if(a == 1) {
			arr[b] = c;
		}
		else if(a == 2) {
			for(int i = b; i <= c; i++) {
				if(arr[i] == 0) arr[i] = 1;
				else arr[i] = 0;
			}
		}
		else if(a == 3) {
			for(int i = b; i <= c; i++) {
				arr[i] = 0;
			}
		}
		else if(a == 4) {
			for(int i =b; i <= c; i++) {
				arr[i] = 1;
			}
		}
	}
}



















