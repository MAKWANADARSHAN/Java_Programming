package numbersystem;

public class IsDisariumNo {
	public static int countNum(int numumber) {
		int num = numumber;
		int count = 0;
		while (num > 0) {

			count++;
			num /= 10;
		}
		return count;
	}

	public static int power(int p, int n) {
		int res = 1;
		for (int i = 0; i < n; i++) {
			res *= p;
		}
		return res;
	}

	static boolean isDisarium(int num) {
		int org = num;
		int sum = 0;
		int digit = countNum(num);
		int j = digit;
		for (int i = 1; i <= j; i++) {

			sum += power(num % 10, digit);
			num /= 10;
			digit--;
		}

		return sum == org;
	}

	public static void main(String[] args) {
		int n = 85;
		System.out.println(isDisarium(n));
	}

}
