package ÆÐÄ·_ÀÌºÐÅ½»ö;

import java.io.*;
import java.util.*;

public class n1764 {
	
	static int n, m;
	static HashSet<String> hs = new HashSet<String>();
	static ArrayList<String> ans = new ArrayList<String>();
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < n; i++) {
			hs.add(br.readLine());
		}
		
		for(int i = 0; i < m; i++) {
			String str = br.readLine();
			if(hs.contains(str)) {
				ans.add(str);
			}
		}
		
		Collections.sort(ans);
		System.out.println(ans.size());
		for(int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}
}
