package numbersystem;

public class SumOfDigitUntilSingle {
//	static int sumOfDigit(int n) {
//		int sum = 0;
//		while (n > 0) {
//			sum += n % 10;
//			n /= 10;
//		}
//		return sum;
//	}

	static int sumOfDigitUntil(int num) {

		while (num > 9) {
			int sum = 0;
			while (num > 0) {
				sum += num % 10;
				num /= 10;
			}
			num = sum;
		}
		return num;
	}

	public static void main(String[] args) {
		int n = 124;
		System.out.println(sumOfDigitUntil(n));
	}

}
