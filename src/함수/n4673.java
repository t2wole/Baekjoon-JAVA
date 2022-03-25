package �Լ�;

public class n4673 {

	public static int d(int number) {
		int sum = number;		// ó���� 1234��� ����
		
		while(number != 0) {
			sum += number % 10;	// 1234 + 4 + 3 + 2 + 1 �� �ɰ���
			number /= 10;		// ���ڴ� 1234 -> 123 -> 12 -> 1
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
			if(!check[i]) {	//check[i] = false �� �ε����� ����Ѵ�
				sb.append(i).append("\n");
			}
		}
		
		System.out.println(sb);
	}
}
