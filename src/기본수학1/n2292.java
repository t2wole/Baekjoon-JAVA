package 기본수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class n2292 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		int count = 1;	//시작하는 1도 카운트해서 더해지기에
		int range = 2;	//n == 1 이후부터 계산
		
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
