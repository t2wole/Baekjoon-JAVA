package �������迭;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class n10818 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int count = 0;
		int[] arr = new int[n];
		
		while(st.hasMoreTokens()) {	//StringTokenizer�� ��ū�� ���Ҵٸ� true, �ƴϸ� false			
			arr[count] = Integer.parseInt(st.nextToken());
			count++;
		}
		
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[n-1]);

	}

}
