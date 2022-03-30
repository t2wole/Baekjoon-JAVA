package 기본수학2;

import java.util.Scanner;

public class n1978 {

	public static void main(String[] args) {
		
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			boolean isPrime = true;	// 소수면 true, 아니면 false
			int num = sc.nextInt();
			
			if(num == 1) {	// 1은 소수가 아님
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
