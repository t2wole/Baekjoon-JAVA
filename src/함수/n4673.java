package 함수;

public class n4673 {

	public static int d(int number) {
		int sum = number;		// 처음에 1234라고 가정
		
		while(number != 0) {
			sum += number % 10;	// 1234 + 4 + 3 + 2 + 1 이 될거임
			number /= 10;		// 숫자는 1234 -> 123 -> 12 -> 1
		}
		return sum;
	}

	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		
		for(int i = 1; i < 10001; i++) {
			int n = d(i);
			
			if(n < 10001) {
				check[n] = true;
			}
		}	
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			if(!check[i]) {	//check[i] = false 인 인덱스만 출력한다
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
