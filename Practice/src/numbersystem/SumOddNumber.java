package numbersystem;

public class SumOddNumber {
	public static void main(String[] args) {
		int sum = 0;
		int n = 50;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0)
				sum += i;

		}
//		for (int i = 1; i <= n; i += 2) {
//			sum += i;
//		}
		System.out.println(sum);
	}
}
