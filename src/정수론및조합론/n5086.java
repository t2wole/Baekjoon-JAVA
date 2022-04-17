package �����й����շ�;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class n5086 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			
			int first = Integer.parseInt(st.nextToken());
			int second = Integer.parseInt(st.nextToken());
			
			if(first == 0 && second == 0) break;
			
			if(second % first == 0) {
				sb.append("factor\n");
			}
			else if(first % second == 0) {
				sb.append("multiple\n");
			}
			else {
				sb.append("neither\n");
			}
		}
		System.out.println(sb);
	}

}
