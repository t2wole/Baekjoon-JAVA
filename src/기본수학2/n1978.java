package �⺻����2;

import java.util.Scanner;

public class n1978 {

	public static void main(String[] args) {
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			boolean isPrime = true;	// �Ҽ��� true, �ƴϸ� false
			int num = sc.nextInt();
			
			if(num == 1) {	// 1�� �Ҽ��� �ƴ�
				continue;
			}
		
			for(int j = 2; j <= Math.sqrt(num); j++) {
				if(num % j == 0) {
					isPrime = false;
					break;
				}
			}
		
			if(isPrime) {
				count++;
			}
		
		}
		System.out.println(count);
	}

}
