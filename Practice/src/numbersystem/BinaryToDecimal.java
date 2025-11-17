package numbersystem;

public class BinaryToDecimal {

	public static int pow(int p, int q) {
		int total = 1;
		for (int i = 1; i <= q; i++) {
			total *= p;
		}
		return total;
	}

	public static int binToDec(int num) {
		int sum = 0;
		int count = 0;
		while (num > 0) {
			sum = sum + (num % 10 * pow(2, count));
			num /= 10;
			count++;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 1101;
		System.out.println(binToDec(n));
	}

}
