package 巩磊凯;

import java.util.Scanner;

public class n2941 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		int count = 0;
		
		for(int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			
			if(ch == 'c') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {		// c= 老锭
						i++;
					}
					else if(str.charAt(i + 1) == '-') {	// c- 老锭
						i++;
					}
				}
			}
			
			else if(ch == 'd') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'z') {		// dz= 老锭
						if(i < str.length() -2) {
							if(str.charAt(i + 2) == '=') {
								i += 2;
							}
						}
					}
					
					else if(str.charAt(i + 1) == '-') {	// d- 老锭
						i++;
					}
				}
			}
			
			else if(ch == 'l') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {		// lj 老 版快
						i++;
					}
				}
			}
			
			else if(ch == 'n') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == 'j') {		// nj 老 版快
						i++;
					}
				}
			}
			
			else if(ch == 's') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {		// s= 老 版快
						i++;
					}
				}
		    }
			
			else if(ch == 'z') {
				if(i < str.length() - 1) {
					if(str.charAt(i + 1) == '=') {		// z= 老 版快
						i++;
					}
				}
			}
		
			count++;	
		}
		
		System.out.println(count);
	}

}
