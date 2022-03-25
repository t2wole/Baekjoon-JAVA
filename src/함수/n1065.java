package 함수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n1065 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print(ap(Integer.parseInt(br.readLine())));
	}
	
	public static int ap(int num) {
		int count = 0; // 한수의 갯수
		
		if(num < 100) {
			return num;	// 100보다 작은 수는 모두 한수임
		}
		
		else {
			count = 99;	// 100 ~ 999 중에서 count를 1 ~ 99인 99로 초기화
			if(num == 1000) { //1000 이상은 예외처리
				num = 999;
			}
			
			for(int i = 100; i <= num; i++) {
				int hun = i / 100; 			//백의 자릿수
				int ten = (i / 10) % 10;	//십의 자릿수
				int one = i % 10;			//일의 자릿수
				
				if((hun - ten) == (ten - one)) {
					count++;
				}
			}		
		}
		return count;	
	}
}
