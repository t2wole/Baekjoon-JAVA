package 실전알고리즘part5;

import java.util.Scanner;

public class n21919 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int n = sc.nextInt();		
		long ans = 1;
		
		for(int i = 0; i < n; i++) {
			long x = sc.nextInt();
			if(isPrime(x)) ans = LCM(ans, x);			
		}	
		if(ans == 1) System.out.println(-1);
		else System.out.println(ans);		
	}
	
	static boolean isPrime(long x) {
		for(long i = 2; i * i <= x; i++) {
			if(x % i == 0) return false;			
		}
		return true;
	}
	
	static long GCD(long a, long b) {
		while(b != 0) {
			long temp = a % b;
			a = b;
			b = temp;
		}
		return a;
	}

	static long LCM(long a, long b) {
		return a / GCD(a, b) * b;
	}
}























